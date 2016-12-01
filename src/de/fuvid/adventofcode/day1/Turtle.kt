package de.fuvid.adventofcode.day1

import java.util.*


enum class Direction {
    N {
        override fun turnR(): Direction {
            return E
        }
        override fun turnL(): Direction {
            return W
        }
    },E{
        override fun turnR(): Direction {
            return S
        }
        override fun turnL(): Direction {
            return N
        }
    },S{
        override fun turnR(): Direction {
            return W
        }
        override fun turnL(): Direction {
            return E
        }
    },W{
        override fun turnR(): Direction {
            return N
        }
        override fun turnL(): Direction {
            return S
        }
    };
    abstract fun turnR(): Direction
    abstract fun turnL(): Direction
}
class Position(var x: Int, var y: Int) {

    fun go(dir :Direction, steps:Int){
        when(dir){
            Direction.N -> y += steps
            Direction.E -> x += steps
            Direction.S -> y -= steps
            Direction.W -> x -= steps
        }
    }

    override fun equals(other: Any?): Boolean {
        when(other){
            is Position -> return other.x== x&& other.y==y
        }

        return super.equals(other);
    }
}
class Turtle(val visitonce: Boolean) {
    var looking : Direction = Direction.N
    var position:Position = Position(x= 0, y = 0)
    var visited : MutableList<Position> = ArrayList()
    fun walk(steps: Int){
        for(i in 1..steps){
            val here = Position(position.x, position.y )
            if (visited.contains(here)&&visitonce)
                {
                    print("stop")
                    break
                }else{
                    visited.add(here)
                    position.go(looking,1 )
            }
        }
    }

    fun turnL(){
        looking = looking.turnL()
    }
    fun turnR(){
        looking = looking.turnR()
    }
}
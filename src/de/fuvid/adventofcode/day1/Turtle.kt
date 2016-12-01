package de.amore.david.adventofcode.day1

import jdk.nashorn.internal.runtime.ScriptRuntime

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
            return E
        }
        override fun turnL(): Direction {
            return W
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
class Position{
    var x=0
    var y=0
    fun go(dir :Direction, steps:Int){
        when(dir){
            Direction.N -> y+= steps
            Direction.E -> x+= steps
            Direction.S -> y-= steps
            Direction.W -> x-= steps
        }
    }
}
class Turtle{
    var looking : Direction = Direction.N

    var position:Position = Position()

    fun walk(steps: Int) = position.go(looking,steps )
    fun turnL(){
        looking = looking.turnL()
    }
    fun turnR(){
        looking = looking.turnR()
    }
}
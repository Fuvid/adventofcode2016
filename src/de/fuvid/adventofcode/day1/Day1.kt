package de.fuvid.adventofcode.day1

/**
 * Created by david.amore on 01.12.16.
 */
fun step1(){
    val input ="R1, R3, L2, L5, L2, L1, R3, L4, R2, L2, L4, R2, L1, R1, L2, R3, L1, L4, R2, L5, R3, R4, L1, R2, L1, R3, L4, R5, L4, L5, R5, L3, R2, L3, L3, R1, R3, L4, R2, R5, L4, R1, L1, L1, R5, L2, R1, L2, R188, L5, L3, R5, R1, L2, L4, R3, R5, L3, R3, R45, L4, R4, R72, R2, R3, L1, R1, L1, L1, R192, L1, L1, L1, L4, R1, L2, L5, L3, R5, L3, R3, L4, L3, R1, R4, L2, R2, R3, L5, R3, L1, R1, R4, L2, L3, R1, R3, L4, L3, L4, L2, L2, R1, R3, L5, L1, R4, R2, L4, L1, R3, R3, R1, L5, L2, R4, R4, R2, R1, R5, R5, L4, L1, R5, R3, R4, R5, R3, L1, L2, L4, R1, R4, R5, L2, L3, R4, L4, R2, L2, L4, L2, R5, R1, R4, R3, R5, L4, L4, L5, L5, R3, R4, L1, L3, R2, L2, R1, L3, L5, R5, R5, R3, L4, L2, R4, R5, R1, R4, L3"

    val commands =input.split(",").map(String::trim)
    val t : Turtle = Turtle(false);
    print("Starting at x="+t.position.x+ ", y="+t.position.y+"\n")
    for (command in commands){
        if (command.get(0).equals('L')){
            //println("turn left")
            t.turnL()
        }else if (command.get(0).equals('R')){
            // println("turn right")
            t.turnR()
        }
        val steps = command.substring(1).toInt()
        //print("walkin "+steps+" Steps Dir:"+t.looking+"\n")
        print("("+t.position.x+"|"+t.position.y+") ="+t.looking+""+steps+">")
        t.walk(steps)
        println("("+t.position.x+"|"+t.position.y+")")
    }
    println("\nx="+t.position.x+ ", y="+t.position.y)
    println(t.position.x+t.position.y)
}
fun step2(){
    val input ="R1, R3, L2, L5, L2, L1, R3, L4, R2, L2, L4, R2, L1, R1, L2, R3, L1, L4, R2, L5, R3, R4, L1, R2, L1, R3, L4, R5, L4, L5, R5, L3, R2, L3, L3, R1, R3, L4, R2, R5, L4, R1, L1, L1, R5, L2, R1, L2, R188, L5, L3, R5, R1, L2, L4, R3, R5, L3, R3, R45, L4, R4, R72, R2, R3, L1, R1, L1, L1, R192, L1, L1, L1, L4, R1, L2, L5, L3, R5, L3, R3, L4, L3, R1, R4, L2, R2, R3, L5, R3, L1, R1, R4, L2, L3, R1, R3, L4, L3, L4, L2, L2, R1, R3, L5, L1, R4, R2, L4, L1, R3, R3, R1, L5, L2, R4, R4, R2, R1, R5, R5, L4, L1, R5, R3, R4, R5, R3, L1, L2, L4, R1, R4, R5, L2, L3, R4, L4, R2, L2, L4, L2, R5, R1, R4, R3, R5, L4, L4, L5, L5, R3, R4, L1, L3, R2, L2, R1, L3, L5, R5, R5, R3, L4, L2, R4, R5, R1, R4, L3"
    //val input ="R8, R4, R4, R8"
    val commands =input.split(",").map(String::trim)
    val t : Turtle = Turtle(true);
    print("Starting at x="+t.position.x+ ", y="+t.position.y+"\n")
    for (command in commands){
        if (command.get(0).equals('L')){
            //println("turn left")
            t.turnL()
        }else if (command.get(0).equals('R')){
            // println("turn right")
            t.turnR()
        }
        val steps = command.substring(1).toInt()
        //print("walkin "+steps+" Steps Dir:"+t.looking+"\n")
        print("("+t.position.x+"|"+t.position.y+") ="+t.looking+""+steps+">")
        t.walk(steps)
        println("("+t.position.x+"|"+t.position.y+")")
    }
    println("\nx="+t.position.x+ ", y="+t.position.y)
    println(t.position.x+t.position.y)
}

fun main(args: Array<String>){
    step1()
    step2()
}
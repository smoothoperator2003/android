fun ifElseStatement(args: Array<String>) { 
    val age: Int = 10 
    if (age > 18) { 
        print("Adult") 
    } else { 
        print("Minor") 
    } 
} 

fun multipleIfElseStatement(args: Array<String>) { 
    val day = 2 
    val result = when (day) { 
        1 -> "Monday" 
        2 -> "Tuesday" 
        3 -> "Wednesday" 
        4 -> "Thursday" 
        5 -> "Friday" 
        6 -> "Saturday" 
        7 -> "Sunday" 
        else -> "Invalid Day." 
    } 
    println(result) 
} 

fun loopStatement(args: Array<String>) { 
    val fruits = arrayOf("Orange", "Apple", "Mango", "Banana") 
    for (item in fruits) { 
        println(item) 
    } 
} 

fun whileStatement(args: Array<String>) { 
    var i = 5 
    while (i > 0) { 
        println(i) 
        i-- 
    } 
} 

fun doWhileStatement(args: Array<String>) { 
    var i = 5 
    do { 
        println(i) 
        i-- 
    } while (i > 0) 
} 

fun whileLoopStatement(args: Array<String>) { 
    var i = 0 
    while (i++ < 100) { 
        println(i) 
        if (i == 3) { 
            break 
        } 
    } 
} 

fun whileLoopStatement(args: Array<String>) { 
    var i = 0 
    while (i++ < 6) { 
        if (i == 3) { 
            continue 
        } 
        println(i) 
    } 
} 

fun main(args: Array<String>) {
	println("Anonymous")
}
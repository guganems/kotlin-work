fun main(args: Array<String>) {
    val a = 'a'
    val b = "b"

    printDataType(a)
    printDataType(b)
}

fun<T> printDataType(x: T){
    when(x){
        is Short -> println(x.toString() + " is Short")
        is Int -> println(x.toString() + " is Integer")
        is Long -> println(x.toString() + " is Long")
        is Float -> println(x.toString() + " is Float")
        is Double -> println(x.toString() + " is Double")
        is Char -> println(x.toString() + " is Character")
        is String -> println(x.toString() + " is String")
        is Byte -> println(x.toString() + " is Byte")
    }
}
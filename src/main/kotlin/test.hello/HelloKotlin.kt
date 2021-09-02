package test.hello

class Person {
    fun hello(){
        println("Hello world")
    }
}
class HelloKotlin {
    fun hello(){
        println("Hello kotlin")
    }
}

fun main(args: Array<String>) {
    val p = Person()
    p.hello()
    HelloKotlin().hello()
}
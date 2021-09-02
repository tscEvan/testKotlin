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
    var age : Float=25f
    var name:String
    name="Kevin"
    println(age.toString()+ name)

}
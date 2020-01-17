/**
 *
 * @author Marwa N. Jarada
 * @date 17.1.2020
 * @summary: Function syntax in kotlin
 */
fun main(args: Array<String>) {
    myFunction()
    sum(5,6)
    // Create a person object
    val person=Person("Marwa",20,"Android Developer")
    println(person.name)
}
fun myFunction(){
    println("Function called")
}
fun sum(firstNum:Int,secondNum:Int){
    var sum=firstNum+secondNum
    println("The sum ="+sum)
}
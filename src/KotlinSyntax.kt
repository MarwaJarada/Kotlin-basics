/**
 *
 * @author Marwa N. Jarada
 * @date 15.1.2020
 */
fun main(args: Array<String>) {


    //Variables

    var x=5
    val  pi =3.14 // This variable can'nt be change (conistatnt) if we could change it's value next, we'll usw var rather than val
    var age=27
    var sum=x+pi
    var fname:String="Marwa" // Predefined variable, used when we want to define a spesific datatype
    var lname="Jarada"
    var concatName=fname+" "+lname
    println(age)
    println(sum)
    println(concatName)


    //Array

    //1:

    var myArray= arrayOfNulls<String>(10); // Determine the content type and the size of array, classical way
    myArray[0]="Marwa"
    myArray[1]= "Nisreen"


    //2:

    var arrayOfNumbers= intArrayOf(10,20,30)
    println(arrayOfNumbers.get(2))
    arrayOfNumbers.set(2,50) //Replace the number in index 2 from 30 into 50
    println(arrayOfNumbers.get(2)) // Replacing done sucsessfully


    //List "kind of array but more flexible, more general"
    var myList=ArrayList<String>()
    myList.add("index0")
    myList.add("index1")
    println(myList)
    myList.set(1,"Index(1) replaced")
    println(myList)
    myList.add(1,"previous Index(1) moved")
    println(myList)
}

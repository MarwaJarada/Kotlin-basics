/**
 *
 * @author Marwa N. Jarada
 * @date 15.1.2020
 * @summary: This is a quick summery about kotlin syntax and main differences between Kotlin and Java syntax
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


    //Sets "To store unique values"

    var mySet=HashSet<String>()
    mySet.add("Tamer")
    mySet.add("Mahmood")
    mySet.add("Tamer")// set will ignore storing this
    println(mySet.size)// = 2 because it store a unique variables


    //Maps "Generally used in internet data"

    var myHashMap=HashMap<String,String>() // Consist of key and value
    myHashMap.set("name","Marwa")
    myHashMap.set("university","IUG")
    println(myHashMap["name"])// = Marwa


    //Special operator

    println(age>x)// 27>5 is true
    println(age==x)// 27=5 is false

    //If statment: same as Java syntax
    /**
     * if(condition){
     *
     *      if condition true this code will run
     *      code..
     *
     * }else if(another condition){
     *      code..
     *
     * }else{
     *      any other cases
     *
     *      code..
     * }
     *
     * */

    //When: does same as switch case in Java
    val dayNum=2
    var dayString=""
    when(dayNum){
        1->dayString="Monday" // when dayNum==1 , assign value "Monday" into dayString variable
        2->dayString="Tuesday"
        3->dayString="Wednesday"
        4->dayString="Thursday"
        else->dayString="Friday"
        // ...
    }
    println(dayString)


    //For loop

    val myIntArray= intArrayOf(20,25,30,35)
    for (number in myIntArray){
        print(""+number+" ") // Every one loop , number variable will take a value of the array
        // first loop : number=20
    }

    //While loop: same as Java syntax
    /**
     * while(condition){
     *  code...
     *  } 
     */



}

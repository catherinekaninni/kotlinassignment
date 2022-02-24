fun main(){
    greeting("catherine")
    modulus(45,2)
    addition(25,15,20,25)
    interestingfact("i love swimming")
}
//create and invoke a function that takes in a name and prints out,"hello"and{name}
fun greeting(name:String){
    var name=("hello " +name)
    println(name)

}
//create and invoke a function that given 2 numbers returns the reminder of their division
fun modulus(a:Int,b:Int){
    var modulus=a%b
    println(modulus)
}
//create and invoke a function that returns the sum of any given 4 numbers
fun addition(a:Int,b:Int,c:Int,d:Int){
    var addition=a+b+c+d
    println(addition)
}
//create and invoke a function that prints out an interesting fact about yourself
fun interestingfact(name:String){
    var interestingfact="i love swimming"
    println(interestingfact)
}

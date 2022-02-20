import java.awt.PageAttributes

fun main(){
 var fullName ="benadate"
    println("Hello"+" "+fullName)
   var y= getmodulus(48,5)
    println(y)
   var x= sumofnumbers(3,6,7,8)
    println(x)
    aboutmyself()

}


fun  fullName(fullName:String):String{
    return fullName
}
fun getmodulus(d:Int, c:Int):Int{
    var modulus =d%c
    return modulus

}
fun sumofnumbers(a:Int,b:Int,c:Int,d: Int):Int {
    var sum = a + b + c + d
    return sum



}
fun aboutmyself(){
    var interesting ="A lady of ability"
    println(interesting)

}


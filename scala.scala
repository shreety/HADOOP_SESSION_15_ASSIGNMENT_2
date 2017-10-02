package secondAssignment

class PartialFunction(ConstantNumber:Int)
{
  def addNumbers(FirstNumber:Int,SecondNumber:Int): Int
  = {
    return (ConstantNumber + FirstNumber + SecondNumber)
  }
  def SquareNumber(f:(Int,Int) => Int, Num1:Int,Num2:Int) :Int = {
    return (f(Num1,Num2) * f(Num1,Num2))
  }
}

object secondAssignment
{
  def main(args:Array[String]){ 
  var Squared_number= new PartialFunction(3)
  println("First numbr is 3 second Number is 4 and last number is 8")
  println("Square of number is :")
  println(Squared_number.SquareNumber(Squared_number.addNumbers,4,8))
  }
}
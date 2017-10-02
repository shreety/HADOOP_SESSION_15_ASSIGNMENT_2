class MatchImplementation(CourseName: String)
{
  CourseName match {
    case "Android" => println("Course name is Android and price is 12999")
    case "Big Data Development" => println("Course name is Big Data Development and price is 17999")
    case "Spark" => println("Course name is Spark and price is 19999")
    case _ => println("Other Course name")
  }
}

object MatchImplementation{
  
  def main(args: Array[String]):Unit= {
    var MatchObj= new MatchImplementation("Spark")
  }
}


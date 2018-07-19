object draft {
  import scala.math._
  def main(args: Array[String]) :Unit = {
    val n = 600851475143L; var flag = false; var loop = true; var i = n/3
    var target = 6857
    for (i <- 3 to sqrt(i).toInt by 2){
      if (target%i == 0){
        println("no: " + i)
      }
    }
  }
}
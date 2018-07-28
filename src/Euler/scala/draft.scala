object draft {
  import scala.math._
  def main(args: Array[String]) :Unit = {
    var i = 9009
    val s = i.toString
    println(s.substring(0, s.length/2))
    println(s.substring(ceil(s.length/2.0).toInt, s.length))
  }
}
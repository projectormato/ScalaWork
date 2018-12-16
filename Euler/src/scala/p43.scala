import scala.util.control.Breaks

object p43 extends App {
//  var target = "";var num = ListBuffer(1,2,3,4,5,6,7,8,9,0);
  val num = List(1,2,3,5,7,11,13,17); val b = new Breaks; var flag = true
  val per = (0 to 9).toList.permutations.toList
  for (i <- per.indices) {
    val target = per(i).mkString("")
    b.breakable {
      for (j <- 1 to 7) {
        flag = true
        if (target.substring(j, j + 3).toInt % num(j) != 0) {
          flag = false
          b.break
        }
      }
    }
    if (flag) println(target + "!!!")
//    println(target)
  }
  println("1406357289".substring(1, 1+3))
}
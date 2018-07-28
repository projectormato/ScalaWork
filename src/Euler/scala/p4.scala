import scala.math.ceil

object p4 {
  def main(args: Array[String]) :Unit = {
    //999*999 から順番に全部試す
    var res, ans = 0; var s, right, left = ""
    for (i <- 999 to 1 by -1){
      for (j <- 999 to 1 by -1){
        res = i * j;
        s = res.toString
        left = s.substring(0, s.length/2)
        right = s.substring(ceil(s.length/2.0).toInt, s.length).reverse
//        println(right + " " + left)
        if (right == left){
          if (res > ans){
            println(res)
            ans = res
          }
        }
      }
    }
  }
}

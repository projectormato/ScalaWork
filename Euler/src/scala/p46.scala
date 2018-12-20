import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks

object p46 extends App {
  var sosuu = ListBuffer[Int](); var falg = true; var n = 1; val b = new Breaks; var res = true
  b.breakable {
    for (i <- 3 to 100000 by 2) {
      falg = true
      for (j <- 3 to Math.sqrt(i).toInt by 2) {
        if (i % j == 0) {
          //奇合成数なので表せるかをためす
          n = 1
          res = true
          while (i >= 2*Math.pow(n, 2)) { //iより大きくなるまで試す
            if (sosuu.contains(i - 2*Math.pow(n, 2).toInt)) res = false //残りが素数
            n += 1
          }
          if (res) {
            println("wao" + i)
            b.break
          }
          falg = false
        }
      }
      if (falg) sosuu = sosuu :+ i
      if (i % 99 == 0) println(i)
    }
  }
}
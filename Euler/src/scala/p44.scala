import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks

object p44 extends App {
  var sansaku: ListBuffer[Int] = ListBuffer(); var n = 1; val b = new Breaks;
  b.breakable {
    while (true) {
      val now = n * (3 * n - 1) / 2
      for (i <- sansaku.length-1 to 0 by -1) {
        if (((Math.sqrt(24 * (now + sansaku(i) + 1)) + 1) / 6) % 1 == 0.0) {
          if (sansaku.contains(now-sansaku(i))) {
            println(now, sansaku(i))
            b.break()
          }

        }
      }
      sansaku = sansaku :+ now
      n += 1
    }
  }
}
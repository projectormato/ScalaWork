import scala.util.control.Breaks

object p45 extends App {
  var n: Long = 143L; val b = new Breaks
  b.breakable {
    while (true) {
      n += 1L
      val rokkaku = n * (2*n-1)
      if ((Math.sqrt(24 * rokkaku +1)+1)/6%1 == 0.0  ) {
        if ((Math.sqrt(8 * rokkaku +1)-1)/2%1 == 0.0  ) {
          println(rokkaku, n)
        }
      }
    }
  }

}
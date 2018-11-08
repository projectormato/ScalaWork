import scala.collection.mutable.ListBuffer

object p21 extends App {
  var divisor = ListBuffer.fill(10001)(0)
  var sum = 0; var result = 0

  for (i <- 1 until divisor.length){
    sum = 0
    for (j <- 1 until i){
      if (i % j == 0) sum += j
    }
    divisor(i) = sum
  }

  for (i <- 1 until divisor.length) {
    if ( divisor.length >= divisor(i) ){
      if ( i == divisor(divisor(i)) ){
        if (i != divisor(i)) result += i
        println(i, divisor(i))
      }
    }
  }
  println(result)
}
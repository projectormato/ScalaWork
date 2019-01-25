import scala.collection.mutable.ListBuffer

object p23 extends App {
  var excess = ListBuffer.empty[Int]
  var sub = ListBuffer.empty[Int]
  var sum = 0; var result:Long = 0L
  for (i <-1 to 28123){
    result += i
    for(j <-1 to i/2){
      if (i % j == 0) sum += j
    }
    if (sum > i) excess += i
    sum = 0
  }
  println(result)
  for (i <- excess.indices){
   sum = excess(i)*2
    if (!sub.exists(_>sum)){
      result -= sum
      sub += sum
    }
    sum = 0
  }
  println(excess)
  println(sub)
  println(result)
}
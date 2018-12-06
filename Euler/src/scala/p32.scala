import scala.collection.mutable.ListBuffer

object p32 extends App {
  val pandigital = "123456789"
  var pandigitalList: ListBuffer[Int] = ListBuffer(); var res = 0
  for (i <- 1 to 100; j <- 1 to 10000){
    val target = i.toString + j.toString + (i*j).toString
    if (target.sorted == pandigital && !pandigitalList.contains(i*j)){
      println(i,j,i*j)
      pandigitalList = pandigitalList :+ i*j
      res += i*j
    }
  }
  println(res)
}
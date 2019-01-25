import scala.collection.mutable.ListBuffer

object p34 extends App {
  var kaijouList: ListBuffer[Long] = ListBuffer(1,1)
  for (i <- 2 to 200) {
    kaijouList = kaijouList :+ kaijouList.last * i
  }
  println(kaijouList)

  for (i <- 1 to 5000000) {
    val s = i.toString; var sum:Long = 0
    for (j <- 0 until s.length){
      sum += kaijouList(s(j)-48)
    }
    if (i == sum) println(i)
  }
}
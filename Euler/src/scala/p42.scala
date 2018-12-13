import scala.collection.mutable.ListBuffer
import scala.io.Source

object p42 extends App {
  var sankaku: ListBuffer[Int] = ListBuffer[Int]()
  for (i <- 1 to 100) {
    sankaku = sankaku :+ ((i+1)*i)/2
  }
  println(sankaku)
  
  val source = Source.fromFile("./Euler/src/scala/words.txt", "UTF-8")
  var res = 0
  source.getLines.foreach{ line =>
    val target = line.split(",").toList :+ "SKY"; var sum = 0;
    for (i <- target.indices) {
      sum = 0
      for (j <- target(i).indices) {
        sum += target(i)(j) - 64
        if (target(i)(j) == '"') sum += 30
      }
      if (sankaku.contains(sum)) {
        res += 1
        println(target(i))
      }
    }
  }
  source.close()
  println(res)
  println('"'-64)
}
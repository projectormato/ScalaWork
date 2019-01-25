import scala.io.Source

object p22 extends App {
  // ファイルから読み込み
  val source = Source.fromFile("Euler/src/scala/names.txt", "UTF-8") // Shift_JIS, EUC-JP なども可
  var names:List[String] = List[String]()
  var ans:Long = 0L; var sum:Long = 0L
  source.getLines.foreach{ line =>
    names = names ::: line.split(",").toList
    println(line)
  }
  source.close()
  names = names.sorted
  println(names)
  for (i <- names.indices){
    for (j <- names(i).indices){
      if (names(i)(j) != '"') sum += (names(i)(j).toInt - 64)
    }
    sum *= i+1
    ans += sum
    sum = 0
  }
  for (i <- "ZONA".indices){
    sum += "COLIN"(i).toInt - 64
  }
  println(sum, sum*938)
  println(names.length)
  println(ans)
}
package dwango.basic

object Syntax extends App {
  //  1歳から6歳までの就学以前の子どもの場合に“幼児です”と出力し、それ以外の場合は“幼児ではありません”と出力するコードを書いてみましょう。
  var age: Int = 7
  var isSchoolStarted: Boolean = false
  if (age > 6) isSchoolStarted = true
  if (isSchoolStarted) {
    println("幼児ではありません")
  }else {
    println("幼児です")
  }


  //  0から数え上げて9まで出力して10になったらループを終了するメソッド
  def loopFrom0To9(): Unit = {
    var i = 0
    do {
      println(i)
      i += 1
    } while(i < 10)
  }
  loopFrom0To9()

  //  1から1000までの3つの整数a, b, cについて、三辺からなる三角形が直角三角形になるような a, b, cの組み合わせを全て出力してください。
  val ansList = for (a <- 1 to 100; b <- 1 to 100; c <- 1 to 100 if Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)) yield {
    List(a, b, c)
  }
  println(ansList)

  //型のパターンマッチ
  val obj: Any = "hello, world"
  obj match {
    case v: Int =>
      println("this is Int.")
    case v: String =>
      println(v.toUpperCase())
  }

  //  最初と最後の文字が同じ英数字であるランダムな5文字の文字列を1000回出力してください。
  val sameList = for (i <- 0 to 10) yield {
    val target = new scala.util.Random(new java.security.SecureRandom()).alphanumeric.take(5).toList
    target match {
      case List(a, b, c, d, e) =>
        List(a, b, c, d, a)
    }
  }
  println(sameList)
}



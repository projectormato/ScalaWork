package dwango.Function

object Collection extends App {
  // 配列のi番目の要素とj番目の要素を入れ替えるswapArrayメソッドを定義してみましょう。
  def swapArray[T](arr: Array[T])(i: Int, j: Int): Unit = {
    val temp = arr(i)
    arr(i) = arr(j)
    arr(j) = temp
  }
  // Array は mutable(可変)！
  val arr = Array(0, 1, 2, 3)
  println(arr.toList)
  swapArray(arr)(1,2)
  println(arr.toList)

  // mkStringを使って、最初の数startと最後の数endを受け取って、順番に出力する
  def joinByComma(start: Int, end: Int): String = {
    (start to end).mkString(",")
  }
  println(joinByComma(1,5))

  // foldLeftを用いて、Listの要素を反転させる次のシグニチャを持ったメソッドreverseを実装してみましょう
  def reverse[T](list: List[T]): List[T] = {
    list.foldLeft(Nil: List[T])((x, y) => y :: x)
  }
  val list = List(0, 1, 2, 3)
  println(list.reverse)

  // Listの全ての要素を足し合わせるメソッドsumをfoldRightを用いて実装してみましょう。
  def sum(list: List[Int]): Int = {
    list.foldRight(0)((x, y) => x + y)
  }
  println(sum(list))
  println(sum(List()))

  // Listの全ての要素を掛け合わせるメソッドmulをfoldRightを用いて実装してみましょう。
  def mul(list: List[Int]): Int = {
    list.foldRight(1)((x, y) => x * y)
  }
  println(mul(list))

  // mkStringを実装してみましょう。
  def mkString[T](list: List[T])(sep: String): String = {
    // x :: xs は、リストに要素が存在するかをパターンマッチできる
    list match {
      case x :: xs => list.foldLeft("")((x, y) => x + sep + y).drop(1)
      case _ => ""
    }
  }
  println(mkString(list)(","))
  println(mkString(List())(","))

  // 次のシグニチャを持つfilterメソッドをfoldLeftとreverseを使って実装してみましょう
  def filter[T](list: List[T])(f: T => Boolean): List[T] = {
    list.foldLeft(Nil:List[T]){(x, y) => if(f(y)) y::x else x}.reverse
  }
  println(filter(list)(_%2 == 0))

  // 次のシグニチャを持つcountメソッドをfoldLeftを使って実装してみましょう
  def count[T](list: List[T])(f: T => Boolean): Int = {
    list.foldLeft(0)((x, y) => if(f(y)) x+1 else x)
  }
  println(count(list)(_==1))
}
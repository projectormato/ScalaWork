package dwango.Class

// 特徴
// * 複数のトレイトを1つのクラスやトレイトにミックスインできる
// * 直接インスタンス化できない
// * クラスパラメータ（コンストラクタの引数）を取ることができない

trait TraitA {
  val name: String
  def printName(): Unit = println(name)
}

// クラスにして name を上書きする
class ClassA(val name: String) extends TraitA

object ObjectA extends App{
  val a = new ClassA("dwango")
  a.printName()

  // name を上書きするような実装を与えてもよい
  val a2 = new TraitA { val name = "kadokawa" }
  a2.printName()
}
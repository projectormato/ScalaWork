package dwango.Class

// private[this] のものにはアクセス出来ない。
//class Person(name: String, age: Int, private[this] val weight: Int) {
//
//}
class Person(name: String, age: Int, private val weight: Int) {

}

// コンパニオンオブジェクトが同名のクラスに対する特権的なアクセス権を持っている
// private[this] のものにはアクセス出来ない。
object Person extends App{
  def printWeight(): Unit = {
    val taro = new Person("Taro", 20, 70)
    println(taro.weight)
  }
  printWeight()
}





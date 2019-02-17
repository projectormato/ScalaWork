package dwango.Function

object Implicit extends App{
  implicit class RichString(val src: String) {
    def smile: String = src + ":-)"
  }
  println("Hi ".smile)

  //pimp my libraryパターンで、既存のクラスの利用を便利にするようなimplicit conversionを1つ定義してみてください。
  implicit class YenInt(val price: Int) {
    def cost: String = "料金は " + price + " 円です"
  }
  println(100.cost)

}
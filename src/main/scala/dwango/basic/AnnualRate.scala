package dwango.basic

object AnnualRate extends App {
  //Q. ¥3,950,000を年利率2.3％の単利で8か月間借り入れた場合の利息はいくらか（円未満切り捨て）
  val ans = 3950000 * 0.023 * (8/12.0)
  println(ans.asInstanceOf[Int] + "円")

  //  Q. 定価¥1,980,000の商品を値引きして販売したところ、原価1.6％にあたる¥26,400の損失となった。割引額は定価の何パーセントであったか
  val urine = 26400 / 1.6 * 100 - 26400
  val waribiki = 1980000 - urine
  val ritu = waribiki / 1980000.0
  println(ritu*100 + "%")
}

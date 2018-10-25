object p15 extends App {
  val mass = 20; var ans:Long = 1; var kaijou:Long = 1
  for (i <- 1 to mass) {
    kaijou *= i
    ans = ans * (mass*2 - i + 1) / i
  }
  println(ans) // 137846528820
  println(kaijou)
}
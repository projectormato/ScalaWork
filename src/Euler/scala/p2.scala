object p2{
  def main(args: Array[String]): Unit = {
    var arr = Array(1, 2)
    var sum = 0; var ans = 2; var i = 0
    while (4000000 > sum){
      sum = arr(0) + arr(1)
      if (sum % 2 ==0 && 4000000 > sum) ans += sum
      println(sum)
      arr(i%2) = sum
      i += 1
    }
    println(ans)
  }
}
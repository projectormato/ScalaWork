object p14 extends App {
  var ans:Long = 0; var result:Long = 0
  for (i <- 999999 to 13 by -1){
    var num:Long = i
    while (num != 1){
      if (num % 2 == 0){
        num /= 2
        result += 1
      }else{
        num = num*3 + 1
        result += 1
      }
    }
    if (result >= ans){
      ans = result
      println(result, i)
    }
    result = 0
  }
}
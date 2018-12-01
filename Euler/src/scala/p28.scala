object p28 extends App {
  var result: Long = 1L; var sumFlag = 1; var nowCount = 0; var sumCount = 0
  for (i <- 2 to 1002001){
    nowCount += 1
    if (nowCount-1 == sumFlag){
      result += i
      nowCount = 0
      if (sumCount == 3){
        sumFlag += 2
        sumCount = 0
      }else{
        sumCount += 1
      }
    }
  }
  println(result)
}
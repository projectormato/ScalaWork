object p7 extends App {
  var index = 1
  var flag = true
  for (i <- 3 to 150000 by 2){
    for (j <- 3 to Math.sqrt(i).toInt by 2){
      if (i % j == 0){
        flag = false
      }
    }
    if (flag) {
      index += 1
      if (index == 10001) println(index + ": " + i)
    }else{
      flag = true
    }
  }
}
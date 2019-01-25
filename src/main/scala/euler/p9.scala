object p9 extends App {
  for (i <- 1 to 500){
    for (j <- 1 to 500){
      var k = 1000 - i - j
      if (Math.pow(i, 2) + Math.pow(j, 2) == Math.pow(k, 2)) println(i* j* k)
    }
  }
}
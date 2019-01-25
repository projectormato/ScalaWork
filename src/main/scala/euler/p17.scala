object p17 extends App {
  val digit1 = List("one", "two", "three", "four", "five", "six", "seven", "eight", "Nine")
  val digit2 = List("ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen")
  val digit3 = List("twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety")
  var result:Long = 8L //thousand分
  var now = ""
  for (i <- 1 to 9){ //最初の9個の計算
    result += digit1(i-1).length
  }
  for (i <- 10 to 999){
    if ((i % 100).toString.length >= 2) {
      now = (i % 100).toString
    }else{
      now = "0"+(i % 100).toString
    }
    //1の位の計算なんとかteenじゃなくて、0でもない
    if (now(0) != '1' && now(1) != '0'){
      result += digit1(i%10 - 1).length //1の位
    }

    //10の位の計算
    if (now(0) == '1'){ //なんとかteenの時
      result += digit2(i%10).length
    }else{ //それ以外
      //0でもない
      if (now(0) != '0') result += digit3(now(0).toString.toInt-2).length + 1 //10の位+1は'-'分
      if (now(1) == '0') result -= 1
    }

    //100の位の計算
    if(i >= 100){
      //まずone とかtwoとかの加算
      result += digit1(i.toString()(0).toString.toInt - 1).length
      //英国の習慣
      if (i.toString()(1) != '0' && i.toString()(2) != '0') result += "and".length
      result += "hundred".length
    }
//    println(result)
  }
  println(result)
}
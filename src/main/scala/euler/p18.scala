import scala.collection.mutable.ListBuffer

object p18 extends App {
  var num = ListBuffer(
    ListBuffer(75),
    ListBuffer(95 ,64),
    ListBuffer(17 ,47 ,82),
    ListBuffer(18 ,35 ,87 ,10),
    ListBuffer(20 ,4 ,82 ,47 ,65),
    ListBuffer(19 ,1 ,23 ,75 ,3 ,34),
    ListBuffer(88 ,2 ,77 ,73 ,7 ,63 ,67),
    ListBuffer(99 ,65 ,4 ,28 ,6 ,16 ,70 ,92),
    ListBuffer(41 ,41 ,26 ,56 ,83 ,40 ,80 ,70 ,33),
    ListBuffer(41 ,48 ,72 ,33 ,47 ,32 ,37 ,16 ,94 ,29),
    ListBuffer(53 ,71 ,44 ,65 ,25 ,43 ,91 ,52 ,97 ,51 ,14),
    ListBuffer(70 ,11 ,33 ,28 ,77 ,73 ,17 ,78 ,39 ,68 ,17 ,57),
    ListBuffer(91 ,71 ,52 ,38 ,17 ,14 ,91 ,43 ,58 ,50 ,27 ,29 ,48),
    ListBuffer(63 ,66 ,4 ,68 ,89 ,53 ,67 ,30 ,73 ,16 ,69 ,87 ,40 ,31),
    ListBuffer(4 ,62 ,98 ,27 ,23 ,9 ,70 ,98 ,73 ,93 ,38 ,53 ,60 ,4 ,23)
  )
  var temp = 0
  for (i <- 0 to 13){
    for (j <- 0 to i){
      num(i+1)(j) = List(num(i+1)(j) + num(i)(j), temp).max
      if (j == i){
        num(i+1)(j+1) = num(i+1)(j+1) + num(i)(j)
      }else{
        temp = num(i+1)(j+1) + num(i)(j)
      }
    }
  }
  var ans = 0
  for(i <- 0 to 14){
    for (j <- 0 to i){
      ans = List(ans, num(i)(j)).max
      print(num(i)(j) + ", ")
    }
    println("")
  }
  println(ans)
}
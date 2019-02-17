package dwango.Function

object Option extends App {
  // Some(2)とSome(3)とSome(5)とSome(7)とSome(11)の値をかけて、Some(2310)を求めてみましょう。
  val v1: Option[Int] = Some(2)
  val v2: Option[Int] = Some(3)
  val v3: Option[Int] = Some(5)
  val v4: Option[Int] = Some(7)
  val v5: Option[Int] = Some(11)
  val res = v1.map(i1 => v2.map(i2 => v3.map(i3 => v4.map(i4 => v5.map(i5 => i1*i2*i3*i4*i5)).flatten).flatten).flatten).flatten
  val res2 = v1.flatMap(i1 => v2.flatMap(i2 => v3.flatMap(i3 => v4.flatMap(i4 => v5.map(i5 => i1*i2*i3*i4*i5 )))))
  val res3 = for { i1 <- v1
               i2 <- v2
               i3 <- v3
               i4 <- v4
               i5 <- v5 } yield i1 * i2 * i3 * i4 * i5

  println(res)
  println(res2)
  println(res3)

}


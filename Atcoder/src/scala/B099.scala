import scala.io.StdIn

object B099 extends App{
  //  val N= StdIn.readLine().split(" ").map(_ toInt)
  //  println(N(0))

  // A,Bくらいの入力しかないなら、Scanner使ったほうが楽そう
  val scanner = new java.util.Scanner(System.in)
  val N, M = scanner.nextInt(); val d = M-N; var sum = 0;
  for (i <- 1 to d){
    sum += i
  }
  println(sum - M)
}
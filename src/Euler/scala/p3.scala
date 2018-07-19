object p3 {
  import scala.math._
  def main(args: Array[String]) :Unit = {
    val n = 600851475143L; var flag = false; var target = 0L; var i = 3; var loop = true
    while(loop){
      if(n%i == 0){
        flag = true
        target = n/i
        for(j <- 3 to sqrt(target).toInt by 2){
          if(target%j == 0) flag = false
        }
        if(flag){
          println("素因数:" + target)
          loop = false
        }else{
          println("因数：　" + target)
        }
      }
      i += 2
    }
  }
}

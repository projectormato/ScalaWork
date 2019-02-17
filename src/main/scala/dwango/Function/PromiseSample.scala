package dwango.Function

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.{Await, Promise, Future}
import scala.concurrent.duration._
import scala.util.{Success, Failure}

object PromiseSample extends App {
  val promiseGetInt: Promise[Int] = Promise[Int]
  val futureByPromise: Future[Int] = promiseGetInt.future // PromiseからFutureを作ることが出来る

  // Promiseが解決されたときに実行される処理をFutureを使って書くことが出来る
  val mappedFuture = futureByPromise.map { i =>
    println(s"Success! i: ${i}")
  }

  // 別スレッドで何か重い処理をして、終わったらPromiseに値を渡す
  Future {
    Thread.sleep(5000)
    promiseGetInt.success(10)
  }

  Await.ready(mappedFuture, 5000.millisecond)
}
package dwango.Function

import scala.io.Source

object FilePrint extends App {
  def withFile[A](filename: String)(f: Source => A): A = {
    val s = Source.fromFile(filename)
    try {
      f(s)
    } finally {
      s.close()
    }
  }

  def printFile(filename: String): Unit = {
    withFile(filename) { file =>
      file.getLines.foreach(println)
    }
  }
}

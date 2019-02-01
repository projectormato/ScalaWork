package dwango.Class

class Point3D(val x: Int, val y: Int, val z: Int)

object Main extends App {
  val p = new Point3D(10, 20, 30)
  println(p.x) // 10
  println(p.y) // 20
  println(p.z) // 30
}
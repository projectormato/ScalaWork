package dwango.Class

sealed abstract class DayOfWeek
case object Sunday extends DayOfWeek
case object Monday extends DayOfWeek
case object Tuesday extends DayOfWeek
case object Wednesday extends DayOfWeek
case object Thursday extends DayOfWeek
case object Friday extends DayOfWeek
case object Saturday extends DayOfWeek


object Case extends App{
  val x: DayOfWeek = Sunday
  def nextDayOfWeek(d: DayOfWeek): DayOfWeek = {
    d match{
      case Sunday => Monday
      case Monday => Thursday
      case Tuesday => Wednesday
      case Wednesday => Thursday
      case Thursday => Friday
      case Friday => Saturday
      case Saturday => Sunday
    }
  }
  println(nextDayOfWeek(x))
}

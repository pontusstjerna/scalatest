

object Main extends App {

  val thisIsConstant = "hejsan"

  var info: String = "first info"
  info = "snd info"

  lazy val anotherValue = "this wont exist until use";

  val void: Unit = ()

  var unassigned: Float = _

  unassigned = 23

  val fromFloat: Int = unassigned.toInt

  println(info + thisIsConstant)

  println(anotherValue)

  println(unassigned)

  println(s"$anotherValue - $unassigned")

  println(s"execute code typ: ${23 + 23} - just like in ES6")

  println(23.toString() + 23) // Haha, 2323

  for (i <- 0 to 30) {
    if (Math.random() > 0.5) {
      println("Krona!")
    } else {
      println("Klave!")
    }
  }

  for (i <- 0 until 30) {
    if (i == 29) {
      println("oooo almost there!")
    }
  }
}

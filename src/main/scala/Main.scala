

object Main extends App {
  //tests()
  //noArgs

  printOst(1)
  println("HEJ")
  printOst()


  // Pure function with no args
  def noArgs: String = {
    println("hej")
    "hej"
  }

  def printOst(amount: Int = 100): Unit = for (_ <- 0 until amount) println("Ost")

  def tests(): Unit = {
    val thisIsConstant = "hejsan"

    var info: String = "first info"
    info = "snd info"

    lazy val anotherValue = "this wont exist until use";

    val void: Unit = ()

    //var unassigned: Float = _

    var unassigned = 23

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


    // Ranges
    val working = 1 to 5

    println(working.toList)

    // match / case
    unassigned match {
      case 23 => println("23 !-")
      case 36 => println("not 23!")
      case _ => println("This is default")
    }

    // Optional / maybe
    val glazedDonutTaste: Option[String] = None

    val anotherOptional = Some(23)

    if (anotherOptional.isDefined) {
      println("Has value")
    }

    glazedDonutTaste match {
      case Some(value) => println(s"Has this value: $value")
      case None => println("Has no value!")
    }

    // As in JS any
    var anyType: Any = 23
    anyType = "23" // Cool!
  }

}
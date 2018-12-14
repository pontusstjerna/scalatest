class Cat(name: String, weight: Option[Int] = None) {

  def print = println(s"$name - $weight kg")
}

class BritishShorthair(name: String) extends Cat(name, Some(5))

class CMS(name: String) extends Cat(name, Some(6))
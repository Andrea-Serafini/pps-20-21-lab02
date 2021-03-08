package u02.home

object Math {

  val parity1 : Int => String = x => x % 2 match {
    case 0 => "even"
    case 1 => "odd"
  }

  val negVal : (String =>  Boolean) => (String =>  Boolean) = func => string => !func(string)

  def parity2(value: Int): String = value match {
    case value if value % 2 == 0 => "EVEN"
    case _ => "ODD"
  }

  def parity2a(value: Int): String = {
    if (value % 2 == 0) "EVEN" else "ODD"
  }

  def parity2b(value: Int): String = value % 2 match {
    case 0 => "EVEN"
    case _ => "ODD"
  }

  def negMethod(predicate: String => Boolean): String => Boolean = {
    !predicate(_)
  }
}

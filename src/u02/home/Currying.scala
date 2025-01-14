package u02.home

object Currying {

  val p1: Int => Int => Int => Boolean = x => y => z => x <= y && y <= z
  val p2: (Int, Int, Int) => Boolean = (x, y, z) => x <= y && y <= z

  def p3(x:Int)(y:Int)(z:Int): Boolean = x <= y && y <= z
  def p4(x:Int, y:Int, z:Int): Boolean = x <= y && y <= z

  def compose(f: Int => Int, g: Int => Int): Int => Int = x => f(g(x))

  def composeGeneric[T](f: T => T, g: T => T): T => T = x => f(g(x))

  def composeGenericComplex[X,Y,Z](f: Y => Z, g: X => Y): X => Z = x => f(g(x))

}

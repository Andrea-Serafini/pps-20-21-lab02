package u02.home

object Shape {

  sealed trait Shape
  case class Rectangle(height: Int, width: Int) extends Shape
  case class Circle(radius: Int) extends Shape
  case class Square(base: Int) extends Shape

  def perimeter(shape: Shape): Double = shape match {
    case rectangle: Rectangle => (rectangle.height + rectangle.width) * 2
    case square: Square => square.base * 4
    case circle: Circle => circle.radius * 2 * 3.14
  }

  def area(shape: Shape): Double = shape match {
    case rectangle: Rectangle => rectangle.height * rectangle.width
    case square: Square => square.base * square.base
    case circle: Circle => circle.radius * circle.radius * 3.14
  }
}

package u02.home

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import u02.home.Shape._

class ShapeTest {

  @Test def testRectangle(): Unit ={
    val rectangle = Rectangle(3,4)

    assertEquals(14, perimeter(rectangle))
    assertEquals(12, area(rectangle))

  }

  @Test def testSquare(): Unit ={
    val square = Square(5)

    assertEquals(20, perimeter(square))
    assertEquals(25, area(square))

  }

  @Test def testCircle(): Unit ={
    val circle1 = Circle(1)
    assertEquals(6.28, perimeter(circle1))
    assertEquals(3.14, area(circle1))

    val circle2 = Circle(2)
    assertEquals(12.56, perimeter(circle2))
    assertEquals(12.56, area(circle2))
  }
}

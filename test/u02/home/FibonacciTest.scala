package u02.home

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.home.Fibonacci._

class FibonacciTest {


  @Test def testParity2(): Unit ={

    assertEquals(0, fib(0))
    assertEquals(0, fibTail(0))

    assertEquals(1, fib(1))
    assertEquals(1, fibTail(1))

    assertEquals(3, fib(4))
    assertEquals(3, fibTail(4))

    assertEquals(34, fib(9))
    assertEquals(34, fibTail(9))
  }

}

package u02.home

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.home.Math._

class MathTest {

  val evenValue = 8
  val oddValue = 5


  @Test def testParity1(): Unit ={
    assertEquals("even", parity1(evenValue))
    assertEquals("odd", parity1(oddValue))

  }

  @Test def testParity2(): Unit ={
    assertEquals("EVEN", parity2(evenValue))
    assertEquals("ODD", parity2(oddValue))
  }

  @Test def testParity2a(): Unit ={
    assertEquals("EVEN", parity2a(evenValue))
    assertEquals("ODD", parity2a(oddValue))
  }

  @Test def testParity2b(): Unit ={
    assertEquals("EVEN", parity2b(evenValue))
    assertEquals("ODD", parity2b(oddValue))
  }
}

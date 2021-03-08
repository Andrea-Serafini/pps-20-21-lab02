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

  @Test def testNegMethod(): Unit ={
    val empty: String => Boolean = _=="" // predicate on strings
    val notEmpty = negMethod(empty) // which type of notEmpty?

    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))
  }

  @Test def testNegVal(): Unit ={
    val empty: String => Boolean = _==""
    val notEmpty = negVal(empty)

    assertTrue(notEmpty("foo"))
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty(""))
  }

  @Test def testNegMethodGeneric(): Unit ={
    val zero: Int => Boolean = _==0// predicate on strings
    val notZero = negMethod(zero) // which type of notEmpty?

    assertTrue(notZero(3))
    assertFalse(notZero(0))
    assertTrue(notZero(3) && !notZero(0))
  }
}

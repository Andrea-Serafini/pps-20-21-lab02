package u02.home

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.home.Currying._

class CurryingTest {

  @Test def testP1(): Unit ={
    assertTrue(p1(1)(3)(5))

    val tmp = p1(3)(4)
    assertFalse(tmp(1))

    val first = p1(1)
    val second = first(3)
    assertTrue(second(5))

  }

  @Test def testP2(): Unit ={
    assertTrue(p2(1,3,5))
    assertFalse(p2(4,3,5))

  }

  @Test def testP3(): Unit ={
    assertTrue(p3(1)(3)(5))

    val greaterThan10 = p3(10)_
    val greaterThan3 = greaterThan10(3)
    assertFalse(greaterThan3(4))

    val positiveExamScore = p3(18)(_: Int)(30)
    assertTrue(positiveExamScore(29))
    assertFalse(positiveExamScore(15))
  }

  @Test def testP4(): Unit ={
    assertTrue(p4(1,3,5))
    assertFalse(p4(4,3,5))

  }

  @Test def testCompose(){
    assertEquals(9,compose(_-1,_*2)(5))

    val twoThird = compose(_*2,_/3)
    assertEquals(6, twoThird(9))

  }

  @Test def testComposeGeneric(){
    assertEquals(9,composeGeneric[Int](_-1,_*2)(5))

    val twoThird = composeGeneric[Int](_*2,_/3)
    assertEquals(6, twoThird(9))

  }

  @Test def testComposeGenericComplex(){

    val lessThanTHREE = composeGenericComplex[String, Int, Boolean](_<3,_ match{
      case "ONE" => 1
      case "TWO" => 2
      case _ => 3
    })

    assertTrue(lessThanTHREE("ONE"))
    assertFalse(lessThanTHREE("FOUR"))

  }
}

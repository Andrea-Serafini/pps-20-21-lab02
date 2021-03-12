package u02.home

import org.junit.jupiter.api.Assertions.{assertEquals, assertTrue}
import org.junit.jupiter.api.Test
import u02.Optionals.Option._

class OptionalsTest {

  @Test def testFilter(): Unit ={

    assertEquals(Some(5), filter(Some(5))(_ > 2))
    assertEquals(None(), filter(Some(5))(_ > 8))

  }

  @Test def testMap(): Unit ={

    assertEquals(Some(true), map(Some(5))(_ > 2))
    assertEquals(None(), map(None[Int])(_ > 2))

    assertEquals(Some(10), map(Some(5))(_ * 2))

  }

  @Test def testMap2(): Unit ={

    val isGreater = map2[Int, Int, Boolean](_ > _)(_,_)

    assertEquals(Some(true),isGreater(Some(6), Some(3)))
    assertEquals(Some(false),isGreater(Some(6), Some(9)))
    assertEquals(None(),isGreater(Some(6), None()))

  }

  @Test def testDouble(): Unit ={

    assertEquals(Some(10), double(Some(5)))
    assertEquals(None(), double(None()))

  }

  @Test def testOpposite(): Unit ={

    assertEquals(Some(false), opposite(Some(true)))
    assertEquals(None(), opposite(None()))

  }

}

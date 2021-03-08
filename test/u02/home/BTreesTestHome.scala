package u02.home

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.home.Tree._

class BTreesTestHome {
  val tree = Branch(
    Branch(Empty(), 10, Empty()),
    20,
    Branch(Empty(), 30, Empty())
  )

  @Test def testSum(){
    assertEquals(60, sum(tree))
    assertEquals(0, sum(Empty()))

  }

  @Test def testCount(){
    assertEquals(3, count(tree))
    assertEquals(0, count(Empty()))
  }
}

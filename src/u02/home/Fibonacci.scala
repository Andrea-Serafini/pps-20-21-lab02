package u02.home

object Fibonacci {

  /**
   *   @annotation.tailrec
   *
   *   NOT TAIL RECURSION
   */
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n - 1) + fib(n - 2)
  }


  /**
   *  TAIL RECURSION IMPLEMENTATION FOUND ONLINE
   */
  def fibTail(n: Int): Int = {
    @annotation.tailrec
    def fib_tail(n: Int, a: Int, b: Int): Int = n match {
      case 0 => a
      case _ => fib_tail(n - 1, b, a + b)
    }
    return fib_tail(n, 0 , 1)
  }

}

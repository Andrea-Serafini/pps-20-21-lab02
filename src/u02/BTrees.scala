package u02

object BTrees extends App {

  // A custom and generic binary tree of elements of type A
  sealed trait Tree[A]
  object Tree {

    case class Leaf[A](value: A) extends Tree[A]

    case class Branch[A](left: Tree[A], right: Tree[A]) extends Tree[A]


    /*def size[A](t: Tree[A]): Int = t match {
        case Branch(l, r) => size(l) + size(r)
        case _ => 1
    }

    def find[A](t: Tree[A], elem: A): Boolean = t match {
      case Branch(l, r) => find(l, elem) || find (r,elem)
      case Leaf(e) => e==elem
    }

    def count[A](t: Tree[A], elem: A): Int = t match {
      case Branch(l, r) => count(l, elem) + count(r,elem)
      case Leaf(e) if (e==elem) => 1
      case _ => 0
    }*/

    def read[A, B](t: Tree[A], onLeaf: A => B, onBranch: (B, B) => B): B = t match {
      case Branch(left, right) => onBranch(read(left, onLeaf, onBranch), read(right, onLeaf, onBranch))
      case Leaf(value) => onLeaf(value)
    }

    def size[A](t: Tree[A]): Int = read(t, (leaf: A) => 1, (_: Int) + (_: Int))

    def find[A](t: Tree[A], elem: A): Boolean = read(t, (leaf: A) => leaf == elem, (_: Boolean) || (_: Boolean))

    def count[A](t: Tree[A], elem: A): Int = read(t, (leaf: A) => if (leaf == elem) 1 else 0, (_: Int) + (_: Int))

  }

  import Tree._
  val tree = Branch(Branch(Leaf(1),Leaf(2)),Leaf(1))
  println(tree, size(tree)) // ..,3
  println( find(tree, 1)) // true
  println( find(tree, 4)) // false
  println( count(tree, 1)) // 2
}

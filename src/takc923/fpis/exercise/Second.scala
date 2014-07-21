package takc923.fpis.exercise

/**
 * Created by takc923 on 2014/07/21.
 */
object Second {

  /**
   * EXERCISE 1
   * @param n
   * @return
   */
  def fib(n: Int): Int = {
    def loop(m: Int, acc1: Int, acc2: Int): Int =
      if (m <= 0) acc1
      else loop(m - 1, acc2, acc1 + acc2)

    loop(n, 0, 1)
  }

  /**
   * EXERCISE 2
   * @param as
   * @param gt
   * @tparam A
   * @return
   */
  def isSorted[A](as: Array[A], gt: (A, A) => Boolean): Boolean = {
    def loop(index: Int): Boolean =
      if (index >= as.length - 1) true
      else if (gt(as(index), as(index + 1))) loop(index + 1)
      else false

    loop(0)
  }

  def partial1[A, B, C](a: A, f: (A, B) => C): B => C =
    (b: B) => f(a, b)

  /**
   * EXERCISE 3
   * @param f
   * @tparam A
   * @tparam B
   * @tparam C
   * @return
   */
  def curry[A, B, C](f: (A, B) => C): A => (B => C) =
    (a: A) => partial1(a, f)

  /**
   * EXERCISE 4
   * @param f
   * @tparam A
   * @tparam B
   * @tparam C
   * @return
   */
  def uncurry[A, B, C](f: A => B => C): (A, B) => C =
    (a: A, b: B) => f(a)(b)

  /**
   * EXERCISE 5
   * @param f
   * @param g
   * @tparam A
   * @tparam B
   * @tparam C
   * @return
   */
  def compose[A, B, C](f: B => C, g: A => B): A => C =
    (a: A) => f(g(a))

}

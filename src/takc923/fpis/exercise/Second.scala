package takc923.fpis.exercise

/**
 * Created by takc923 on 2014/07/21.
 */
object Second {

  def fib(n: Int): Int = {
    def loop(m: Int, acc1: Int, acc2: Int): Int =
      if (m <= 0) acc1
      else loop(m - 1, acc2, acc1 + acc2)

    loop(n, 0, 1)
  }
}

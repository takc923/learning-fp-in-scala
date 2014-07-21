package takc923.fpis.exercise

/**
 * Created by takc923 on 2014/07/21.
 */
object Second {

  def fib(n: Int): Int = {
     def loop(m: Int, acc1: Int, acc2: Int): Int = m match {
      case 0 => acc1
      case num => loop(num - 1, acc2, acc1 + acc2)
    }

    loop(n, 0, 1)
  }
}

object Main {
  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)

  def id(a: Int): Int = a

  def square(a: Int): Int = a * a


  def main(args: Array[String]): Unit = {
    def a = 1

    def b = 5

    println(sum(id, a, b))
    println(sum(square, a, b))
  }
}

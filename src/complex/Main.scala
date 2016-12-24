package complex

object Main {
  def main(args: Array[String]): Unit = {
    val first = new Complex(1, 5)
    val second = new Complex(2, 4)
    val sum = first + second

    println(sum)

    if (first > second) println(first + " is greater")
    else if (first < second) println(second + " is greater")
    else print("Equal")
  }
}

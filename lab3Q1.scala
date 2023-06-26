object ReverseStringRecursive {
  def reverseString(str: String): String = {
    if (str.isEmpty) ""
    else reverseString(str.tail) + str.head
  }

  def main(args: Array[String]): Unit = {
    val inputString = scala.io.StdIn.readLine("Enter a string: ")
    val reversedString = reverseString(inputString)
    println(s"Reversed string: $reversedString")
  }
}

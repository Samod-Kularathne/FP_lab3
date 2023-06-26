object FilterStringsByLength {
  def filterStringsByLength(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputList = scala.io.StdIn.readLine("Enter a list of strings, separated by spaces: ").split(" ").toList
    val filteredList = filterStringsByLength(inputList)
    println(s"Filtered list: $filteredList")
  }
}

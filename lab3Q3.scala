object ArithmeticMean {
  def calculateArithmeticMean(num1: Int, num2: Int): Double = {
  val sum = num1 + num2
  val mean = sum.toDouble / 2
  BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}


  def main(args: Array[String]): Unit = {
    val num1 = 5
    val num2 = 6
    val average = calculateArithmeticMean(num1, num2)
    println(average)
  }
}

object q2 extends App {
  println("Enter a number:")
  val num = scala.io.StdIn.readLine().toInt

  def patternMatch(number: Int): String = number match {
    case number if number <= 0     => "Negative/Zero"
    case number if number % 2 == 0 => "Even number"
    case _                         => "Odd number"
  }

  println(patternMatch(num))

}

package u02

object Recursion extends App:

  @annotation.tailrec
  def gcd(a: Int, b: Int): Int = (a,b) match
    case _ if a % b == 0 => b
    case _ if a > b => gcd(b, a % b)
    case _ if b > a => gcd(a, b % a)



package u02

object Negative extends App:

  val neg: (String => Boolean) => (String => Boolean) =
    p => (s => !p(s))

  def neg2(p: String => Boolean): String => Boolean =
    s => !p(s)

  def genericNeg[A](p: A => Boolean): A => Boolean =
    s => !p(s)



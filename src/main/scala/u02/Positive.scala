package u02

object Positive extends App{

  val positive: Int => String = (i: Int) => i match
    case i if i > 0 => "positive"
    case i if i < 0 => "negative"

  def positive2(i: Int): String = i match
    case i if i > 0 => "positive"
    case i if i < 0 => "negative"

  val neg: (String => Boolean) => (String => Boolean) =
    pred => (string => !pred(string))

  val empty: String => Boolean = _ == "" // predicate on strings
  val notEmpty = neg(empty) // which type of notEmpty?
  println(notEmpty("foo")) // true
  println(notEmpty("")) // false
  println(notEmpty("foo") && !notEmpty("")) // true.. a comprehensive test
}

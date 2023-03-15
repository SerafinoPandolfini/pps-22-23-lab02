package u02

object Positive extends App:

  val positive: Int => String = (i: Int) => i match
    case i if i > 0 => "positive"
    case i if i < 0 => "negative"

  def positive2(i: Int): String = i match
    case i if i > 0 => "positive"
    case i if i < 0 => "negative"






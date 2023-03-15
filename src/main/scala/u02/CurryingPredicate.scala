package u02

object CurryingPredicate extends App:

  //non curried
  val p1: (Double, Double, Double) => Boolean =
    (x, y, z) => x <= y && y == z

  //curried
  val p2: Double => Double => Double => Boolean =
    x => y => z => x <= y && y == z

  //non curried
  def p3(x: Double, y: Double, z: Double): Boolean =
    x <= y && y == z

  //curried
  def p4(x: Double)(y: Double)(z: Double): Boolean =
    x <= y && y == z



package u02

import junit.framework.TestCase.assertTrue
import org.junit.Assert.{assertEquals, assertFalse}
import org.junit.*
import u02.Shapes.Shape.{Circle, Rectangle, Square, contains, perimeter}

class ShapesTest :

  val delta: Double = 0.01
  val center: (Double, Double) = (-1, 1)
  val radius: Double = 2
  val circle: Circle = Circle(center, radius)
  val width: Double = 4
  val height: Double = 5
  val rectangle: Rectangle = Rectangle(center, width, height)
  val side: Double = 2.2
  val square: Square = Square(center, side)

  @Test
  def testPerimeter() =
    assertEquals(math.Pi * radius * 2 , perimeter(circle), delta)
    assertEquals(width * 2 + height * 2, perimeter(rectangle), delta)
    assertEquals(side * 4, perimeter(square), delta)

  @Test
  def testContains() =
    assertTrue(contains(circle, center))
    assertTrue(contains(rectangle, center))
    assertTrue(contains(square, center))
    assertFalse(contains(circle, (center._1 + radius, center._2 + radius)))
    assertFalse(contains(rectangle, (center._1 + width, center._2)))
    assertFalse(contains(rectangle, (center._1, center._2 + height)))
    assertFalse(contains(square, (center._1 + side, center._2)))
    assertFalse(contains(square, (center._1, center._2 + side)))

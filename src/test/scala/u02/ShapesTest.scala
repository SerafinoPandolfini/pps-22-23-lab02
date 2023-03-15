package u02

import junit.framework.TestCase.assertTrue
import org.junit.Assert.{assertEquals, assertFalse}
import org.junit.*
import u02.Shapes.Shape.{Circle, Rectangle, Square, perimeter}

class ShapesTest :

  val delta: Double = 0.01
  val center: (Double, Double) = (0, 1)
  val radius: Double = 2
  val circle: Circle = Circle(center, radius)
  val width: Double = 4
  val height: Double = 5
  val rectangle: Rectangle = Rectangle(width, height)
  val side: Double = 2.2
  val square: Square = Square(side)

  @Test
  def testPerimeter() =
    assertEquals(math.Pi * radius * 2 , perimeter(circle), delta)
    assertEquals(width * 2 + height * 2, perimeter(rectangle), delta)
    assertEquals(side * 4, perimeter(square), delta)
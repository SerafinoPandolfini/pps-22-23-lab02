package u02

object Shapes :

  enum Shape:
    case Circle (center: (Double, Double), radius: Double)
    case Rectangle (center: (Double, Double), width: Double, height: Double)
    case Square (center: (Double, Double), side: Double)

  object Shape:
    def perimeter(shape : Shape): Double = shape match
      case Circle(_, radius) => math.Pi * radius * 2
      case Rectangle(_, width, height) => width * 2 + height * 2
      case Square(_, side) => side * 4

    def contains(shape: Shape, point: (Double, Double)): Boolean = shape match
      case Circle(center, radius) => math.pow(point._1 - center._1, 2) + math.pow(point._2 - center._2, 2) <=
        math.pow(radius, 2)
      case Rectangle(center, width, height) => math.abs(point._1 - center._1) <= width / 2 &&
        math.abs(point._2 - center._2) <= height / 2
      case Square(center, side) => math.abs(point._1 - center._1) <= side / 2 &&
        math.abs(point._2 - center._2) <= side / 2


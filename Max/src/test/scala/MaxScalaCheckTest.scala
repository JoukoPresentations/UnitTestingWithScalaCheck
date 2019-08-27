import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

class MaxScalaCheckTest extends Properties("Max") {
  property("max") = forAll { (x: Int, y: Int) =>
    val z = MyMax.myMax(x, y)
    (z == x || z == y) && (z >= x && z >= y)
  }
}





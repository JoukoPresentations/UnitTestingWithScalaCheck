import org.scalacheck.Properties
import org.scalacheck.Prop.forAll

class MaxScalaCheckBadTest extends Properties("Max") {
  property("max") = forAll { (x: Int, y: Int) =>
    val z = MyMax.myMax(x, y)
    z == (if (x > y) x else y)
  }
}









import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Test.Parameters

class Max1000Test extends Properties("Max") {
  val p = forAll { (x: Int, y: Int) =>
    val z = MyMax.myMax(x, y)
    (z == x || z == y) && (z >= x && z >= y)
  }

  val myParams = Parameters.default.withMinSuccessfulTests(1000)

  p.check(myParams)

}



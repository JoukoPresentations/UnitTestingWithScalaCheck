import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.{posNum, negNum}

class GenNumExample extends Properties("GenNum") {

  property("GenNumExample") = forAll(negNum[Int], posNum[Int]) {
    (n, p) =>
      println(n + "\t" + p)
      n < p
  }
}


import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.listOf

class ListExample extends Properties("GenList") {

  property("GenListExample") = forAll(listOf(Int)) {
    xs => xs.length >= 0
  }
}


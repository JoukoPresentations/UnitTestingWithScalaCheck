import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, BooleanOperators}

class PreconditionExample extends Properties("Precondition") {

  property("GenPreconditionExample") = forAll { n: Int =>
    (n % 3 == 0) ==> {
      (n + 3) % 3 == 0
    }
  }
}



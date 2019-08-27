import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.choose

class MyGenExample extends Properties("MyGen") {

  val myGen = for {
    n <- choose(1, 50)
    m <- choose(n, 2 * n)
  } yield (n, m)

  property("MyGenExample") = forAll(myGen) {
    pair => pair._2 >= pair._1
  }
}


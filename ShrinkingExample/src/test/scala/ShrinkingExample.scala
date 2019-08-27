import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.{listOf, choose}

class ShrinkingExample extends Properties("Shrinking") {
  property("IncorrectProperty") = forAll(listOf(choose(0,100)))
  {
    ls =>
    println(ls)
    !ls.exists{x => x%2 == 0}
  }
}


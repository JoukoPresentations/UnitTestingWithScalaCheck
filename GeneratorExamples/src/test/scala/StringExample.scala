import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.{alphaStr, numStr, identifier, alphaLowerStr, alphaUpperStr}

class StringExample extends Properties("GenString") {

  property("GenStringExample") = forAll(numStr, //A random sequence of digits as a string
    alphaUpperStr, //A random sequence of upper case letters
    alphaLowerStr, //A random sequence of lower case letters
    alphaStr, //A random sequence of lower or upper case letters
    identifier) { //A random lower case letter followed by alphanumeric characters
    (s1, s2, s3, s4, s5) =>
      println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4 + "\t" + s5)
      true
  }
}

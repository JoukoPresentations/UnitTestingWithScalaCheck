import org.scalacheck.Properties
import org.scalacheck.Prop.forAll
import org.scalacheck.Gen.{numChar, alphaUpperChar, alphaLowerChar, alphaChar, alphaNumChar}

class CharExample extends Properties("GenChar"){

  property("GenCharExample") = forAll(numChar, //A random digit as a char
    alphaUpperChar, //A random upper case letter as char
    alphaLowerChar, //A random lower case letter as char
    alphaChar,  //A random lower or upper case letter as char
    alphaNumChar) { //A random lower or upper case letter or digit as char
    (s1, s2, s3, s4, s5) =>
      println(s1 + "\t" + s2 + "\t" + s3 + "\t" + s4 + "\t" + s5)
      true
  }
}



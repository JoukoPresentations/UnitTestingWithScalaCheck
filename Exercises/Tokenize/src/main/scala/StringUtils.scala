import java.util.StringTokenizer
import scala.annotation.tailrec

object StringUtils {
  @tailrec
  private def tokenizeRecursive(st: StringTokenizer, delimStr: String, result: List[String]): List[String] = {
    if (st.hasMoreTokens) tokenizeRecursive(st, delimStr, result :+ st.nextToken)
    else result
  }

  def tokenize(str: String, delim: Char): List[String] = {
    val delimStr = delim.toString
    val st = new StringTokenizer(str, delimStr)
    val result = List()
    tokenizeRecursive(st, delimStr, result)
  }
}

import junit.framework.TestCase
import org.junit.Test
import org.junit.Assert.assertEquals

class MaxTest extends TestCase {
  @Test
  def testMax(): Unit = {
    val z = MyMax.myMax(1, 0)
    assertEquals(1, z)
  }
}

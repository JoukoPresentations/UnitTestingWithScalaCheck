import junit.framework.TestCase
import org.junit.Test
import org.junit.Assert.assertEquals

class MaxMultipleTests extends TestCase {
  @Test
  def testMax1(): Unit = {
    val z = MyMax.myMax(1, 0)
    assertEquals(1, z)
  }

  @Test
  def testMax2(): Unit = {
    val z = MyMax.myMax(0, 1)
    assertEquals(1, z)
  }

  @Test
  def testMax3(): Unit = {
    val z = MyMax.myMax(-100, 0)
    assertEquals(0, z)
  }

  @Test
  def testMax4(): Unit = {
    val z = MyMax.myMax(0, -100)
    assertEquals(0, z)
  }

  @Test
  def testMax5(): Unit = {
    val z = MyMax.myMax(30, 30)
    assertEquals(30, z)
  }

  @Test
  def testMax6(): Unit = {
    val z = MyMax.myMax(1, 35)
    assertEquals(35, z)
  }

  @Test
  def testMax7(): Unit = {
    val z = MyMax.myMax(35, 1)
    assertEquals(35, z)
  }

  @Test
  def testMax8(): Unit = {
    val z = MyMax.myMax(-35, -1)
    assertEquals(-1, z)
  }

  @Test
  def testMax9(): Unit = {
    val z = MyMax.myMax(-1, -35)
    assertEquals(-1, z)
  }
}

import com.holdenkarau.spark.testing.{DataframeGenerator, SharedSparkContext}
import org.apache.spark.sql.{SQLContext, SparkSession}
import org.apache.spark.sql.types.{IntegerType, StringType, StructField, StructType}
import org.apache.spark.sql.functions.col
import org.scalacheck.Prop.forAll
import org.scalatest.FunSuite
import org.scalatest.prop.Checkers

class SparkExample extends FunSuite with SharedSparkContext with Checkers {
  override implicit def reuseContextIfPossible: Boolean = true

  test("schemas should be the same") {
    val sqlContext = new SQLContext(sc)

    val schema = StructType(List(
      StructField("id", IntegerType, nullable = true),
      StructField("name", StringType, nullable = true)
    ))

    val newSchema = StructType(List(StructField("name", StringType, nullable = true)))

    val dataframeGen = DataframeGenerator.arbitraryDataFrame(sqlContext, schema)

    val property = forAll(dataframeGen.arbitrary) {
      df => {
        val newDf = df.select(col("name"))
        newDf.schema == newSchema
      }
    }
    check(property)
  }
}


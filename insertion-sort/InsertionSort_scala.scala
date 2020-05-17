import java.io.{BufferedReader, IOException, InputStreamReader}
import java.lang.System.{in, out}
import java.util

import scala.io.StdIn


object InsertionSort_Scala {
  def main(args: Array[String]): Unit = {
    val br = new BufferedReader(new InputStreamReader(in))
    out.println("Length")
    var length = 0
    try length = StdIn.readInt()
    catch {
      case e@(_: IOException | _: NumberFormatException) =>
        e.printStackTrace()
    }
    out.println("Elements")
    var elements = new String
    try elements = br.readLine
    catch {
      case e: IOException =>
        e.printStackTrace()
    }
    val stringRay = elements.split(" ")
    val intArr = stringRay.map(_.toInt)
    val obj = new InsertionSort_Scala(intArr)
    val sortedArray = obj.sort
    var sortedString = util.Arrays.toString(sortedArray)
    sortedString = sortedString.replace('[', ' ')
    sortedString = sortedString.replace(']', ' ')
    sortedString = sortedString.replace(',', ' ')
    out.println(sortedString)
  }
}

class InsertionSort_Scala private(var array: Array[Int]) {
  private def sort = {
    var j = 1
    while ( {
      j < array.length
    }) {
      val current = array(j)
      var i = j - 1
      while ( {
        (i > -1) && (array(i) > current)
      }) {
        array(i + 1) = array(i)
        i -= 1
      }
      array(i + 1) = current

      {
        j += 1; j - 1
      }
    }
    array
  }
}

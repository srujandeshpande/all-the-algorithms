import java.io.{BufferedReader, IOException, InputStreamReader}
import java.lang.System.{in, out}
import java.util

object selectionsort_scala {

  private val intList = new util.LinkedList[Integer]

  @throws[IOException]
  def main(args: Array[String]): Unit = {
    val isr = new InputStreamReader(in)
    val br = new BufferedReader(isr)
    var elementsArray = null
    out.println("Length")
    val len = br.readLine.toInt
    var intArr = new Array[Int](len)
    out.println("Elements")
    val arr = br.readLine().split(" ")
    intArr = arr.map(_.toInt)
    for (i <- intArr) {
      intList.add(i)
    }
    val sortedList = SSMain.selectionSort(intList)
    var sortString = sortedList.toString
    sortString = sortString.replace("[", "")
    sortString = sortString.replace("]", "")
    sortString = sortString.replace(",", "")
    out.println(sortString)
  }

  private object SSMain
  {

    def selectionSort(integerList: util.List[Integer]): util.List[Integer]= {
      var smallInt = 0
      var j = 0
      var smallIntIndex = 0
      var i = 1
      while ( {
        i < integerList.size
      }) {
        smallInt = integerList.get(i - 1)
        smallIntIndex = i - 1
        j = i
        while ( {
          j < integerList.size
        }) {
          if (integerList.get(j) < smallInt) {
            smallInt = integerList.get(j)
            smallIntIndex = j
          }

          {
            j += 1; j - 1
          }
        }
        this.swap(i - 1, smallIntIndex, integerList)

        {
          i += 1; i - 1
        }
      }
      integerList
    }

    def swap(sourceIndex: Int, destinationIndex: Int, integerList: util.List[Integer]): Unit = {
      val temp = integerList.get(destinationIndex)
      integerList.set(destinationIndex, integerList.get(sourceIndex))
      integerList.set(sourceIndex, temp)
    }
  }

}


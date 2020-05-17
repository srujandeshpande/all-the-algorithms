import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader
import java.lang.System.`in`
import java.lang.System.out
import java.util.*

class InsertionSort_Kotlin private constructor(private val array: IntArray) {

    private fun sort(): IntArray {
        for (j in 1 until array.size) {
            val current = array[j]
            var i = j - 1
            while (i > -1 && array[i] > current) {
                array[i + 1] = array[i]
                i--
            }
            array[i + 1] = current
        }
        return array
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val br = BufferedReader(InputStreamReader(`in`))

            out.println("Length")
            val length: Int?
            try {
                length = Integer.parseInt(br.readLine())
            } catch (e: IOException) {
                e.printStackTrace()
            } catch (e: NumberFormatException) {
                e.printStackTrace()
            }

            out.println("Elements")
            var elements = String()
            try {
                elements = br.readLine()
            } catch (e: IOException) {
                e.printStackTrace()
            }

            val stringRay = elements.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()

            val intArr = Arrays.stream(stringRay).mapToInt { Integer.parseInt(it) }.toArray()

            val obj = InsertionSort_Kotlin(intArr)

            val sortedArray = obj.sort()

            var sortedString = Arrays.toString(sortedArray)
            sortedString = sortedString.replace('[', ' ')
            sortedString = sortedString.replace(']', ' ')
            sortedString = sortedString.replace(',', ' ')

            out.println(sortedString)
        }
    }
}

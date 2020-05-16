import java.io.BufferedReader
import java.io.InputStreamReader
import java.lang.System.`in`
import java.lang.System.out
import java.util.*
import java.util.function.ToIntFunction


// Main Class
class selectionsort_kt {
    // Main Method
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val intList = LinkedList<Int>()

            val isr = InputStreamReader(`in`)
            val br = BufferedReader(isr)
            val elementsArray: Array<String>

            out.println("Length")
            val len = Integer.parseInt(br.readLine())
            var intArr = IntArray(len)

            out.println("Elements")
            val elements = br.readLine()
            elementsArray = elements.split(" ").dropLastWhile({ it.isEmpty() }).toTypedArray()
            val arrayLen = elementsArray.size
            intArr = Arrays.stream(elementsArray).mapToInt(ToIntFunction<String> { Integer.parseInt(it) }).toArray()

            // Converts Array to List
            for (i in intArr) {
                intList.add(i)
            }

            // Calls Constructor
            val obj = SSMain(intList)

            // Retrieves sorted List
            val sortedList = obj.selectionSort()
            var sortString = sortedList.toString()

            // Replaces redundant charecters
            sortString = sortString.replace("[", "")
            sortString = sortString.replace("]", "")
            sortString = sortString.replace(",", "")

            // Output
            out.println(sortString)
        }
    }
    // Class that does all behaviour
    private class SSMain
    // Constructor that initializes the List
    internal constructor(internal var integerList: MutableList<Int>) {
        // Sorting method
        internal fun selectionSort(): List<Int> {

            var smallInt: Int
            var j: Int
            var smallIntIndex: Int

            // Inner loop
            for (i in 1 until integerList.size) {

                smallInt = integerList[i - 1]
                smallIntIndex = i - 1

                j = i
                // Outer loop
                while (j < integerList.size) {
                    if (integerList[j] < smallInt) {
                        smallInt = integerList[j]
                        smallIntIndex = j
                    }
                    j++
                }
                this.swap(i - 1, smallIntIndex)
            }
            return integerList
        }

        // Swaps two indices in the List
        internal fun swap(sourceIndex: Int, destinationIndex: Int) {
            val temp = integerList[destinationIndex]
            integerList[destinationIndex] = integerList[sourceIndex]
            integerList[sourceIndex] = temp
        }
    }
}


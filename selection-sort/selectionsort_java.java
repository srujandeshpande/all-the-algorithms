import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.lang.System.in;
import static java.lang.System.out;


/**
 * @author BoogieMonster1O1
 * Main Class
 * <p>Selection Sorting is sorting a stream of Integers in ascending order. Its as easy as that</p>
 */
public class selectionsort_java  {

    /**
     * Integer List
     * <p>This List is a LinkedList that stores the value of the unsorted List. The value is sent to the next class for sorting</p>
     */
    private static List<Integer> intList = new LinkedList<>();

    /**
     * @author BoogieMonster1O1
     * @param  args Enables Command Line input
     * @throws IOException
     * Main Method
     * <p>This Method carries out all IO operations. Although most of the behaviour is not done through this method, it calls other methods to do the behaviour for it.</p>
     */
    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);
        String[] elementsArray;

        out.println("Length");
        int len = Integer.parseInt(br.readLine());
        int[] intArr = new int[len];

        out.println("Elements");
        var elements = br.readLine();
        elementsArray = elements.split(" ");
        int arrayLen = elementsArray.length;
        intArr = Arrays.stream(elementsArray).mapToInt(Integer::parseInt).toArray();

        for(int i: intArr){
            intList.add(i);
        }


        SSMain obj = new SSMain(intList);

        List<Integer> sortedList = obj.selectionSort();
        var sortString = sortedList.toString();

        sortString = sortString.replace("[","");
        sortString = sortString.replace("]","");
        sortString = sortString.replace(",","");

        out.println(sortString);
    }

    /**
     * @author BoogieMonster1O1
     * Sorting Class
     * <p>Inner class of the Main class. This class does the selection sorting and its methods pass the sorted List back to the main method.</p>
     */
    private static class SSMain{
        /**
         * Integer List
         * <p>This list contains first the unsorted value passed by the main method, and later is sorted by the <code>selectionSort</code> method</p>
         */
        List<Integer> integerList;

        /**
         * @author BoogieMonster1O1
         * @param list Stores list as an Instance variable
         * Main Constructor
         * <p>Not much here, but this constructor is very important as it initializes the <code>integerList</code> variable by taking value in the form of an argument from the Main class</p>
         */
        SSMain(List<Integer> list){
            this.integerList = list;
        }

        /**
         * @author BoogieMonster1O1
         * @return Returns the Sorted LinkedList
         * Sorting Method
         * <p>This class does pretty much all the behaviour. Its values are provided by the constructor.</p>
         * <b>Loop Description</b><br>
         * <p>The First <code>for</code> loop initializes a variable <code>i</code> that increments itself by 1. Its value is always less than the size of <code>integerList</code></p>
         * <p>The second <code>for</code> loop initializes a variable <code>j</code> that increments itself by 1. Its value is equal to <code>i</code> from the outer loop and it too is lesser than the size of <code>integerList</code></p>
         * <b>Variable Description</b><br>
         * <table border = "1">
         *     <caption>Variable Description Table</caption>
         *     <tr>
         *         <th>
         *             Variable
         *         </th>
         *         <th>
         *             Purpose
         *         </th>
         *     </tr>
         *     <tr>
         *         <td>
         *             int smallInt
         *         </td>
         *         <td>
         *             To store the value of position i - 1 in the List
         *         </td>
         *     </tr>
         *     <tr>
         *         <td>
         *             int j
         *         </td>
         *         <td>
         *             Inner Loop Variable
         *         </td>
         *     </tr>
         *     <tr>
         *         <td>
         *             int smallIntIndex
         *         </td>
         *         <td>
         *             To store the index i - 1 of the List
         *         </td>
         *     </tr>
         *     <tr>
         *         <td>
         *             int i
         *         </td>
         *         <td>
         *             Loop Variable
         *         </td>
         *     </tr>
         * </table>
         */
        List<Integer> selectionSort(){

            int smallInt;
            int j;
            int smallIntIndex;

            for(int i = 1;i < integerList.size();i++){

                smallInt = integerList.get(i-1);
                smallIntIndex = i - 1;

                for(j = i;j < integerList.size();j++){
                    if(integerList.get(j)<smallInt){
                        smallInt = integerList.get(j);
                        smallIntIndex = j;
                    }
                }
                this.swap(i-1, smallIntIndex);
            }
            return integerList;
        }

        void swap(int sourceIndex, int destinationIndex){
            int temp = integerList.get(destinationIndex);
            integerList.set(destinationIndex, integerList.get(sourceIndex));
            integerList.set(sourceIndex, temp);
        }
    }
}


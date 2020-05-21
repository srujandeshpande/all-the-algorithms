import static java.lang.System.in
import static java.lang.System.out

class selectionsort_groovy  {

    private static List<Integer> intList = new LinkedList<>()

    static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in)
        BufferedReader br = new BufferedReader(isr)
        String[] elementsArray

        out.println("Length")
        int len = Integer.parseInt(br.readLine())
        int[] intArr = new int[len]

        out.println("Elements")
        String elements = br.readLine()
        elementsArray = elements.split(" ")
        int arrayLen = elementsArray.length
        intArr = Arrays.stream(elementsArray).mapToInt(Integer::parseInt).toArray()

        for(int i: intArr){
            intList.add(i)
        }


        SSMain obj = new SSMain(intList)

        List<Integer> sortedList = obj.selectionSort()
        String sortString = sortedList.toString()

        sortString = sortString.replace("[","")
        sortString = sortString.replace("]","")
        sortString = sortString.replace(",","")

        out.println(sortString)
    }

    private static class SSMain{
        List<Integer> integerList
        SSMain(List<Integer> list){
            this.integerList = list
        }
        List<Integer> selectionSort(){

            int smallInt
            int j
            int smallIntIndex

            for(int i = 1;i < integerList.size();i++){

                smallInt = integerList.get(i-1)
                smallIntIndex = i - 1

                for(j = i;j < integerList.size();j++){
                    if(integerList.get(j)<smallInt){
                        smallInt = integerList.get(j)
                        smallIntIndex = j
                    }
                }
                this.swap(i-1, smallIntIndex)
            }
            return integerList
        }

        void swap(int sourceIndex, int destinationIndex){
            int temp = integerList.get(destinationIndex)
            integerList.set(destinationIndex, integerList.get(sourceIndex))
            integerList.set(sourceIndex, temp)
        }
    }
}



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

import static java.lang.System.in;
import static java.lang.System.out;

public class InsertionSort_Java {
    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        out.println("Length");
        Integer length;
        try {
            length = Integer.parseInt(br.readLine());
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        out.println("Elements");
        String elements = new String();
        try {
            elements = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] stringRay = elements.split(" ");

        int[] intArr = Arrays.stream(stringRay).mapToInt(Integer::parseInt).toArray();

        InsertionSort_Java obj = new InsertionSort_Java(intArr);

        int[] sortedArray = obj.sort();

        String sortedString = Arrays.toString(sortedArray);
        sortedString = sortedString.replace('[',' ');
        sortedString = sortedString.replace(']',' ');
        sortedString = sortedString.replace(',',' ');

        out.println(sortedString);
    }

    private int[] array;

    private InsertionSort_Java(int[] arrayParam){
        this.array= arrayParam;
    }

    private int[] sort() {
        for (int j = 1; j < array.length; j++) {
            int current = array[j];
            int i = j-1;
            while ((i > -1) && (array[i] > current)) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = current;
        }
        return array;
    }
}

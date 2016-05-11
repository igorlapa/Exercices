package Arrays;

/**
 * Created by calm on 5/11/16.
 */
public class ArrayOneProgram {
    public static void main (String[] args) {
        int[] myArray = {7, 43, 2, 98};
        int sum = 0;

        for(int x=0; x<myArray.length; x++) {
            sum += myArray[x];
        }
        System.out.println(sum);
    }
}

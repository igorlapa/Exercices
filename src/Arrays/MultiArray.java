package Arrays;

/**
 * Created by calm on 5/11/16.
 */
public class MultiArray {
    public static void main (String[] args) {
        int [][][] sampleArray = {{{1, 2, 3}, {4, 5, 6}}, {{67}, {7, 8, 9}}, {{10, 11, 12}, {13, 14, 15}}};

        System.out.println(sampleArray[2][0][2]);
        sampleArray[2][0][1] = 931;

        int x = sampleArray[2][0][1];
        System.out.println(x);

        System.out.println("Array length is " + sampleArray.length);






    }
}

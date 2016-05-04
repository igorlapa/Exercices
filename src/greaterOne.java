/**
 * Created by calm on 5/4/16.
 */
public class greaterOne {
    public static void main (String[] args) {
        int res = max(77,695);
        System.out.println("The greather one is "+ res);
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }
}


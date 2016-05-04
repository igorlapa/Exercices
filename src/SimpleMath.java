/**
 * Created by calm on 5/4/16.
 */
public class SimpleMath {

    // this method return result of sum val1 +val2
    private static double Sum(double val1, double val2) {
        return val1 + val2;
    }


    // this method return result of substraction val1 - val2
    private static double Subt(double val1, double val2) {
        return val1 - val2;
    }

    // this method return result of multiplication val1 * val2
    private static double Multip(double val1, double val2) {
        return val1 * val2;
    }

    // this method return result of division val1 / val2
    private static double Divis(double val1, double val2) {
        return val1 / val2;
    }

    private static double SqrVal1(double val1) {
        return val1*val1;
    }

    private static double SqrVal2(double val2) {
        return val2*val2;
    }



    public static void main (String[] args) {



        double val1 = 2;
        double val2 = 6;

        double w = Sum(val1,val2);

        double x = Subt(val1,val2);


        double y = Multip(val1,val2);
        double z = Divis(val1,val2);

        double sqrV1 = SqrVal1(val1);
        double sqrV2 = SqrVal2(val2);

        System.out.println("Sum of  " + val1 +" + "+ val2+ "= " + w );
        System.out.println("Sumstraction of  " + val1 +" - "+ val2+ "= " + x );
        System.out.println("Multiplication of " + val1 +" * "+ val2+ "= " + y );
        System.out.println("Division of " + val1 +" / "+ val2+ "= " + z);

        if ( val1 == val2) {
            System.out.println("Squared " + val1 + "= " + sqrV1);
        }
        else {
            System.out.println("Squared " + val1 + "= " + sqrV1);
            System.out.println("Squared " + val2 + "= " + sqrV2);
        }

    }
}

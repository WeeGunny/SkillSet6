//Luke SImpson
import java.util.*;

public class e1b {

    public static void main(String[] args) {
        int nInput = 0, nAvg, nSum = 0;
        Scanner sin = new Scanner(System.in);
        int arnNumbers[] = new int[5];
        while (nInput == 0) {
            System.out.println("Enter (1) to input numbers or (2) to display numbers");
            nInput = sin.nextInt();
            if (nInput == 1) {
                for (int i = 0; i < 5; i++) {
                    System.out.println("Enter a Number");
                    arnNumbers[i] = sin.nextInt();
                }
                for (int i = 0; i < 5; i++) {
                    nSum += arnNumbers[i];
                }
                nAvg = nSum / 5;
                System.out.println("The sum of the numbers is " + nSum + ". The average mark is " + nAvg);
                nInput = 0;
            } else if (nInput == 2) {
                System.out.println("The Numbers are...");
                for (int i = 0; i < 5; i++) {
                    nSum += arnNumbers[i];
                    System.out.println(arnNumbers[i]);
                }
                nAvg = nSum / 5;
                System.out.println("The sum of the numbers is " + nSum + ". The average mark is " + nAvg);

            }
            nSum = 0;
            nAvg = 0;
            nInput = 0;
        }
    }
}

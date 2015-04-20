
import java.util.Scanner;

//Luke Simpson
public class e1d {

    public static void main(String[] args) {
        int nInput, nSum = 0, nAvg, nSize = 0, nBiggest, nSmallest;
        Scanner sin = new Scanner(System.in);
        int arnNumbers[] = new int[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Enter a Number, enter 0 when finished");
            nInput = sin.nextInt();
            if (nInput == 0) {
                break;
            } else {
                arnNumbers[i] = nInput;
            }
            nSize = i+1;
        }
        for (int i = 0; i < 20; i++) {
            nSum += arnNumbers[i];
        }
        nAvg = nSum / nSize;
        nBiggest = biggest(arnNumbers, nSize);
        nSmallest = smallest(arnNumbers, nSize);
        System.out.println("The smallest number is " + nSmallest);
        System.out.println("The largest number is " + nBiggest);
        System.out.println("The sum of the numbers is " + nSum + ". The average mark is " + nAvg);


    }

    public static int biggest(int arnNumbers[], int nSize) {
        int nBiggest = 0;
        for (int i = 0; i < nSize; i++) {
            if (nBiggest < arnNumbers[i]) {
                nBiggest = arnNumbers[i];
            }
        }
        return nBiggest;
    }

    public static int smallest(int arnNumbers[], int nSize) {
        int nSmallest = arnNumbers[0];
        for (int i = 0; i < nSize; i++) {
            if (nSmallest > arnNumbers[i]) {
                nSmallest = arnNumbers[i];
            }
        }
        return nSmallest;
    }
}

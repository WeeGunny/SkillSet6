//Luke Simpson
import java.util.Scanner;

public class SLTest6 {

    public static void main(String[] args) {
        int arnNumbers[] = new int[100];
        int nSize = 100, nOdd = 0, nEven = 0, nChoice;
        Scanner sin = new Scanner(System.in);
        for (int i = 0; i <= nSize;) {
            System.out.println("Gimme a number");
            arnNumbers[i] = sin.nextInt();
            if (EorO(arnNumbers[i]) == false) {
                nOdd++;
            }
            if (EorO(arnNumbers[i]) == true) {
                nEven++;
            }
            if (arnNumbers[i] == 0) {
                break;
            }
        }

        System.out.println("Do you want Odd(1) or Even(2)?");
        nChoice = sin.nextInt();
        if (nChoice == 1) {
            System.out.println("You entered " + nOdd + " Odd numbers");
        } else if (nChoice == 2) {
            System.out.println("You entered " + nEven + " Even numbers");
        }


    }

    public static boolean EorO(int nNum) {
        if (nNum % 2 == 0) {
            return true;
        }
        return false;
    }
}

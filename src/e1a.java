
import java.util.Scanner;

//Luke Simpson
public class e1a {

    public static void main(String[] args) {
        int arnMarks[] = new int[4];
        int nAvg = 0;
        Scanner sin = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            System.out.println("Enter a Mark");
            arnMarks[i] = sin.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            nAvg += arnMarks[i];
        }
        nAvg /= 4;
        System.out.println("The average mark is " + nAvg);
    }
}

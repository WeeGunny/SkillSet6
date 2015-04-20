
import java.util.Scanner;

//Luke Simpson
public class e1c {

    public static void main(String[] args) {
        int nInput,nSize=5,nBiggest,nSmallest;
        Scanner sin = new Scanner(System.in);
        int arnNumbers[] = new int[5];
        System.out.println("You will input 5 numbers");
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a Number");
            arnNumbers[i] = sin.nextInt();
        }
        System.out.println("Enter (1) to display largest number(2) to display smallest");
            nInput = sin.nextInt();
            
            if (nInput==1){
               nBiggest= biggest(arnNumbers,nSize);
               System.out.println("The largest number is "+nBiggest);
            }
            else if (nInput==2){
                nSmallest= smallest(arnNumbers,nSize);
               System.out.println("The smallest number is "+nSmallest);
            }
    }
    public static int biggest(int arnNumbers[],int nSize){
        int nBiggest=0;
        for (int i = 0; i < nSize; i++){
            if(nBiggest<arnNumbers[i]){
              nBiggest=arnNumbers[i];  
            }
        }
        return nBiggest;
    }
     public static int smallest(int arnNumbers[],int nSize){
        int nSmallest=arnNumbers[0];
        for (int i = 0; i < nSize; i++){
            if(nSmallest>arnNumbers[i]){
              nSmallest=arnNumbers[i];  
            }
        }
        return nSmallest;
    }
}

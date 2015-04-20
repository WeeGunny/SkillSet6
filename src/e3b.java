
import java.util.Scanner;


public class e3b {

    public static void main(String[] args) {
      int nGuess,nAnswer=15;
      int nMax=100;
      int nHigh=nMax,nLow=1;
      int arnGuess[] = new int[nMax];
      Scanner sin = new Scanner(System.in);
      for(int i=0;i<nMax;i++){
      System.out.println("Guess a number");
        nGuess = sin.nextInt();
        if(nGuess<nAnswer){
            System.out.println("Higher");
            nLow=nGuess;
        }
        if(nGuess>nAnswer){
            System.out.println("Lower");
            nHigh=nGuess;
        }
        if(nGuess==nAnswer){
            System.out.println("Congradulations you got it!!!");
            break;
        }
    }
    }
}

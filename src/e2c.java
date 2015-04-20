
import java.util.Scanner;


public class e2c {

    public static void main(String[] args) {
       int nA,nQ,nK,nX;
       double arnYValue[] = new double[11];
       Scanner sin = new Scanner(System.in);
        System.out.println("y = a(x - q)^2 + k");
        System.out.println("Enter A's value");
        nA = sin.nextInt();
        System.out.println("Enter Q's value");
        nQ = sin.nextInt();
       System.out.println("Enter K's value");
        nK = sin.nextInt();
        System.out.println();
        System.out.println("x \t y");
        for (nX=0;nX<11;nX++){  
            arnYValue[nX]=YValue(nA,nQ,nK, nX);
            System.out.println((nX-5)+"\t"+arnYValue[nX]);
        }
    }
    public static double YValue(int nA,int nQ, int nK,int nX){
        double dY;
            dY= nA*Math.pow((nX-5)-nQ,2)+nK;
       return dY; 
}
}

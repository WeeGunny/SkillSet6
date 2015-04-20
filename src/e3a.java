//LukeSImpson
import java.util.*;

public class e3a {

    public static void main(String[] args) {
        int arnPrime[] = new int[101];
        int nSize = 100;
        for (int nCount = 0; nCount <= nSize;) {

            for (int i = 1; i < 1000; i++) {
                if (Prime(i) == true) {
                    arnPrime[nCount] = i;
                    System.out.println(arnPrime[nCount]);
                    nCount++;
                    if(nCount==101){
                        break;
                    }
                }
            }
        }
    }

    public static boolean Prime(int nNum) {
        for (int i = 2; i < nNum; i++) {
            if (nNum % i == 0) {
                return false;
            }
        }
        return true;
    }

}
//Luke Simpson
public class e2a {

    public static void main(String[] args) {
        int arnDice[] = new int[1000];
        double dProb11 = 0, dProb7 = 0;
        int nSize = 1000, nSum;
        for (int i = 0; i < 1000; i++) {
            arnDice[i] = dice(arnDice, nSize);

            if (arnDice[i] == 7) {
                dProb7++;
            } else if (arnDice[i] == 11) {
                dProb11++;
            }
        }
        dProb11 = dProb11 / 1000;
        dProb7 = dProb7 / 1000;
        System.out.println("The probability of rolling 7 is " + dProb7);
        System.out.println("The probability of rolling 11 is " + dProb11);
    }

    public static int dice(int arnDice[], int nSize) {
        int nDice1, nDice2, nDiceSum;
        nDice1 = (int) (Math.random() * 6)+1;
        nDice2 = (int) (Math.random() * 6)+1;
        nDiceSum = nDice1 + nDice2;
        return nDiceSum;
    }
}

//Luke simpson
public class e2b {

    public static void main(String[] args) {
        int nTable,nCount,nValue=0;
       int arnNumbers[] = new int[2000];
       
        for(nTable=10;nTable<31;nTable++){
         System.out.print("\t"+ nTable);   
        }
              
       for (int i=0;i<2000;i++){
           arnNumbers[i]= (int) (Math.random()*21)+10;
       }
       System.out.println();
       for(nCount=10;nCount<31;nCount++){
           nValue=0;
           for(int i=0;i<2000;i++) 
           if (arnNumbers[i]==nCount){
               nValue++;
           }
            System.out.print("\t"+nValue);
       }
      
       System.out.println();
    }
}

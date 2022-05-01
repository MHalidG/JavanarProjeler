package src.mixedProblems;


import java.util.Arrays;

public class ArrayElemanSayısı {
    public static void main(String[] args) {
        int A[]={4,4,5,5,6,6,8,8,0,0,'a','a'};

      boolean sonuc=arrayInt(A);
      System.out.println(sonuc);
      System.out.println(Arrays.toString(A));
    }
    public static boolean arrayInt(int[ ] A) {


        int count = 0;
        boolean sonuc = count%2==0;
        for (int each : A
        ) {
            for (int i = 0; i < A.length; i++) {
                if (A[i]==each) {
                    count++;
                    i++;
                }
            }
        }
        return sonuc;
    }
        
        
}

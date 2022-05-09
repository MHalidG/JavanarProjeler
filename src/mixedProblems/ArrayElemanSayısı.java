    package src.mixedProblems;


import java.util.Arrays;

public class ArrayElemanSayısı {
    public static void main(String[] args) {
        int A[] = {4, 4,4,5,5,4, 5, 5, 6, 6, 8, 8, 0, 0, 'a', 'a'};

        boolean sonuc = arrayInt(A);
        System.out.println(sonuc);
        System.out.println(Arrays.toString(A));
        //System.out.println(Integer.MAX_VALUE);
    }

    public static boolean arrayInt(int[] A) {
        int count = 0;
        boolean control=true;
        for (int j = 0; j < A.length; j++) {
            if (control = true) {
                if (count % 2 == 0) {
                    for (int i = 0; i < A.length; i++) {
                        if (A[i] == A[j]) {
                            count++;
                        }
                    }
                } else {
                    control = false;
                    break;
                }

            } else break;
        }
        boolean sonuc = count%2==0;
        return sonuc;
    }
}
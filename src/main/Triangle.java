package main;

import java.util.*;

/**
 * Created by meister4ever on 12/6/16.
 */
public class Triangle {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int n = A.length;

        for (int i=0;i<n-2;i++){
            long res1 = A[i];
            long res2 = A[i+1];
            long res3 = A[i+2];
            if (res1+res2>res3){
                return 1;
            }
        }
        return 0;
    }
}

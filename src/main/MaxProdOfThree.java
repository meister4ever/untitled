package main;

import java.util.Arrays;

/**
 * Created by sebas on 30/09/2016 .
 */
public class MaxProdOfThree {
    public int solution(int[] A) {
        Arrays.sort(A);
        int n= A.length;
        int a=(A[0] * A[1] * A[n-1]);
        int b=A[n-1] * A[n-2] * A[n-3];
        return Math.max(a,b);
    }
}

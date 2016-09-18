package main;

import java.math.BigDecimal;

public class MinAvgTwoSlice {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        double max = 10001;
        int minIndex = 0;
        for (int i = 0; i < n - 1; i++) {
            double prom1 = (A[i] + A[i + 1]) / (double)2;
            System.out.println(prom1);
            if (prom1 < max) {
                max = prom1;
                minIndex = i;
            }
            if (i < n - 2) {
                double prom2 = (A[i] + A[i + 1] + A[i + 2]) / (double)3;
                System.out.println(prom2);
                if (prom2 < max) {
                    max = prom2;
                    minIndex = i;
                }
            }
        }
        return minIndex;
    }
}
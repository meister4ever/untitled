package main;

public class TapeEquilibrium {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int left = 0;
        int right = 0;
        int n = A.length;
        for (int i = 0; i < n; i++) {
            right += A[i];
        }
        int diff = Math.abs(A[1] - (right - A[1]));
        int min = diff;
        for (int i = 0; i < n - 1; i++) {
            right -= A[i];
            left += A[i];
            diff = Math.abs(left - right);
            min = Math.min(diff, min);
        }
        return min;
    }
}

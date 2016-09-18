package main;

public class MissingInteger {
    public int solution(int[] A) {
        int n = A.length;
        boolean b[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n)
                b[A[i] - 1] = true;
        }
        for (int i = 0; i < b.length; i++) {
            if (!b[i]) {
                return i + 1;
            }
        }
        return n + 1;
    }
}

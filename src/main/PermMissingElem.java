package main;

public class PermMissingElem {
    public int solution(int[] A) {
        int n = A.length;
        boolean b[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n)
                b[A[i] - 1] = true;
        }
        for (int j = 0; j < b.length; j++) {
            if (!b[j]) {
                return j + 1;
            }
        }
        return n + 1;
    }
}

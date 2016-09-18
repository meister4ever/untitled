package main;

public class PermCheck {
    public int solution(int[] A) {
        int n = A.length;
        boolean B[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (A[i] > 0 && A[i] <= n)
                B[A[i] - 1] = true;
        }
        for (int i = 0; i < n; i++) {
            if (B[i] == false) {
                return 0;
            }
        }
        return 1;
    }
}

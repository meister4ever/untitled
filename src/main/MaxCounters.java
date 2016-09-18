package main;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int result[] = new int[N];
        int maxCount = 0;
        int last_increase = 0;
        for (int i = 0; i < n; i++) {
            if (A[i] <= N) {
                result[A[i] - 1] = Math.max(result[A[i] - 1], last_increase);
                result[A[i] - 1]++;
                maxCount = Math.max(result[A[i] - 1], maxCount);
            }
            if (A[i] == N + 1)
                last_increase = maxCount;
        }
        for (int i = 0; i < N; i++) {
            result[i] = Math.max(result[i], last_increase);
        }
        return result;
    }
}

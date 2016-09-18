package main;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        boolean B[] = new boolean[X];
        int size = A.length;
        int time = -1;
        int positions = X;
        for (int i = 0; i < size; i++) {
            if (!B[A[i] - 1]) {
                B[A[i] - 1] = true;
                positions--;
            }
            if (positions == 0) {
                time = i;
                break;
            }
        }
        return time;
    }
}



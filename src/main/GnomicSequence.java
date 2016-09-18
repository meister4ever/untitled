package main;

/**
 * Created by meister4ever on 12/6/16.
 */
public class GnomicSequence {
    public int[] solution(String S, int[] P, int[] Q) {
        int p1 = 0;
        int p2 = 0;
        int n = S.length();

        int size = P.length;
        int[] A = new int[n];
        int[] C = new int[n];
        int[] G = new int[n];
        int[] T = new int[n];

        int[] solution = new int[size];

        int lastseenA = -1;
        int lastseenC = -1;
        int lastseenG = -1;
        int lastseenT = -1;


        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == 'A')
                lastseenA = i;
            if (S.charAt(i) == 'C')
                lastseenC = i;
            if (S.charAt(i) == 'G')
                lastseenG = i;
            if (S.charAt(i) == 'T')
                lastseenT = i;
            A[i] = lastseenA;
            C[i] = lastseenC;
            G[i] = lastseenG;
            T[i] = lastseenT;
        }

        for (int j = 0; j < size; j++) {
            p1 = P[j];
            p2 = Q[j];
            if (A[p2] >= p1)
                solution[j] = 1;
            else if (C[p2] >= p1)
                solution[j] = 2;
            else if (G[p2] >= p1)
                solution[j] = 3;
            else if (T[p2] >= p1)
                solution[j] = 4;
        }
        return solution;
    }
}

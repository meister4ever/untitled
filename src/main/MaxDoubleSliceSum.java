package main;

/**
 * Created by nacho on 8/10/2016.
 */
public class MaxDoubleSliceSum {

    public static int max(int a, int b) {
        return (a > b ? a : b);
    }

    public int solution(int[] A){
        int len_A = A.length;
        int[] maxEnds = new int[len_A];
        int maxEndAct = 0;

        for (int i = 1; i < len_A-1; i++){
            maxEndAct = max(0, A[i] + maxEndAct);
            maxEnds[i] = maxEndAct;
        }

        int[] maxBegins = new int[len_A];
        int maxBeginAct = 0;
        for (int i = len_A-2; i >= 0; i--){
            maxBeginAct = max(0, A[i] + maxBeginAct);
            maxBegins[i] = maxBeginAct;
        }

        int maxDoubleSlice = 0;
        for (int i = 0; i < len_A-2; i++)
            maxDoubleSlice = max(maxDoubleSlice, maxEnds[i] + maxBegins[i+2]);

        return maxDoubleSlice;
    }

}

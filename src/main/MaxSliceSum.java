package main;
import java.lang.reflect.Array;

/**
 * Created by nacho on 7/10/2016.
 */
public class MaxSliceSum {

    public static int max(int[] A) {
        int max_val = -10000;
        for (int a_i: A){
            max_val = (max_val > a_i ? max_val : a_i);
        }
        return max_val;
    }

    public static int max(int a, int b) {
        return (a > b ? a : b);
    }

    public int solution(int[] A) {
        int max_ending = 0;
        int max_slice = 0;
        int max_A = max(A);
        if (max_A < 0)
            return max_A;

        for (int a_i: A) {
            max_ending = max(0, max_ending + a_i);
            max_slice = max(max_slice, max_ending);
        }

        return max_slice;
    }

}

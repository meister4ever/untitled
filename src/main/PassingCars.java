package main;

/**
 * Created by meister4ever on 11/6/16.
 */
public class PassingCars {
    public int solution(int[] A) {
        int n = A.length;
        int passing = 0;
        int west = 0;
        for (int i = n - 1; i > -1; i--) {
            if (passing > 1000000000)
                return -1;
            if (A[i] == 0) {
                passing += west;
            } else {
                west++;
            }
        }
        return passing;
    }
}

package main;

/**
 * Created by meister4ever on 12/6/16.
 */
public class Test1 {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        long left = 0;
        long equals = 0;
        int n = A.length;
        for (int element : A)
            if (element==X)
                equals+=1;
        long differences = n - equals;

        int same=0;
            for (int i = 0; i < n; i++) {
                if (differences==same)
                    return i;
                if (A[i] == X){
                    same++;
                }
                else
                    differences--;
            }
        return -1;
    }
}

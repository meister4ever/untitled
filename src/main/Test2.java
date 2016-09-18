package main;

/**
 * Created by meister4ever on 12/6/16.
 */
public class Test2 {
    public int solution(int A, int B) {
        int X = Math.abs(A);
        int Y = Math.abs(B);

        if (X == 2 && Y == 2)
            return 4;
        if (X == 1 && Y == 0)
            return 3;

        int diff = X - Y;
        double solution = -1;
        if (Y > diff)
            solution = 2 * Math.floor((Y - diff) / 3) + diff;
        else
            solution = diff - 2 * Math.floor((diff - Y) / 4);
        return (int)solution;
    }
}

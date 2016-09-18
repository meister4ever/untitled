package main;

public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int diff = Y - X;
        int div = diff / D;
        if (diff == 0)
            return 0;
        if (div < 1)
            return 1;
        if (div == 1)
            return 1;
        if (div * D == diff)
            return div;
        return div + 1;
    }
}

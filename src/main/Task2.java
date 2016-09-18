package main;

public class Task2 {
    public int solution(int A, int B) {
        int x = Math.abs(A);
        int y = Math.abs(B);
        int Max = 100000000;
        int result = -1;

        if (y > x) {
            int temp = y;
            y = x;
            x = temp;
        }
        if (x == 2 && y == 2)
            return 4;
        if (x == 1 && y == 0)
            return 3;

        if (y == 0 || (float) y / (float) x <= 0.5) {
            int xClass = x % 4;
            int initX = 0;

            if (xClass == 0)
                initX = x / 2;
            else if (xClass == 1)
                initX = 1 + (x / 2);
            else if (xClass == 2)
                initX = 1 + (x / 2);
            else
                initX = 1 + ((x + 1) / 2);

            if (xClass > 1)
                result = initX - (y % 2);
            else
                result = initX + (y % 2);

        } else {
            int diagonal = x - ((x - y) / 2);
            if ((x - y) % 2 == 0) {
                if (diagonal % 3 == 0)
                    return (diagonal / 3) * 2;
                if (diagonal % 3 == 1)
                    result = ((diagonal / 3) * 2) + 2;
                else
                    result = ((diagonal / 3) * 2) + 2;
            } else
                result = ((diagonal / 3) * 2) + 1;
        }
        if (result > Max)
            result = -2;
        return result;
    }
}

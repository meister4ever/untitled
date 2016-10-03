package main;

/**
 * Created by nacho on 2/10/2016.
 */
public class StoneWall {
    public static int solution(int[] data) {
        int[] stack = new int[data.length];
        int stack_num = 0;
        int stones = 0;
        for (int i : data) {
            while (stack_num > 0 && stack[stack_num - 1] > i) {
                stack_num -= 1;
            }
            if (!(stack_num > 0 && stack[stack_num - 1] == i)) {
                stack[stack_num] = i;
                stones++;
                stack_num++;
            }
        }
        return stones;
    }
}

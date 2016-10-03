package main;

/**
 * Created by nacho on 2/10/2016.
 */
public class Fish {
    public static int solution(int[] A, int[] B) {
        int survivals = 0;
        int n_tot = A.length;
        int[] stack = new int[n_tot];
        int stack_len = 0;

        for (int i = 0; i < n_tot; i++) {
            if (B[i] == 1) {
                stack[stack_len] = A[i];
                stack_len++;
            } else {
                while (stack_len != 0) {
                    if (stack[stack_len - 1] < A[i])
                        stack_len--;
                    else {
                        survivals--;
                        break;
                    }
                }
                survivals++;
            }
        }

    survivals += stack_len;

    return survivals;
    }
}

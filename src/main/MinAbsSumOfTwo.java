package main;
import java.io.*;
import java.util.*;
import java.math.*;

public class MinAbsSumOfTwo {
	public static int abs(int a){
		return (a > 0 ? a : -a);
	}
	
	public static int min(int a, int b){
		return (a < b ? a : b);
	}
	
	public static int solution(int[] A) {
		Arrays.sort(A);
		// e.g.: {1, 3, 5}
		if (A[0] >= 0)
			return 2*A[0];
		// e.g.: {-5, -3, -1}
		if (A[A.length-1] <= 0)
			return -2*A[A.length-1];
		
		
		int i = 0;
		int j = A.length - 1;
		int minSum = 2000000000;
    
		while (i <= j) {
			int sum = A[i] + A[j];
			minSum = min(minSum, abs(sum));
			if (sum < 0)
				i += 1;
			else if (sum > 0)
				j -= 1;
			else
				return 0;
		}
		
		
		return minSum;
	}

    public static void main(String[] args) {        
        //Scanner scan = new Scanner(System.in);
		
			int[] in_vec = {1, 4, -3};
			//int[] in_vec = {-8, 4, 5, -10, 3};
			//int[] in_vec = {-5, -3, -1, 0, 3, 6};
		
			int res = solution(in_vec);
			
            System.out.println(res);
			
    }
}
package main;
import java.util.*;

public class Distinct {
    public int solution(int[] A) {
        Arrays.sort(A);
        int n = A.length;
        if (n==0)
            return 0;
        int last = A[0];
        int count=1;
        for (int i=1; i<n;i++) {
            int newElem = A[i];
            if (last!=newElem) {
                count++;
                last=newElem;
            }
        }
        return count;
    }
}

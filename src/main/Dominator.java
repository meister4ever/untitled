package main;

public class Dominator {
    public int solution(int[] A) {
        int n = A.length;
        int candidate = 0;
        int cnt = 0;
        for (int i=0; i<n;i++){
            if (candidate==0) {
                candidate = A[i];
                cnt = 1;
            }
            else{
                if (A[i]!=candidate){
                    cnt--;
                    if (cnt == 0)
                        candidate=0;
                }
                else
                    cnt++;
            }
        }

        int lastseen=0;
        int count=0;
        for (int j=0; j<n;j++){
            if (A[j] == candidate){
                lastseen=j;
                count++;
            }
        }
        if (count>n/2){
            return lastseen;
        }
        return -1;
    }
}

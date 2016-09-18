package test;

import main.MinAvgTwoSlice;

import static org.junit.Assert.assertEquals;

public class MinAvgTwoSliceTest {
    @org.junit.Test
    public void TestBasic() {
        MinAvgTwoSlice sol = new MinAvgTwoSlice();
        int[] A = {4,2,2,5,1,5,8};
        assertEquals(1, sol.solution(A));
    }
    @org.junit.Test
    public void TestThree() {
        MinAvgTwoSlice sol = new MinAvgTwoSlice();
        int[] A = {4,4,6,6,1,2,1};
        assertEquals(4, sol.solution(A));
    }
}


package test;

import main.MinAbsSumOfTwo;

import static org.junit.Assert.assertEquals;

public class MinAbsSumOfTwoTest {
    @org.junit.Test
    public void TestBasic() {
        MinAbsSumOfTwo sol = new MinAbsSumOfTwo();
        int[] A = {1, 4, -3};
        assertEquals(1, sol.solution(A));
    }
    @org.junit.Test
    public void TestOne() {
        MinAbsSumOfTwo sol = new MinAbsSumOfTwo();
        int[] A = {-8, 4, 5, -10, 3};
        assertEquals(3, sol.solution(A));
    }
	@org.junit.Test
    public void TestTwo() {
        MinAbsSumOfTwo sol = new MinAbsSumOfTwo();
        int[] A = {-5, -3, -1, 0, 3, 6};
        assertEquals(0, sol.solution(A));
    }
	@org.junit.Test
    public void TestAllPositive() {
        MinAbsSumOfTwo sol = new MinAbsSumOfTwo();
        int[] A = {0, 11, 5, 2, 19};
        assertEquals(0, sol.solution(A));
    }
	@org.junit.Test
    public void TestAllNegative() {
        MinAbsSumOfTwo sol = new MinAbsSumOfTwo();
        int[] A = {-5, -1, -7, -3};
        assertEquals(2, sol.solution(A));
    }
}
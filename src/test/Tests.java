package test;
import main.*;

import static org.junit.Assert.*;

public class Tests {
    @org.junit.Test
    public void testMissingSimpleList(){
        PermMissingElem miss= new PermMissingElem();
        int[] A = {1, 3, 6, 4, 1, 2};
        assertTrue(miss.solution(A)==5);
    }

    @org.junit.Test
    public void testMissingLarge(){
        PermMissingElem miss= new PermMissingElem();
        int[] A = new int[100001];
        for (int i= 0; i<A.length-1; i++){
            A[i]=i+1;
        }
        A[A.length-1]=100002;
        assertTrue(miss.solution(A)==100001);
    }
    @org.junit.Test
    public void TestTwoElements() {
        PermMissingElem sol = new PermMissingElem();
        int[] A = {1};
        assertEquals(2, sol.solution(A));
    }
    @org.junit.Test
    public void testFrogRiver() {
        FrogRiverOne river = new FrogRiverOne();
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};
        assertTrue(river.solution(4,A) == 4);
    }

    @org.junit.Test
    public void testPassingCars() {
        PassingCars sol = new PassingCars();
        int[] A = {0,1,0,1,1};
        assertTrue(sol.solution(A) == 5);
    }

    @org.junit.Test
    public void testGnomicSequence() {
        GnomicSequence sol = new GnomicSequence();
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};
        int[] result = {2, 4, 1};
        String S = "CAGCCTA";
        assertArrayEquals(result, sol.solution(S,P,Q));
    }

    @org.junit.Test
    public void TriangleTest() {
        Triangle sol = new Triangle();
        int[] P = {2147483647, 2147483647, 2147483647};
        assertEquals(1, sol.solution(P));
    }

    @org.junit.Test
    public void DominatorTest() {
        Dominator sol = new Dominator();
        int[] P = {3,4,3,2,3,-1,3,3};
        assertEquals(7, sol.solution(P));
    }

    @org.junit.Test
    public void DistinctTest() {
        Distinct sol = new Distinct();
        int[] P = {2,1,1,2,3,1};
        assertEquals(3, sol.solution(P));
    }



    @org.junit.Test
    public void Test1() {
        Test1 sol = new Test1();
        int[] A = {5,5,1,7,2,3,5};
        assertEquals(4, sol.solution(5,A));
    }

    @org.junit.Test
    public void Test12() {
        Test1 sol = new Test1();
        int[] A = {5,5,1,7,2,3,5};
        assertEquals(4, sol.solution(0,A));
    }

    @org.junit.Test
    public void Task2oneZeroTest() {
        Task2 sol = new Task2();
        assertEquals(3, sol.solution(1,0));
    }

    @org.junit.Test
    public void Task2TwosTest() {
        Task2 sol = new Task2();
        assertEquals(4, sol.solution(2,2));
    }

    @org.junit.Test
    public void Task2negativeFoursTest() {
        Task2 sol = new Task2();
        assertEquals(4, sol.solution(-4,-4));
    }


    @org.junit.Test
    public void Test2() {
        Task2 sol = new Task2();
        assertEquals(3, sol.solution(3,2));
    }

    @org.junit.Test
    public void Test3() {
        Test3 sol = new Test3();
        int[] A = {1,0,0,1,1};
        int[] res = {1,1,0,1};
        assertEquals(res, sol.solution(A));
    }

    @org.junit.Test
    public void TestStoneWall() {
        StoneWall sol = new StoneWall();
        int[] A = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        assertEquals(7, sol.solution(A));
    }

    @org.junit.Test
    public void TestFish() {
        Fish sol = new Fish();
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        assertEquals(2, sol.solution(A, B));
    }

    @org.junit.Test
    public void TestMaxSliceSum() {
        MaxSliceSum sol = new MaxSliceSum();
        int[] A = {3, 2, -6, 4, 0};
        assertEquals(5, sol.solution(A));
    }

    @org.junit.Test
    public void TestMaxSliceSumNegs() {
        MaxSliceSum sol = new MaxSliceSum();
        int[] A = {-3, -2, -6, -4, -1};
        assertEquals(-1, sol.solution(A));
    }

}

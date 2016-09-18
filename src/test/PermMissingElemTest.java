package test;

import main.PermMissingElem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PermMissingElemTest {
    @org.junit.Test
    public void TestBasic() {
        PermMissingElem sol = new PermMissingElem();
        int[] A = {2,3,1,5};
        assertEquals(4, sol.solution(A));
    }
    @org.junit.Test
    public void testMissingSimpleList(){
        PermMissingElem miss= new PermMissingElem();
        int[] A = {1, 3, 6, 4, 1, 2};
        assertTrue(miss.solution(A)==5);
    }
    @org.junit.Test
    public void TestTwoElements() {
        PermMissingElem sol = new PermMissingElem();
        int[] A = {1};
        assertEquals(2, sol.solution(A));
    }
    @org.junit.Test
    public void TestOneElement() {
        PermMissingElem sol = new PermMissingElem();
        int[] A = {2};
        assertEquals(1, sol.solution(A));
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
}

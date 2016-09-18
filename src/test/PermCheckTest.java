package test;

import main.PermCheck;
import main.PermMissingElem;

import static org.junit.Assert.assertEquals;

public class PermCheckTest {
    @org.junit.Test
    public void TestBasic() {
        PermCheck sol = new PermCheck();
        int[] A = {4,1,3};
        assertEquals(0, sol.solution(A));
    }
}

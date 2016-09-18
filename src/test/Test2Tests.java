package test;

import main.Test2;

import static org.junit.Assert.assertEquals;

public class Test2Tests {

    @org.junit.Test
    public void Task2oneOneTest() {
        Test2 sol = new Test2();
        assertEquals(2, sol.solution(1,1));
    }

    @org.junit.Test
    public void Task2oneZeroTest() {
        Test2 sol = new Test2();
        assertEquals(3, sol.solution(1,0));
    }
    @org.junit.Test
    public void Task2twoTwoTest() {
        Test2 sol = new Test2();
        assertEquals(4, sol.solution(2,2));
    }

    @org.junit.Test
    public void Task2ThreeTwoTest() {
        Test2 sol = new Test2();
        assertEquals(3, sol.solution(3,2));
    }

    @org.junit.Test
    public void Task2FoursTest() {
        Test2 sol = new Test2();
        assertEquals(4, sol.solution(4,4));
    }

    @org.junit.Test
    public void largeNegatives() {
        Test2 sol = new Test2();
        assertEquals(-2, sol.solution(-100000000,-1000000000));
    }
}

package test;

import main.Task2;

import static org.junit.Assert.assertEquals;

public class Task2Test {
    @org.junit.Test
    public void Task2oneOneTest() {
        Task2 sol = new Task2();
        assertEquals(2, sol.solution(1, 1));
    }

    @org.junit.Test
    public void Task2oneZeroTest() {
        Task2 sol = new Task2();
        assertEquals(3, sol.solution(1, 0));
    }

    @org.junit.Test
    public void Task2twoTwoTest() {
        Task2 sol = new Task2();
        assertEquals(4, sol.solution(2, 2));
    }

    @org.junit.Test
    public void Task2ThreeTwoTest() {
        Task2 sol = new Task2();
        assertEquals(3, sol.solution(3, 2));
    }

    @org.junit.Test
    public void Task2FoursTest() {
        Task2 sol = new Task2();
        assertEquals(4, sol.solution(4, 4));
    }

    @org.junit.Test
    public void minusOneZeroNegative() {
        Task2 sol = new Task2();
        assertEquals(3, sol.solution(-1, 0));
    }

    @org.junit.Test
    public void tooLargeNegatives() {
        Task2 sol = new Task2();
        assertEquals(-2, sol.solution(-100000000, -1000000000));
    }
}

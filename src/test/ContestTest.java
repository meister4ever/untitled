package test;

import main.Contest;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ContestTest {
    @org.junit.Test
    public void Test4() {
        Contest sol = new Contest();
        String word = "word";
        String[] phrases = {"word is drow when dwor","nothing to see here"};
        assertArrayEquals(new int[]{3, 0}, sol.amountOfAnagrams(word,phrases));
    }
    @org.junit.Test
    public void Test5() {
        Contest sol = new Contest();
        int n = 2;
        assertEquals(2, sol.waysToClimb(n));
    }
    @org.junit.Test
    public void Test5bis() {
        Contest sol = new Contest();
        int n = 10;
        assertEquals(89, sol.waysToClimb(n));
    }
    @org.junit.Test
    public void Test6() {
        Contest sol = new Contest();
        int[] p = {-5, 4, -2, 3, 1, -1, -6, -1, 0, 5};
        assertEquals(8, sol.ironMan(p));
    }
    @org.junit.Test
    public void Test6bis() {
        Contest sol = new Contest();
        int[] p = {-5, 4, -2, 3, 1};
        assertEquals(6, sol.ironMan(p));
    }
    @org.junit.Test
    public void Test6bisbis() {
        Contest sol = new Contest();
        int[] p = {-5, 4, -2, 3, 1, -1, -6, -1, 0, -5};
        assertEquals(13, sol.ironMan(p));
    }
    @org.junit.Test
    public void Test7() {
        Contest sol = new Contest();
        long[] nvalues = {5,3};
        int[] result = {4,3};
        assertArrayEquals(result, sol.MinOperations(nvalues));
    }
    @org.junit.Test
    public void Test8() {
        Contest sol = new Contest();
        long result = 3;
        int[] numbers = {1, 2, 3};
        assertEquals(result, sol.countMoves(numbers));
    }
    @org.junit.Test
    public void Test8bis() {
        Contest sol = new Contest();
        long result = 0;
        int[] numbers = {2, 2, 2};
        assertEquals(result, sol.countMoves(numbers));
    }
}

package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Contest {

    public boolean isAnagram(String firstWord, String secondWord) {

        int n = firstWord.length();
        int m = secondWord.length();
        if (n != m) {
            return false;
        }
        char[] word1 = firstWord.toCharArray();
        char[] word2 = secondWord.toCharArray();
        Arrays.sort(word1);
        Arrays.sort(word2);
        return Arrays.equals(word1, word2);
    }

    public boolean areAnagrams(String firstWord, String secondWord) {

        char[] word1 = "test".toCharArray();
        char[] word2 = "tes".toCharArray();

        Map<Character, Integer> lettersInWord1 = new HashMap<Character, Integer>();

        for (char c : word1) {
            int count = 1;
            if (lettersInWord1.containsKey(c)) {
                count = lettersInWord1.get(c) + 1;
            }
            lettersInWord1.put(c, count);
        }

        for (char c : word2) {
            int count = -1;
            if (lettersInWord1.containsKey(c)) {
                count = lettersInWord1.get(c) - 1;
            }
            lettersInWord1.put(c, count);
        }

        for (char c : lettersInWord1.keySet()) {
            if (lettersInWord1.get(c) != 0) {
                return false;
            }
        }

        return true;
    }

    static boolean anagrams(String firstWord, String secondWord) {

        if (firstWord.length() != secondWord.length())
            return false;

        int n = 256;
        int[] counter1 = new int[n];
        int[] counter2 = new int[n];

        int m = firstWord.length();
        for (int i = 0; i < m; i++) {
            counter1[Character.getNumericValue(firstWord.charAt(i))]++;
            counter2[Character.getNumericValue(secondWord.charAt(i))]++;
        }

        for (int i = 0; i < n; i++)
            if (counter1[i] != counter2[i])
                return false;

        return true;
    }

    public int[] amountOfAnagrams(String word, String[] phrases) {
        int count = 0;
        int n = phrases.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            count = 0;
            Scanner scan = new Scanner(phrases[i]);
            while (scan.hasNext()) {
                String toAnalyze = new String(scan.next());
                if (isAnagram(toAnalyze, word))
                    count++;
            }
            result[i] = count;
            scan.close();
        }
        return result;
    }

    public int waysToClimb(int n) {
        if (n == 0) return 0;
        int a = 1;
        int b = 1;
        for (int i = 1; i < n; i++) {
            int c = a;
            a = b;
            b += c;
        }
        return b;
    }

    public static int minSubArraySum(int[] p) {
        int minimalSum = 0;
        int currentSum = 0;
        for (int i : p) {
            currentSum += i;
            minimalSum = Math.min(minimalSum, currentSum);
        }
        return Math.abs(minimalSum) + 1;
    }

    public int ironMan(int[] p) {
        return minSubArraySum(p);
    }

    public int[] MinOperations(long[] nvalues) {
        int n = nvalues.length;
        int moves = 0;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            long number = nvalues[i];
            moves = 0;
            while (number > 1) {
                moves++;
                if (number % 2 == 0)
                    number = number / 2;
                else
                    number = number - 1;
            }
            result[i] = moves + 1;
        }
        return result;
    }

    boolean isBalanced(int[] numbers) {
        if (numbers.length < 1)
            return false;
        int number = numbers[0];
        for (int i : numbers) {
            if (i != number)
                return false;
        }
        return true;
    }

    public long countofMoves(int[] numbers) {
        int n = numbers.length;
        int numberOfMoves = 0;
        if (isBalanced(numbers))
            return 0;
        while (!isBalanced(numbers)) {
            numberOfMoves++;
            Arrays.sort(numbers);
            for (int i = 0; i < n - 1; i++) {
                numbers[i] += 1;
            }
        }
        return numberOfMoves;
    }

    public long countMoves(int[] numbers) {
        if (isBalanced(numbers))
            return 0;
        int n = numbers.length;
        int numberOfMoves = 0;
        Arrays.sort(numbers);
        int max = numbers[n - 1];
        int min = numbers[0];
        int indexOfMax = n - 1;
        int newMaxIndex = n - 1;
        while (min!=max) {
            int increment = Math.abs(max - min);
            numberOfMoves += increment;
            min = min + increment;
            for (int i = 0; i < n; i++) {
                if (i != newMaxIndex) {
                    numbers[i] += increment;
                    if (numbers[i] > max) {
                        max = numbers[i];
                        indexOfMax = i;
                    }
                }
            }
            newMaxIndex = indexOfMax;
        }
        return numberOfMoves;
    }


    void lps(String str)
    {
        int n = str.length();
        int i, j, counting;
        int L[][] = new int[n][n];

        int cl;
        for (i = 0; i < n; i++)
            L[i][i] = 1;

        for (cl=2; cl<=n; cl++)
        {
            for (i=0; i<n-cl+1; i++)
            {
                j = i+cl-1;
                if (str.charAt(i) == str.charAt(j) && cl == 2)
                    L[i][j] = 2;
                else if (str.charAt(i) == str.charAt(j))
                    L[i][j] = L[i+1][j-1] + 2;
                else
                    L[i][j] = Math.max(L[i][j-1], L[i+1][j]);
            }
        }
        return ;
    }


    int lcs(int l,int r){
        if(l >r) return 0;
        if(l == r) return 1;
        if(L[l][r] != -1) return L[l][r];

        if(s[l]==s[r]) return L[l][r] = 2+lcs(l+1,r-1);
        return L[l][r] = Math.max(lcs(l+1,r),lcs(l,r-1)) ;
    }

    public int funPal(String s) {
        int M = -1;
        for(int i =0 ; i < s.length()-1 ;i++)
            M = Math.max(lcs(0,i)*lcs(i+1,s.length()-1),M);
    }
}

    public static String sortWord(String word){
        word=word.toLowerCase();
        char[] cword = word.toCharArray();
        Arrays.sort(cword);
        String sorted_word = new String(cword);

        return sorted_word;
    }
/*
    public static boolean isAnagram(String sorted_word, String word2){
        if ( sorted_word.length() != word2.length() ) {
            return false;
        }

        String sorted_word2 = sortWord(word2);

        return sorted_word.equals(sorted_word2);
    }
*/
    private static final int MAX_DIST = 1001;


    static int[] amountOfAnagrams(String word, String[] phrases){

        int[] result = new int[phrases.length];
        String sorted_word = sortWord(word);

        String delims = "[ .,]+";


        for (int phrase_i = 0; phrase_i < phrases.length; phrase_i++){
            String[] words = phrases[phrase_i].split(delims);
            int amount = 0;
            for (int word_i = 0; word_i < words.length; word_i++){
                if (isAnagram(sorted_word, words[word_i]))
                    amount++;
            }
            result[phrase_i] = amount;
        }

        return result;
    }
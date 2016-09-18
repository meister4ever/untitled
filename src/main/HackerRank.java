package main;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by meister4ever on 10/8/16.
 */
public class HackerRank {
    public void solution(String S) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int[] array = new int[n];
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum += array[i];
        }

    }
/*
    static String fill(String original, char toFill, int n) {
        char[] array = new char[n];
        Arrays.fill(array, toFill);
        String output = new String(array);
        return original + output;
    }

    public int Diagonal(int w) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int sumDiag = 0;
        int sumAntiDiag = 0;
        int number = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n; j++) {
                if (j == n - 1)
                    scan.nextInt();
                number = scan.nextInt();
                if (i == j) {
                    sumDiag += number;
                }
                if (i == n - j - 1) {
                    sumAntiDiag += number;
                }
            }
        }
        int finalNumber = Math.abs(sumDiag - sumAntiDiag);
        System.out.println(finalNumber);
    }


    static String fill(String original, char toFill, int n) {
        char[] array = new char[n];
        Arrays.fill(array, toFill);
        String output = new String(array);
        return original + output;
    }

    public static void main(String[] args) {
        //Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int spaces = n;
        String toOutput = "";
        for (int i = 0; i < n; i++) {
            spaces--;
            toOutput = fill(toOutput, ' ', spaces);
            toOutput = fill(toOutput, '#', n - spaces);
            System.out.println(toOutput);
            toOutput = "";

        }
    }

    public void Date(int w) {
        Scanner scan = new Scanner(System.in);
        String dateStr = scan.nextLine();
        DateFormat readFormat = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat writeFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = null;
        try {
            date = readFormat.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String formattedDate = "";
        if (date != null) {
            formattedDate = writeFormat.format(date);
        }
        System.out.println(formattedDate);
    }
    /*
    public void CircularArrayRotation() {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    /*
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int num = 0;
        ArrayList array = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            array.add(scan.nextInt());
        }
        for (int i = 0; i < k; i++) {
            array.add(0, array.remove(array.size() - 1));
        }

        int l = 0;
        for (int i = 0; i < q; i++) {
            l = scan.nextInt();
            System.out.println(array.get(l));
        }
    }
    public void maxSub() {

        int longestWithMistmatch(int matches, String firstWord, String secondWord){
            for (int i = 0; i < firstWord.length(); i++){
                for (int j = 0; j < secondWord.length(); j++){
                    if (firstWord[i]==secondWord[j]){

                    }
                }
            }
        }
    }
*/
}
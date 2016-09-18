package main;

import java.util.*;
public class Test3 {
    int baseMinusTwoToInt(String number){
        int count=0;
        int value;
        int result=0;

        for (int i=0; i<number.length();i++){
            value = Character.getNumericValue(number.charAt(i));
            result+=value*Math.pow(-2,count);
            count++;
        }
    return result;
    }

    static int[] convert(int value)
    {
        int[] result = new int[9];
        int i=0;
        while (value != 0)
        {
            int remainder = value % -2;
            value = value / -2;

            if (remainder < 0)
            {
                remainder += 2;
                value += 1;
            }
            System.out.println(remainder);

            result[i]=remainder;
            i++;
        }
        return result;
    }

    public int[] solution(int[] A) {
        // write your code in Java SE 8
        String result = "";

        for (int i=0; i<A.length;i++)
            result +=A[i];
        int integer= Integer.parseInt(result);
        //integer*=1;

        int sol = baseMinusTwoToInt(Integer.toString(integer));
        System.out.println(sol);
        int[] solution;
        solution = convert(sol);

        return solution;
    }
}

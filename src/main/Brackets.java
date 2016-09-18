package main;

import java.util.Stack;

/**
 * Created by meister4ever on 12/6/16.
 */
public class Brackets {
    boolean checkNested(char left, char right) {
        if (left == '(' && right == ')')
            return true;
        if (left == '[' && right == ']')
            return true;
        if (left == '{' && right == '}')
            return true;
        return false;
    }

    public int solution(String S) {
        Stack<Character> brackets = new Stack<Character>();
        if (S.isEmpty())
            return 1;
        for (int i = 0; i < S.length(); i++) {
            char bracketChar = S.charAt(i);
            if (bracketChar == '(' || bracketChar == '[' || bracketChar == '{')
                brackets.push(bracketChar);
            else {
                if (brackets.size() == 0)
                    return 0;
                char left = brackets.pop();
                if (!checkNested(left, bracketChar))
                    return 0;
            }
        }
        if (brackets.size() != 0)
            return 0;
        return 1;
    }
}

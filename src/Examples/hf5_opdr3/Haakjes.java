package Examples.hf5_opdr3;

import java.util.Stack;

public class Haakjes {
    public boolean inBalans (String s) {
        String copy = s;
        int count = 0;
        while(copy.length() > 0 && copy.indexOf("(") >= 0) {
            count ++;
            copy = index(copy.indexOf("("), copy);
        }
        System.out.println(count);

        int count2 = 0;
        while(s.length() > 0 && s.indexOf(")") >= 0) {
            count2 ++;
            s = index(s.indexOf(")"), s);
        }

        System.out.println(count2);
        return count == count2;
    }

    public String index(int i, String string) {
        return string.substring(i+1, string.length());
    }


    public static boolean isParenthesisMatch(String str) {
        if (str.charAt(0) == '{')
            return false;

        Stack<Character> stack = new Stack<Character>();

        char c;
        for(int i=0; i < str.length(); i++) {
            c = str.charAt(i);

            if(c == '(')
                stack.push(c);
            else if(c == '{')
                stack.push(c);
            else if(c == ')')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '(')
                    stack.pop();
                else
                    return false;
            else if(c == '}')
                if(stack.empty())
                    return false;
                else if(stack.peek() == '{')
                    stack.pop();
                else
                    return false;
        }
        return stack.empty();
    }
}

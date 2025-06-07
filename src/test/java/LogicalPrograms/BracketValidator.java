package LogicalPrograms;

import java.util.*;

public class BracketValidator {


    public static void main(String[] args) {
        String input = "([{}])";
        boolean blResult = true;

        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            if (c == '<' || c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    blResult = false;
                    break;
                }
                char top = stack.pop();
                if (!(c == '>' && top == '<' || c == ')' && top == '(' || c == ']' && top == '[' || c == '}' && top == '{')) {
                    blResult = false;
                    break;
                }
            }
        }
        if(!stack.isEmpty()){
          blResult=false;
        }

        System.out.println("Is valid? " + blResult);

    }
}



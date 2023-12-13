package com.example.demo;

public class ReversePolishNotation {

    public static int evalRPN(String[] token){
        int returnValue = 0;
        String operators = "+-*/";
        java.util.Stack<String> stack = new java.util.Stack();

        for(String t: token){
            if(!operators.contains(t)){
                stack.push(t);
            } else {
                int a = Integer.valueOf(stack.pop());
                int b = Integer.valueOf(stack.pop());

                switch (t) {
                    case "+":
                        stack.push(String.valueOf(a + b));
                        break;
                    case "-":
                        stack.push(String.valueOf(a - b));
                        break;
                    case "*":
                        stack.push(String.valueOf(a * b));
                        break;
                    case "/":
                        stack.push(String.valueOf(b / a));
                        break;

                }
            }
        }
        returnValue = Integer.valueOf(stack.pop());
        return returnValue;
    }
    public static void main(String [] args){
        int i = evalRPN(new String[]{"1", "2", "+", "3", "*"});
        System.out.println(i);
    }
}

package Practical_13;

import java.util.*;

public class practical13 {
    public static void main(String[] args) {
        //input expression
        //((4+5)-(1*2)/5)
        String[] input = {"4", "5", "+", "1", "2","*","-","5","/","end"};
        float total = 0;
//creating stack
        Stack<String> stack = new Stack();
        int i = 0;
//for checking that the stack is empty or not
        boolean b = stack.empty();
        //if stack is not empty
        while (b=true) {
//it push the element to the top of the stack

            stack.push(input[i]);
            //display the top
            System.out.println("the top is :");
            System.out.println(input[i]);
            //increment the size of the array
            i++;
//if stack top is +
            if (stack.peek() == "+") {
                //pop the plus sign
                stack.pop();
                //pop the numbers
                int number1 = Integer.parseInt((String) stack.pop());

                int number2 = Integer.parseInt((String) stack.pop());
                //perform operation on them
                int value = number1 + number2;
                //printing the new top
                System.out.println("the top is :");
                System.out.println(value);
                //push it into the stack
                stack.push("" + value);
            }
            //if stack top is *
            if (stack.peek() == "*") {
                //pop the symbol
                stack.pop();
                //pop the values
                int num1 = Integer.parseInt((String) stack.pop());

                int num2 = Integer.parseInt((String) stack.pop());
                //perform operation on values
                int val = num1 * num2;
                //print the result
                System.out.println("the top is :");
                System.out.println(val);
                //push the result to the stack
                stack.push("" + val);



            }
            //if the top of the stack is -
            if (stack.peek() == "-"){
                //pop the symbol
                stack.pop();
                //pop the values
                int numb1 = Integer.parseInt((String) stack.pop());

                int numb2 = Integer.parseInt((String) stack.pop());
                //perform operation on them
                int v = numb2 - numb1;
                //printing the result
                System.out.println("the top is :");
                System.out.println(v);
                //push the result into the stack
                stack.push("" + v);

            }
            //if the top is /

            if (stack.peek() == "/"){
                //pop the symbol
                stack.pop();
                //pop the values
                int numb1 = Integer.parseInt((String) stack.pop());

                int numb2 = Integer.parseInt((String) stack.pop());
//perform operation on them
                total = (float)numb2/numb1;
                //print the result
                System.out.println("the top is :");
                System.out.println(total);
                //push the result into the stack
                stack.push("" + total);


            }
            //if top of the stack is end

            if(stack.peek() == "end"){
                //break the loop
                break;
            }

        }
        //printing the final answer
        System.out.println("The final answer for the expression ((4+5)-(1*2)/5) is "+total);

    }
}
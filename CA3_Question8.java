import java.util.Scanner;
import java.util.Stack;

/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question8 {

    public static void calculations(Stack<String> numberStack, Stack<Character> operatorStack){
        double firstValue = Double.parseDouble(numberStack.pop());
        double secondValue = Double.parseDouble(numberStack.pop());
        char operator = operatorStack.pop();

        if(operator == '+'){
            double answerInt = secondValue + firstValue;
            String stringAnswer = Double.toString(answerInt);
            numberStack.push(stringAnswer);
        }else if(operator == '-'){
            double answerInt = secondValue - firstValue;
            String stringAnswer = Double.toString(answerInt);
            numberStack.push(stringAnswer);
        }else if(operator == '/'){
            double answerInt = secondValue / firstValue;
            String stringAnswer = Double.toString(answerInt);
            numberStack.push(stringAnswer);
        }else if(operator == '*' || operator == 'x'){
            double answerInt = secondValue * firstValue;
            String stringAnswer = Double.toString(answerInt);
            numberStack.push(stringAnswer);
        }
    }

    /*
        Reads in an equation from the user
     */
    public static void main(String[] args) {
        String equation;
        String num;
//        int value;
        char operator;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter equation");
        equation = in.nextLine().trim();
//        Scanner entered = new Scanner(equation);

        Stack<String> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        //loop through equation entered to store the integers and operators
        for(int i = 0; i < equation.length(); i++){
            //removes whitespaces
            equation = equation.replaceAll("\\s", "");
            boolean isNum = Character.isDigit(equation.charAt(i));

            //checks if any values entered is a number, if it is, it is pushed to the numberStack
            if(isNum){
                num = equation.substring(i, i + 1);
                numberStack.push(num);
            }
            //if the values are not numbers, they are pushed to the operatorStack
            else if(equation.charAt(i) == '('){
                operator = equation.charAt(i);
                operatorStack.push(operator);
            }else if(equation.charAt(i) == ')'){
//                operator = equation.charAt(i);
//                operatorStack.push(operator);
                //loops through question entered to see where the brackets open and whatever calculation is inside the brackets is executed before anything outside
                while(operatorStack.peek() != '('){
                    calculations(numberStack, operatorStack);
                }
                //once the calculation inside is complete, the opening bracket is removed as it is no longer needed
                if(!operatorStack.isEmpty() && operatorStack.peek() == '('){
                    operatorStack.pop();
                }
            //checks to see what operators are outside the brackets and pushes them onto the operatorStack
            }else if(equation.charAt(i) == '*' || equation.charAt(i) == 'x'){
                operator = equation.charAt(i);
                operatorStack.push(operator);
            }else if(equation.charAt(i) == '/'){
//                operator = equation.charAt(i);
                char divide = '/';
                operatorStack.push(divide);
            }else if(equation.charAt(i) == '+'){
                operator = equation.charAt(i);
                operatorStack.push(operator);
            }else if(equation.charAt(i) == '-'){
                operator = equation.charAt(i);
                operatorStack.push(operator);
            }
        }
//        if(!operatorStack.isEmpty() && operatorStack.peek() == '*'|| operatorStack.peek() == 'x' || operatorStack.peek() == '/'){
////            while(!operatorStack.isEmpty() && operatorStack.peek() == '*'|| operatorStack.peek() == 'x' || operatorStack.peek() == '/'){
//                calculations(numberStack, operatorStack);
////            }
//        }else if (!operatorStack.isEmpty() && operatorStack.peek() == '+'|| operatorStack.peek() == '-'){
////            while(!operatorStack.isEmpty() && operatorStack.peek() == '+'|| operatorStack.peek() == '-'){
//                calculations(numberStack, operatorStack);
////            }
//        }
        //loops through the operatorStack for any calculations that weren't completed and continues to loop until the stack is empty
        while(!operatorStack.isEmpty()){
//            Iterator<Character> itr = operatorStack.iterator();
//            while(itr.hasNext()){
//                operator = itr.next();
//                priority(operator, numberStack, operatorStack);
//            }
            calculations(numberStack,operatorStack);
        }
        System.out.println("Result: " + numberStack);
    }

//    public static int priority(char operator){
//        if (operator == '*' || operator == '/' || operator == 'x') {
//            return 2;
//        } else if (operator == '+' || operator == '-') {
//            return 1;
//        }
//        return 0;
//    }

//    public static void calculations(Stack<Integer> numberStack, Stack<Character> operatorStack){
//        int firstValue = numberStack.pop();
//        int secondValue = numberStack.pop();
//        char operator = operatorStack.pop();
//
//        if(operator == '+'){
//            numberStack.push(firstValue + secondValue);
//        }else if(operator == '-'){
//            numberStack.push(secondValue - firstValue);
//        }else if(operator == '/'){
//            numberStack.push(secondValue / firstValue);
//        }else if(operator == '*' || operator == 'x'){
//            numberStack.push(firstValue * secondValue);
//        }
//    }

}

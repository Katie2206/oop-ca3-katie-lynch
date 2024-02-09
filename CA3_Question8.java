import java.util.Scanner;
import java.util.Stack;

/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question8 {

    /*
        Reads in an equation from the user
     */
    public static void main(String[] args) {
        String equation;
        String num;
        int value;
        char operator;

        Scanner in = new Scanner(System.in);
        System.out.println("Please enter equation");
        equation = in.nextLine().trim();
//        Scanner entered = new Scanner(equation);

        Stack<Integer> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        //loop through equation entered to store the integers and operators
        for(int i = 0; i < equation.length(); i++){
            //removes whitespaces
            equation = equation.replaceAll("\\s", "");

            //checks for operators and pushes them to the operatorStack stack
            if(equation.charAt(i) == ('*') || equation.charAt(i) == ('x') || equation.charAt(i) == ('+') || equation.charAt(i) == ('-') || equation.charAt(i) == ('/') || equation.charAt(i) == ('(')){
                operator = equation.charAt(i);
                operatorStack.push(operator);
            }else{
                //checks if integers were entered
                boolean isNum = Character.isDigit(equation.charAt(i));
                //if there are integers in the equation they are pushed to the numberStack stack while non-integers are ignored
                if(isNum){
                    num = equation.substring(i, i + 1);
                    value = Integer.parseInt(num);
                    numberStack.push(value);
                }
            }
        }
    }

    public static void calculations(Stack<Integer> numberStack, Stack<Character> operatorStack){
        int firstValue = numberStack.pop();
        int secondValue = numberStack.pop();
        char operator = operatorStack.pop();

        if(operator == '+'){
            numberStack.push(firstValue + secondValue);
        }else if(operator == '-'){
            numberStack.push(secondValue - firstValue);
        }else if(operator == '/'){
            numberStack.push(secondValue / firstValue);
        }else if(operator == '*' || operator == 'x'){
            numberStack.push(firstValue * secondValue);
        }
    }

}

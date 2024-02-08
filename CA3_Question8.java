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
        String value;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter equation");
        equation = in.nextLine().trim();

        Stack<Integer> numberStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        //loop through equation entered to store the integers and operators
        for(int i = 0; i < equation.length(); i++){
            
        }
    }
}

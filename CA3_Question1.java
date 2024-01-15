import java.util.Stack;
import java.util.Scanner;
/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question1
{
    public static void runSimulation()
    {
        Scanner kbrd = new Scanner(System.in);
        Stack<Integer> driveway = new Stack<Integer>();
        Stack<Integer> street = new Stack<Integer>();

        int choice = 0;

        do{
            menu();
            choice = kbrd.nextInt();
            kbrd.nextLine();
            switch(choice){
                case 1:{

                }break;
                case 2:{

                }break;
            }

        }while(choice != 0);

    }

    public static void menu(){
        System.out.println("0. Exit");
        System.out.println("1. Add Car To Driveway");
        System.out.println("2. Remove Car From Driveway");
    }

    public static void main(String[] args) {

        runSimulation();
    }
}

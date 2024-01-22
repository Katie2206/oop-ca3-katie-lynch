import java.util.Stack;
import java.util.Scanner;
/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question1 {

    public static void menu() {
        System.out.println("0. End Simulation");
        System.out.println("1. Add Car(s)");
        System.out.println("2. Remove Car(s)");
        System.out.println("3. Show Driveway");
        System.out.println("4. Show Street");
    }
    public static void runSimulation() {
        Scanner kbrd = new Scanner(System.in);
        Stack<Integer> driveway = new Stack<Integer>();
        Stack<Integer> street = new Stack<Integer>();

        int choice = 0;

        do {
            menu();
            choice = kbrd.nextInt();
            if(choice == 1){
                System.out.println("Please Enter An Integer Above 0 To Add A Car:");
                int carToAdd = kbrd.nextInt();

                if(carToAdd > 0) {
                    driveway.add(carToAdd);
                    System.out.println(driveway);
                }else{
                    System.out.println("Please Enter An Integer Above 0");
                }

        }while (choice != 0);

    }

    public static void main(String[] args) {

        runSimulation();
    }
}

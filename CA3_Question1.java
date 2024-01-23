import java.util.Stack;
import java.util.Scanner;
/**
 *  Name: Katie Lynch
 *  Class Group: SD2B
 */
public class CA3_Question1 {

    public static void menu() {
        System.out.println("0. End Simulation");
        System.out.println("1. Add Car(s)");
        System.out.println("2. Remove Car(s)");
        System.out.println("3. Show Driveway");
    }

    public static void runSimulation() {
        Scanner kbrd = new Scanner(System.in);
        Stack<Integer> driveway = new Stack<Integer>();
        Stack<Integer> street = new Stack<Integer>();

        int choice = 0;

        do {
            menu();
            choice = kbrd.nextInt();
            if (choice == 1) {
                System.out.println("Please Enter An Integer Above 0 To Add A Car:");
                int carToAdd = kbrd.nextInt();

                if (carToAdd > 0) {
                    driveway.add(carToAdd);
                    System.out.println(driveway);
                } else {
                    System.out.println("Please Enter An Integer Above 0");
                }

            } else if (choice == 2) {
                System.out.println("Please Enter A Negative Integer To Remove A Car:");

                int valueEntered = 0;
                valueEntered = kbrd.nextInt();

                if (valueEntered >= 0) {
                    System.out.println("Positive Integer Entered. Please Try Again With A Negative Integer");
                } else{
                    int carToRemove = Math.abs(valueEntered);

                if (carToRemove > 0) {
                    do {
                        int peek = driveway.peek();

                        if (carToRemove != peek) {
                            int valueMoved = driveway.pop();
                            street.add(valueMoved);
                            System.out.println("Car(s) Moved To The Street " + street + "\n");
                            System.out.println("Car(s) Moved From The Driveway " + driveway + "\n");
                        } else if (carToRemove == peek) {
                            int valueMoved = driveway.pop();
                            System.out.println("Car Removed " + valueMoved);
                            System.out.println("Car(s) Currently In Street " + street);
                            System.out.println("Car(s) Currently In Driveway " + driveway + "\n");
                            while (!street.isEmpty()) {
                                driveway.add(street.pop());
                                System.out.println("Car(s) Moving Off The Street " + street + "\n");
                                System.out.println("Car(s) Back Into The Driveway " + driveway + "\n");
                            }
                        }
                    } while (!street.isEmpty());
                }
            }
            }else if(choice == 3){
                System.out.println("Cars Currently In The Driveway: " + driveway);
            }else{
                System.out.println("Please Enter A Valid Choice");
            }

        } while (choice != 0);
    }
        public static void main (String[]args){

            runSimulation();
        }

}

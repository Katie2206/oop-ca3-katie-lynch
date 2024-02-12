
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question6
{public static double Block(int q, double p){
    Scanner kbrd = new Scanner(System.in);

    q = kbrd.nextInt();
    p = kbrd.nextFloat();

//        Share[] buyShare = new Share[q];
    double sharePrice = q + p;

    return sharePrice;
}

    /*
    Will repeatedly ask the user to enter the commands in the format
    buy qty price
    or
    sell qty price
    or
    quit
     */
    public static void main(String[] args) {
        Queue<Double> stocks = new LinkedList<>();
       Scanner in = new Scanner(System.in);
        String command="";
            do {
            System.out.println("Would you like to buy or sell shares?");
            command = in.next();
            if(command.equalsIgnoreCase("buy"))
            {
                System.out.println("What is the quantity?");
                int qty = in.nextInt();
                System.out.println("What is the price?");
                double price = in.nextDouble();
//                Block(qty, price);
                stocks.add(Block(qty, price));
                System.out.println(Block(qty, price));
            }
            else if(command.equals("sell"))
            {
                int qty = in.nextInt();
                double price = in.nextDouble();


            }
        }while(!command.equalsIgnoreCase("quit"));
    }
}
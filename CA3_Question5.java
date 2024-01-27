import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 *  Name:
 *  Class Group:
 */

public class CA3_Question5
{

    public static void simulation(){
        Scanner kbrd = new Scanner(System.in);
        String answer = "";
        Queue<String> runway = new LinkedList<>();
        PriorityQueue<String> takeoff = new PriorityQueue<>();
        PriorityQueue<String> land = new PriorityQueue<>();

        System.out.println("Please Enter What You Would Like To Do (takeoff, land, next or quit) And What Flight (e.g. Flight 357): ");
        answer = kbrd.nextLine();

        if(answer.substring(0, 7).equalsIgnoreCase("takeoff")){
            takeoff.add(answer.substring(8));
        }else if(answer.substring(0, 4).equalsIgnoreCase("land")){
            System.out.println("land works");
        }else if(answer.substring(0, 4).equalsIgnoreCase("next")){
            if(!land.isEmpty()){
                land.poll();
            }
        }

    }

    public static void main(String[] args)
    {
        simulation();
    }
}

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
        Queue<String> takeoff = new LinkedList<>();
        Queue<String> land = new LinkedList<>();

        while(!answer.equalsIgnoreCase("quit")) {
            System.out.println("Please Enter What You Would Like To Do (takeoff, land, next or quit) And What Flight (e.g. Flight 357): ");
            answer = kbrd.nextLine();

            if (answer.toLowerCase().contains("takeoff flight")) {
                String newTakeoffAns = answer.toLowerCase().replace("takeoff", "");
                String takeoffFlight = newTakeoffAns.substring(1);
                takeoff.add(takeoffFlight);
            } else if (answer.toLowerCase().contains("land flight")) {
                String newLandAns = answer.toLowerCase().replace("land", "");
                String landFlight = newLandAns.substring(1);
                land.add(landFlight);
            } else if (answer.toLowerCase().contains("next")) {
                if(!land.isEmpty()){
                    System.out.println("Land " + land.peek());
                    land.poll();
                }else if(!takeoff.isEmpty()){
                    System.out.println("Takeoff " + takeoff.peek() + "\n");
                    takeoff.poll();
                }else{
                    System.out.println("All Flights Have Landed And Taken Off\n");
                }
            }
        }


    }

    public static void main(String[] args)
    {
        simulation();
    }
}

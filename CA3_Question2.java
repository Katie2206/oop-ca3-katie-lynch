import java.util.Scanner;
import java.util.Stack;

/**
 *  Name: Katie Lynch
 *  Class Group: SD2B
 */
public class CA3_Question2
{
    /*
        Starter function to create the 2D array and populate it with 0

     */
    public static int[][] floodFillStart() {
        Scanner kb = new Scanner(System.in);
        int[][] arr = new int[10][10];
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                arr[x][y] = 0;
            }
        }
       return arr;
    }
    /*
        Helper function to display the image
     */
    public static void display(int[][] arr)
    {
        for (int x = 0; x < 10; x++)
        {
            for (int y = 0; y < 10; y++)
            {
                System.out.printf("%4d", arr[x][y]);
            }
            System.out.println();
        }
    }
    private static void fill(int r, int c, int[][] arr)
    {
        Scanner kbrd = new Scanner(System.in);
        System.out.println("Please Enter The Row You Would Like To Begin At:");
        r = kbrd.nextInt();

        System.out.println("Please Enter The Column You Would Like To Begin At:");
        c = kbrd.nextInt();

        Stack<Question_2_Pair> coordinatesChosen = new Stack<>();

        coordinatesChosen.add(new Question_2_Pair(r, c));
        

    }

    public static void start()
    {

        int[][] arr = floodFillStart();

    }
    public static void main(String[] args) {

        start();

    }

}

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

        int increment = 0;


        Scanner kbrd = new Scanner(System.in);
        System.out.println("Please Enter The Row You Would Like To Begin At:");
        r = kbrd.nextInt();

        System.out.println("Please Enter The Column You Would Like To Begin At:");
        c = kbrd.nextInt();

        Stack<Question_2_Pair> coordinatesChosen = new Stack<>();

        coordinatesChosen.add(new Question_2_Pair(r, c));


        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {

                if(coordinatesChosen.peek().equals(arr[i][j])){
                    //checks if the row above is 0
                    if(r-1>=0){
                        //stores position
                        int n = arr[r-1][c];
                        //if it is 0, it increments it and adds the coordinates to the stack
                        if(n == 0){
                            ++increment;
                            coordinatesChosen.add(new Question_2_Pair(r, c));
                        }else{
                            //if it isn't 0, it adds the coordinates
                            coordinatesChosen.add(new Question_2_Pair(r, c));
                        }
                        //checks if the column to the left is 0
                    }else if(c-1>=0){
                        //stores position
                        int w = arr[r][c-1];
                        //if it is 0, it increments it and adds the coordinates to the stack
                        if(w == 0){
                            ++increment;
                            coordinatesChosen.add(new Question_2_Pair(r, c));
                        }else{
                            //if it isn't 0, it adds the coordinates
                            coordinatesChosen.add(new Question_2_Pair(r, c));
                        }
                    }else if(r+1<= arr.length){
                        //stores position
                        int s = arr[r+1][c];
                        //if it is 0, it increments it and adds the coordinates to the stack
                        if(s == 0){
                            ++increment;
                            coordinatesChosen.add(new Question_2_Pair(r, c));
                        }else{
                            //if it isn't 0, it adds the coordinates
                            coordinatesChosen.add(new Question_2_Pair(r, c));
                        }
                    }else if(c+1<= arr[r].length){
                        //stores position
                        int e = arr[r][c+1];
                        //if it is 0, it increments it and adds the coordinates to the stack
                        if(e == 0){
                            ++increment;
                            coordinatesChosen.add(new Question_2_Pair(r, c));
                        }else{
                            //if it isn't 0, it adds the coordinates
                            coordinatesChosen.add(new Question_2_Pair(r, c));
                        }
                    }
                }
            }
        }



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

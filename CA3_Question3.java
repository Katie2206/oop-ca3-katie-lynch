import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *  Name:
 *  Class Group:
 */

public class CA3_Question3
{
    public static void readFile(String fileName) throws FileNotFoundException {
        File fileReadIn = new File (fileName);
        Scanner lines = new Scanner(fileReadIn);
        int lineCount = 0;

        while(lines.hasNextLine()){
            lines.nextLine();
            lineCount++;
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile("src/CA3_Question1.java");
    }
}

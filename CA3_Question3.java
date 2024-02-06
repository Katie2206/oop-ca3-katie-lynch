import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *  Name:
 *  Class Group:
 */

public class CA3_Question3
{
    public static void readFile(String fileName) throws FileNotFoundException {

        File file = new File(fileName);
        Scanner in = new Scanner(file);
        in.useDelimiter("[^A-Za-z0-9_]+");
        Map<Integer, String> fileLines = new HashMap<>();
        ArrayList<String> identifiers = new ArrayList<>();
        int lineNum = 0;
        String line = "";

        String findIdentifiers = "";

        //while loop loops through file until there are no values left
        while(in.hasNext()){
            //counts lines in file
            lineNum++;
            //stores individual lines
            line = in.nextLine();
            //adds both the line number and the contents of each line into the map
            fileLines.put(lineNum, line);

            //looks for identifiers that match the useDelimiter pattern
            findIdentifiers = in.next();
            //adds identifiers to (currently temporary) arraylist
            identifiers.add(findIdentifiers);
        }

        //Test to see if values store
        System.out.println("Identifiers: " + identifiers);
        System.out.println("File: " + fileLines);

    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile("src/CA3_Question1.java");
    }
}

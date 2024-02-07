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
        Scanner f = new Scanner(file);
        Map<String, List<Integer>> matchedIdentifiers = new HashMap<String, List<Integer>>();
        List<Integer> numList = new ArrayList<Integer>();
        Scanner in = new Scanner(file);
        in.useDelimiter("[^A-Za-z0-9_]+");
        Map<Integer, String> fileLines = new HashMap<>();
        ArrayList<String> identifiers = new ArrayList<>();

        int lineNum = 0;
//        int[] lineNumTotal = {};
        String line = "";
        String identifier = "";


        //loops through entire file and stores line numbers and lines
        while (f.hasNext()) {
            lineNum++;
            line = f.nextLine();

            Scanner in = new Scanner(line);
            in.useDelimiter("[^A-Za-z0-9_]+");
            //loops through file to find any identifiers to match the delimiter
            while (in.hasNext()) {
                //stores identifiers
                identifier = in.next();

                //checks what lines have the identifier in them
                if (line.contains(identifier)) {
                    //adds line number onto the list of numbers
                    numList.add(lineNum);
                    //adds identifier and line numbers to map
                    matchedIdentifiers.put(identifier, numList);
                } else {
                    //if the identifier hasn't been stored in the map yet, store it here
                    matchedIdentifiers.put(identifier, numList);
                }

//                if (line.contains(identifier)) {
//                    matchLine.put(lineNum, line);
//                    System.out.println(matchLine);
//                }
//                System.out.println(matchedIdentifiers);
            }
//            System.out.println("line: "+line);
//            System.out.println("lineNum: "+lineNum);
//            System.out.println("identifiers: "+identifier + "\n");

        }

        //iterate through the map and output each identifier and the lines they occur on
        Iterator<Map.Entry<String, List<Integer>>> iterator = matchedIdentifiers.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Integer>> outputMap = iterator.next();

            System.out.println("Identifier: " + outputMap.getKey() + " == " + outputMap.getValue());
        }
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

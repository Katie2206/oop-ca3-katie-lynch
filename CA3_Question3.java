import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
//        List<Integer> numList = new ArrayList<Integer>();
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
                //checks if matchedIdentifiers is empty and if it is it adds the first identifier and it's line number to the stack
                if(matchedIdentifiers.isEmpty()){
                    //list re-defined individually in each if statement as a new list needs to be created for each identifier to store the individual line numbers for that specific identifier
                    List<Integer> numList = new ArrayList<Integer>();
                    numList.add(lineNum);
                    matchedIdentifiers.put(identifier, numList);
                }
                //checks to see if the identifier is already in the stack
                boolean foundMatch = false;
                for(String key : matchedIdentifiers.keySet()){
                    //if the identifier is already in the stack, it finds the next line with the identifier in it and adds it to the list in the stack
                    if(key.equals(identifier)){
                        foundMatch = true;
                        List<Integer> alreadyInNumList = matchedIdentifiers.get(key);
                        alreadyInNumList.add(lineNum);
                    }
                }
                //if the identifier hasn't already been added to the stack, then add the identifier and the line number to the stack
                if(!foundMatch){
                    List<Integer> numList = new ArrayList<Integer>();
                    numList.add(lineNum);
                    matchedIdentifiers.put(identifier, numList);
                }

                //checks what lines have the identifier in them
//                if (line.contains(identifier)) {
//                    //adds line number onto the list of numbers
//                    numList.add(lineNum);
//                    //adds identifier and line numbers to map
//                    matchedIdentifiers.put(identifier, numList);
//                } else {
//                    //if the identifier hasn't been stored in the map yet, store it here
//                    matchedIdentifiers.put(identifier, numList);
//                }

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
        for (Map.Entry<String, List<Integer>> outputMap : matchedIdentifiers.entrySet()) {
            System.out.println("Identifier: " + outputMap.getKey() + " == " + outputMap.getValue());
        }
//        while(in.hasNext()){
//            identifiers = in.next();
//
//        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        readFile("src/CA3_Question1.java");
    }
}

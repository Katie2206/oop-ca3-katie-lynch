import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question4 {

    /*
        filename: name of the file to test.
     */
    public static boolean validate(String filename) throws FileNotFoundException
    {
        Scanner fileIn = new Scanner(filename);
        Stack<String> tagBracket = new Stack<String>();
        boolean endingTag = false;

        while(fileIn.hasNext() ){
            String tag = fileIn.next();
            tagBracket.add(tag);
            if(tag.charAt(1) == '/'){
                endingTag = true;
                tagBracket.pop();
            }else{
                endingTag = false;
            }
        }

        return false;
    }

    /*
        This function tests the files in the files array to see if
         they are valid.
         tags_valid.txt should return true;
         tags_invalid.txt should output as invalid;
     */
    public static void main(String[] args) throws FileNotFoundException {
        String[] files = {"tags_valid.txt", "tags_invalid.txt"};
        for(String fName: files) {
            System.out.print(fName +": ");
            if (validate(fName)) {
                System.out.println("This file is valid");
            } else {
                System.out.println("This file is invalid");
            }
        }
    }
}

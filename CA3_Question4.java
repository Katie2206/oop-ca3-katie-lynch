import java.io.File;
import java.io.FileNotFoundException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *  Name:
 *  Class Group:
 */
public class CA3_Question4 {

    /*
        filename: name of the file to test.
     */
    public static boolean validateFile1() throws FileNotFoundException
    {
        //read in file
        File filename = new File("tags_valid");
        Scanner fileIn = new Scanner(filename);
        Deque<String> tagBracket = new LinkedList<>();
//        boolean endingTag = false;

        //loops through each word in the file
        while(fileIn.hasNext() ){
            String tag = fileIn.next();
            //checks if the tag is a closing bracket and if it is, it removes the / and adds it to the deque
            if(tag.charAt(1) == '/'){
                tag = tag.replaceAll("/", "");
                tagBracket.add(tag);
            }
            //add opening tags to deque
            else{
                tagBracket.add(tag);
            }

//            while(!tagBracket.isEmpty()){

//            }

        }
//for(int i = 0; i < tagBracket.size(); i++) {
        //loops through the stack until it is empty
        while(!tagBracket.isEmpty()){
            //checks if the first element of the stack matches the first
            if (tagBracket.peekFirst().equals(tagBracket.peekLast())) {
                //if they match remove them and move to the next tags until stack is empty
                tagBracket.pollFirst();
                tagBracket.pollLast();
            } else {
                //if the tags do not match, it is invalid so false is returned
                return false;
            }
        }
        return true;
//        while(fileIn.hasNext() ){
//            String tag = fileIn.next();
//            tagBracket.add(tag);
//            System.out.println(tagBracket);
//            if(tag.charAt(1) == '/'){
//                endingTag = true;
//                tagBracket.pop();
//                System.out.println(tagBracket);
//            }else{
//                endingTag = false;
//            }
//        }


    }

    public static boolean validateFile2() throws FileNotFoundException
    {
        //read in file
        File filename = new File("tags_invalid");
        Scanner fileIn = new Scanner(filename);
        Deque<String> tagBracket = new LinkedList<>();

        //loops through each word in the file
        while(fileIn.hasNext() ){
            String tag = fileIn.next();
            if(tag.charAt(1) == '/'){
                tag = tag.replaceAll("/", "");
                tagBracket.add(tag);
            }else{
                tagBracket.add(tag);
            }

        }

        
        //if they match remove them and move to the next tags until stack is empty
        while(!tagBracket.isEmpty()){
            if (tagBracket.peekFirst().equals(tagBracket.peekLast())) {
                tagBracket.pollFirst();
                tagBracket.pollLast();

            } else {
                //if the tags do not match, it is invalid so false is returned
                return false;
            }
        }
        return true;
    }

    /*
        This function tests the files in the files array to see if
         they are valid.
         tags_valid.txt should return true;
         tags_invalid.txt should output as invalid;
     */
    public static void main(String[] args) throws FileNotFoundException {
        String file1 = "tags_valid.txt";
        String file2 = "tags_invalid.txt";

        System.out.print(file1 +": ");
        if (validateFile1()) {
            System.out.println("This file is valid");
        } else {
            System.out.println("This file is invalid");
        }

        System.out.print(file2 +": ");
        if (validateFile2()) {
            System.out.println("This file is valid");
        } else {
            System.out.println("This file is invalid");
        }

    }
}

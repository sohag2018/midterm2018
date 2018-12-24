package string.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DetermineLargestWord {
    public static String largestWord(String wordGiven){

        Map<Integer, String> wordNLength = findTheLargestWord(wordGiven);
        int largest = 0;
        String largeValue = "";
        for(Map.Entry<Integer, String> checkLength : wordNLength.entrySet()){
            if(largest< checkLength.getKey()) {
                largest = checkLength.getKey();
                largeValue = checkLength.getValue();
            }
        }
        return largeValue;
    }
    public static void main(String[] args) {

    /*Implement to Find the length and longest word in the given sentence below.
     Should return "10 biological". */
        String s="Human brain is a biological learning machine";
        System.out.println("Length of the longest word is: "+largestWord(s).length());
        System.out.println("The longest word is: "+largestWord(s));
    }

    public static Map<Integer, String> findTheLargestWord(String wordGiven){

        Map<Integer, String> map = new HashMap<Integer, String>();
        String st = "";
        String[] split = wordGiven.split(" ");
        for(int i=0;i<split.length;i++){
            map.put(split[i].length(),split[i]);
        }
        return map;
    }
}

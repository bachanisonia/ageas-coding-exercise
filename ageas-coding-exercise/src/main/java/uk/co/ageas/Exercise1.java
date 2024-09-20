package uk.co.ageas;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * Requirement :
 * 1. Input is a string: "6521714069616518831033" (provided)
 * 2. Split the string into smaller 2 character strings i.e. ["65", "21", "71", "40", "69", "61", "65", "18", "83", "10", "33"]
 * 3. Remove every second element and convert the remaining elements to integer i.e. [65, 71, 69, 65, 83, 33]
 * 4. Convert integers to ascii character and return as a single string i.e. "AGEAS!"
 * <p>
 * Ensure that input string only contains digits from 0 to 9, throw exception if this is not the case
 * <p>
 * ====================================================
 * Please use Java 8 functional style where applicable
 */

public class Exercise1 {

    protected static String result(String input) {

    	// If the String contains anything other than digits
    	if (! (input.chars().allMatch(Character::isDigit)) ) {
    		throw new InvalidParameterException("Only digits are allowed");
    	}
    	
        System.out.println("Input/Step1-->" + input);

        String result = "";
        List<String> twoCharStrList = new ArrayList<>();
        
        // Create a list of 2 character strings 
        for (int i=0; i<input.length()-1; i+=2) {
        	twoCharStrList.add(input.substring(i, i+2));
        }
        
        result = IntStream.range(0, twoCharStrList.size())
        	.filter( i -> i%2==0 )
        	.mapToObj(i -> twoCharStrList.get(i))
        	.map(Integer::valueOf)
        	.map( num -> Character.toString(num))
        	.collect(Collectors.joining());
        
        return result;
    }

    public static String input(String input) {
        return result(input);
    }
}
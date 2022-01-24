/*
 * Write a program to print all the possible   
 * combinations according to the input values.
 */

import java.util.*;

public class Program2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String,List<Character>> map = new HashMap<String,List<Character>>();
		
		map.put("1", Arrays.asList('Z', 'Y', 'A'));
		map.put("2", Arrays.asList('B', 'O'));
		map.put("12", Arrays.asList('L'));
		map.put("3", Arrays.asList('U', 'P'));
		
		System.out.println(map);
		
		System.out.println("Enter input:");
		String input = sc.next();
		ArrayList<String> list = new ArrayList<String>(); //To hold the strings according to input
		for(int i=0; i<input.length(); i++) { //Traversing the input
			list.add(listToString(map.get(input.charAt(i) + "")));
		}
		
		ArrayList<String> ans = new ArrayList<String>(); //Contains all the combinations
		
	   for(int i=0; i<list.get(0).length(); i++){ //Adding all the characters of the first item in the given list
		   ans.add(list.get(0).charAt(i) + "");
	   }
	  
		for(int i = 1; i<list.size(); i++){ //Traversing the list
        	ans = combinations(ans,list.get(i));
    	}
		
		System.out.println(ans);
		
		sc.close();
	}
	
	static String listToString(List<Character> list) { //To convert List of characters to String
		 StringBuilder sb = new StringBuilder();
	        for (Character ch: list) {
	            sb.append(ch);
	        }
	 
	        return sb.toString();
	}
	
	public static ArrayList<String> combinations(ArrayList<String> inputArray, String input){ //To find the combinations

        ArrayList<String> result = new ArrayList<String>();

            for(int i=0; i<inputArray.size(); i++) {

                    for(int j=0; j<input.length(); j++) {
                        result.add(inputArray.get(i) + input.charAt(j));   
                    }

            }

        return result;

    }
}

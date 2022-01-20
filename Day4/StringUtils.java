import java.util.*;
public class StringUtils {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter 1 for Count characters \n"
					+ "Enter 2 for substring \n"
					+ "Enter 3 for split \n"
					+ "Enter 4 for pattern matching \n"
					+ "Enter 5 for checking whether all the words contains given character \n"
					+ "Enter 6 for reverse a string \n"
					+ "Enter 7 for reverse vowels");
			int choice = sc.nextInt();
			String str;
			char ch;
			switch(choice) {
			case 1: 
				System.out.println("Enter string:");
				str = sc.next();
				System.out.println("Enter Character:");
				ch = sc.next().charAt(0);
				System.out.println("Result: " + countChar(str, ch));
				break;
			case 2: 
				System.out.println("Enter string:");
				str = sc.next();
				System.out.println("Enter start index:");
				int startIndex = sc.nextInt();
				System.out.println("Enter end index:");
				int endIndex = sc.nextInt();
				System.out.println("Result: " + substring(str, startIndex, endIndex));
				break;
			case 3: 
				System.out.println("Enter string:");
				str = sc.next();
				System.out.println("Enter Character:");
				ch = sc.next().charAt(0);
				System.out.println("Result: ");
				String[] ans = split(str, ch);
				for(int i=0; i<ans.length; i++) {
					System.out.println(ans[i] + " ");
				}
				break;
			case 4: 
				System.out.println("Enter string:");
				str = sc.next();
				System.out.println("Enter Pattern:");
				String pattern = sc.next();
				System.out.println("Result: " + hasPattern(str, pattern));
				break;
			case 5: 
				Scanner sc1 = new Scanner(System.in);
				System.out.println("Enter sentence:");
				str = sc1.nextLine();
				System.out.println("Enter character:");
				ch = sc1.next().charAt(0);
				System.out.println("Result: " + allWordsContainsChar(str, ch));
				break;
			case 6: 
				System.out.println("Enter string:");
				str = sc.next();
				System.out.println("Result: " + reverse(str));
				break;
			case 7: 
				System.out.println("Enter string:");
				str = sc.next();
				System.out.println("Result: " + reverseVowels(str));
				break;
			default:
				System.out.println("Wrong choice");
			}
			System.out.println("Want to exit:Y/N");
			char isExit = sc.next().charAt(0);
			if(isExit == 'y' || isExit == 'Y')
				break;
		}
		sc.close();
	}
	
	static int countChar(String str, char ch) { //Returns occurrence of the given character in the given String (str)
		int count = 0; //To count the occurrence of the given character
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == ch)
				count ++;
		}
		return count;
	}
	
	static String substring(String str,int start,int end) { //Returns a substring from the start index to end index with all validation checks.
		String substring = ""; //To hold the substring
		if(start < 0 || end > str.length()-1 || str.isEmpty()) {
			System.out.println("Not Possible");
			return substring;
		}
		for(int i=start; i<=end; i++) {
			substring = substring + str.charAt(i);
		}
		return substring;
	}
	
	static String[] split(String str,char ch) { //Returns an array of strings broken according to the occurrence of the given character with validation checks.
		int count = countChar(str, ch); //To count the number of occurrences of the given character
		String[] list = new String[count+1];
		if(count == 0) {
			System.out.println("Character not found");
			return list;
		}
		for(int i=0; i<count+1; i++) //Inserting empty spaces in list
			list[i] = "";
		int currentIndex = 0; //To hold the currentIndex of the string
		for(int i=0; i<str.length(); i++) {
			list[currentIndex] = list[currentIndex] + str.charAt(i);
			if(str.charAt(i) == ch) {
				currentIndex++;
			}
		}
		return list;
	}
	
	static Boolean hasPattern(String str,String pattern) { //Returns true if the given string (pattern) found in the main string (str) otherwise false.
		if(pattern.length() == 0)
			return true;
		if(pattern.length() > str.length())
			return false;
		
	    for(int i=0; i<str.length(); i++){
	        int m = i;
	        for(int j=0; j<pattern.length(); j++){ //Traversing pattern
	            if(pattern.charAt(j)==str.charAt(m)){
	                if(j==pattern.length()-1) //Traversed the whole pattern
	                    return true;
	                m++;
	            }else{
	                break;
	            }
	 
	        }    
	    }  
	    return false;
	}
	
	static Boolean allWordsContainsChar(String str,char ch) { //Returns true if all words of the given string (str) contains the given character (ch)  otherwise false.
		ArrayList<String> list = new ArrayList<String>(); //To hold the words of the string
		String currentString = ""; //To hold a particular word
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) != ' ') {
				currentString = currentString + str.charAt(i);
			}
			else {
				list.add(currentString);
				currentString = "";
			}
		}
		list.add(currentString);
		for(int i=0; i<list.size(); i++) { //Checking if all the words in the array contains a character
			if(!list.get(i).contains(ch + ""))
				return false;
		}
		return true;
	}
	
	static String reverse(String str) { //Returns the reverse of the String (Without using extra String or array)
		int startIndex = 0; //To hold the left index of the string
		int endIndex= str.length()-1; //To hold the right index of the string
		char ch; //To hold the character at endIndex
		while(startIndex < endIndex) {
			ch = str.charAt(endIndex);
			if(endIndex == str.length()-1) { //First iteration
				str = substring(str, 0, endIndex-1) + str.charAt(startIndex);
				str = ch + substring(str, startIndex+1, str.length()-1);
			}
			else {
				str = substring(str, 0,endIndex-1) + str.charAt(startIndex) + substring(str, endIndex+1, str.length()-1);
				str = substring(str, 0, startIndex-1) + ch + substring(str, startIndex+1, str.length()-1);
			}
			startIndex++;
			endIndex--;
		}
		return str;
	}
	
	static String reverseVowels(String str) { //Reverse only all the vowels in the string and return it
		Stack<Character> stack = new Stack<Character>(); //To contains all the vowels
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
				stack.add(str.charAt(i));
		}
		String ans = "";
		for(int i=0; i<str.length(); i++) { //Using stack pop to insert reverse vowels in a string
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
				ans = ans + stack.pop();
			}
			else {
				ans = ans + str.charAt(i);
			}
		}
		return ans;
	}
}

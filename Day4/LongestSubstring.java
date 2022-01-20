import java.util.*;

public class LongestSubstring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.next();
		System.out.println("Result: " + findLongestSubstring(str));
		sc.close();
	}
	
	static int findLongestSubstring(String str) { //To find the longest substring without repeating characters
		String ans = str.charAt(0) + "";//To contain the substring with distinct characters
		int maxLength = 0;//To contain the length of longest substring without repetitions
		for(int i=1; i<str.length(); i++) {
			if(!ans.contains(str.charAt(i) + "")) {
				ans = ans + str.charAt(i);
			}
			else {
				if(ans.length() > maxLength) //If the current substring length is greater
					maxLength = ans.length();
				ans = str.charAt(i) + "";
			}
		}
		return maxLength;
	}
}

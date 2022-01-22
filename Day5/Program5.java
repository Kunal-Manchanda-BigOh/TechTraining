/*
 * You are given an n x n 2D matrix representing an image, 
 * rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you 
 * have to modify the input 2D matrix directly. 
 * DO NOT allocate another 2D matrix and do the rotation.
 */

import java.util.*;

public class Program5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of nxn matrix");
		int size = sc.nextInt();
		int[][] arr = new int[size][size];
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				System.out.println("Enter element:");
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Input:");
		displayMatrix(arr);
		rotateMatrix(arr);
		System.out.println("After rotating:");
		displayMatrix(arr);
	}
	
	static void displayMatrix(int[][] arr) { //To display matrix
		for(int i=0; i<arr.length; i++) { //Displaying initial array
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void rotateMatrix(int[][] arr) {
		int lastIndex = arr.length-1;
		 for (int i = 0; i < arr.length / 2; i++) //Traversing clockwise cycles
		    {
		        for (int j = i; j < arr.length - i - 1; j++)
		        {
		            int tempElement = arr[i][j]; //Assigning elements from left to right in top row to temp variable
		            arr[i][j] = arr[lastIndex - j][i]; //Assigning elements from bottom to top in left column to arr[i][j]
		            arr[lastIndex - j][i] = arr[lastIndex - i][lastIndex - j]; //Assigning elements from right to left in bottom row to arr[lastIndex - j][i]
		            arr[lastIndex - i][lastIndex - j] = arr[j][lastIndex - i]; //Assigning elements from top to bottom in right column to arr[lastIndex - i][lastIndex - j]
		            arr[j][lastIndex - i] = tempElement; //Assigning temp variable to arr[j][lastIndex-i]
		        }
		    }
	}
}

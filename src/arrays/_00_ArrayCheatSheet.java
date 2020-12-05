package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] Pup = {"Dog", "Eats", "Many", "Food", "Pebbles"};
		//2. print the third element in the array
		System.out.println(Pup[2]);
		//3. set the third element to a different value
		Pup[2]="Five";
		//4. print the third element again
		System.out.println(Pup[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < Pup.length; i++) {
			System.out.println(Pup[i]);
		}
		
		//6. make an array of 50 integers
		int [] Numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < Numbers.length; i++) {
			Numbers[i]=new Random().nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallestnumber= 49;
		for (int i = 0; i < Numbers.length; i++) {
			if (smallestnumber>Numbers[i] ){
				smallestnumber=Numbers[i];
			}
		}
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < Numbers.length; i++) {
			System.out.println(Numbers[i]);
		}
		//10. print the largest number in the array.
		int largestnumber= 0;
		for (int i = 0; i < Numbers.length; i++) {
			if (largestnumber<Numbers[i] ){
				largestnumber=Numbers[i];
			}
		}
		System.out.println(smallestnumber);
		System.out.println(largestnumber);
	}
}

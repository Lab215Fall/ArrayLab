import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		input.close();
		
		boolean result = checkPalindrome(str);
		
		if(result==true){
			System.out.println(str+" is a palindrome");
		}
		else{
			System.out.println(str+" is not a palindrome");
		}

	}
	
	public static boolean checkPalindrome(String s){
		
		boolean palindrome = true;
		
		//  implement your logic here and change the value of palindrome to false if necessary
		
		return palindrome;
	}



}

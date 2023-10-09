package Main;

import java.util.Scanner;

public class VowelInString {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter string");
		String name=scan.nextLine();
		name=name.toLowerCase();
		
		char[] c=name.toCharArray();
		int vowel=0;
		
		for (int i=0;i<name.length();i++) {
			if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='o'||name.charAt(i)=='u') 
				vowel++;
			
		}
		
		System.out.println("Number of Vowels in the given String :"+vowel);
	}

}

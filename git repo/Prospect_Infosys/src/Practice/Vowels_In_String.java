package Practice;

import java.util.Scanner;

public class Vowels_In_String {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
//		System.out.println("Enter a String");
//		String name=scan.nextLine();
//		name=name.toLowerCase();
//		char[] ch=name.toCharArray();
//		int vowel=0;
//		for(int i=0;i<name.length();i++) {
//			if(name.charAt(i)=='a' ||name.charAt(i)=='e' ||name.charAt(i)=='i' ||name.charAt(i)=='o' ||name.charAt(i)=='u') {
//				vowel++;
//			}
//		}
//		System.out.println(vowel);
		
		int num=scan.nextInt();
	long factorial=1;
	for(int i=0;i<num;i++) {
		factorial=factorial*i;
	}
		System.out.println(factorial);

	}

}

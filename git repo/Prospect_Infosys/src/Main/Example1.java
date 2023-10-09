package Main;

import java.util.Scanner;

public class Example1 {
	
	
	public void printTable(int number,int upto) {
		for(int i=1;i<=upto;i++) {
			int result=number*i;
			System.out.println(number+" * "+i+" = "+result);
			
			
		}
		
	}

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number");
		int tableNo=scan.nextInt();
		System.out.println("Enter a number table upto");
		int tableupto=scan.nextInt();
		Example1 ex=new Example1();
		ex.printTable(tableNo,tableupto);

	}

}

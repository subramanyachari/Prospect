package Main;

public class Variables {

	public static void main(String[] args) {

		//		int a=10;
		//		int b=20;
				
		//		int c=a+b;
		//		System.out.println(c);


		//		int a=10;
		//		
		//		float f=a;
		//		System.out.println(f);
		//		
		//		float f=10.0f;
		//		int a=(int)f;
		//		System.out.println(a);
		//		
		//		int s=20;
		//		
		//		byte b=(byte)s;
		//		System.out.println(b);
		//		
		//		byte q=10;
		//		byte w=20;
		//		
		//		int d=(int)(q+w);
		//		System.out.println(d);

		for(int i=0;i<=100;i++) {
			if(i%2!=0)
				System.out.println(i);
		}
		int number=12;
		int num=10;
		int numb=11;
		for(int j=1;j<=10;j++) {
			int result=num*j;
			System.out.println(num+" * "+ j+" = "+result);

		}
		System.out.println("  ");
		
		
		int k=1;
		while(k<=10) {
			int result=numb*k;
			System.out.println(numb+" * "+ k +" = "+result);
			k++;
		}
		
		System.out.println(" ");
		int l=1;
		
		do {	
			int result=number*l;
			System.out.println(number+" * "+ l +" = "+result);
			l++;
			
		}while(l<=10);


	}

}

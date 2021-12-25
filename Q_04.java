package bir;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		System.out.print("birinci say� =");
		Scanner scan=new Scanner(System.in);
		int sayi1=scan.nextInt();
		
		//Scanner scan=new Scanner(System.in);
		System.out.print("ikinci say� =");
		int sayi2=scan.nextInt();
		
		System.out.println("topla ="+(sayi1+sayi2)+"\n"+"�armpa ="+(sayi1*sayi2)+"\n"+"b�lme ="+(sayi1/sayi2));
	}

	
}

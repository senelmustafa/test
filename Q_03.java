package bir;

import java.nio.channels.NoConnectionPendingException;
import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {
		//girilen bilgileri alt alta yazd�r�yoruz
		System.out.print("Kullan�c� ad�n�z� giriniz =");
		Scanner scan=new Scanner(System.in);
		String adi=scan.nextLine();
		System.out.print("soyad�n�z� giriniz =");
		String sAdi=scan.nextLine();
		System.out.print("ya� =");
		int yas=scan.nextInt();
		System.out.print("boyunuzu giriniz =");
		int boy=scan.nextInt();
		System.out.println(   adi +"\n" +   sAdi+"\n"   + yas+"\n" +   boy+"\n");
		
		 
scan.close();
	}

	
}

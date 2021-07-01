package baslangic1;

import java.util.Scanner;

public class ders9 {

	public static void main(String[] args) {
		// Switch case çok fazla if-else yapısı kullanmaktan alıkoyar.
		// break; komutu ifade sağlandıktan hemen sonra durur.Yani diğerlerini
		// okumaz.Böylece diğer koşulları yazdırmaz.
		/*
		 * switch (ifade) { case değer: //kodlar break; case değer2: //kodlar break;
		 * default: //kodlar }
		 */
		int sayi;
		Scanner girdi = new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		sayi = girdi.nextInt();
		switch (sayi) {
		case 1:
			System.out.println("sayı 1'dir.");
			break;
		case 2:
			System.out.println("sayı 2'dir.");
			break;
		default:
			System.out.println("sayı geçersizdir.");
		}

	}

}

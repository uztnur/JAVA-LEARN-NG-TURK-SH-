package baslangic1;

import java.util.Scanner;

public class ders10HesapMakinesiYapimi {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz : ");
		int sayi1 = scan.nextInt();
		System.out.println("İkinci sayıyı giriniz : ");
		int sayi2 = scan.nextInt();
		System.out.println("Yapmak istediğiniz işlemi seçiniz : 1-Toplama 2-Çıkarma 3-Çarpma 4-Bölme");
		int islem = scan.nextInt();
		switch (islem) {
		case 1:
			System.out.println("Sonuç: " + sayi1 + sayi2);
			break;
		case 2:
			System.out.println("Sonuç: " + (sayi1 - sayi2));
			break;
		case 3:
			System.out.println("Sonuç: " + (sayi1 * sayi2));
			break;
		case 4:
			System.out.println("Sonuç: " + (sayi1 / sayi2));
			break;

		default:
			System.out.println("GEÇERSİZ İŞLEM !!!");
		}

	}

}

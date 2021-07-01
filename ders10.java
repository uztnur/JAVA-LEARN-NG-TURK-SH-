package baslangic1;

import java.util.Scanner;

public class ders10 {

	public static void main(String[] args) {
		Scanner girdi = new Scanner(System.in);
		int a, b, secim;
		System.out.println("1.sayıyı giriniz: ");
		a = girdi.nextInt();
		System.out.println("2.sayıyı giriniz: ");
		b = girdi.nextInt();
		System.out.println("1-Toplama\n2-Çıkarma \n3-Çarpma \n4-Bölme \n5-Mod Alma");
		System.out.println("Yapmak istediğiniz işlemi seçiniz: ");
		secim = girdi.nextInt();
		switch (secim) {
		case 1:
			System.out.println("Sonuç: " + (a + b));
			break;
		case 2:
			System.out.println("Sonuç: " + (a - b));
			break;
		case 3:
			System.out.println("Sonuç: " + (a * b));
			break;
		case 4:
			if (b == 0) {
				System.out.println("payda=0 olduğundan cevap belirsizdir.");
			} else {
				System.out.println("Sonuç: " + (a / b));
			}
			break;
		case 5:
			System.out.println("Sonuç: " + (a % b));
			break;
		default:
			System.out.println("Geçersiz işlem !!!");
			break;
		}

	}
}

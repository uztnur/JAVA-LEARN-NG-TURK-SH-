package baslangic1;

import java.util.Scanner;

public class ders6KDVHesaplayanProgram {

	public static void main(String[] args) {
		int tutar;
		double hamKdvOrani,kdvOrani,kdvliTutar;
		Scanner girdi =new Scanner(System.in);
		System.out.println("Ürün tutarını giriniz: ");
		tutar=girdi.nextInt();
		System.out.println("KDV oranını giriniz: ");
		hamKdvOrani=girdi.nextInt();
		kdvOrani=hamKdvOrani*0.01;
		System.out.println("Ürünün KDV tutarı: "+kdvOrani*tutar);
		kdvliTutar=(kdvOrani*tutar)+tutar;
		System.out.println("ürünün KDV'li tutarı :"+ kdvliTutar);
		

	}

}

package baslangic1;

import java.util.Scanner;

public class ders5NotOrtalamasiHesaplayanProgram {

	public static void main(String[] args) {
		// İlk  önce değişkenleri tanımlıyoruz.Dikkat ederseniz final yazamadık çünkü final javada bulunan bir fonksiyon yani yasaklı kelime.
		int quiz , vize , ffinal ;
		double ortalama; //double yazmamızın nedeni ise  ortalama ondalıklı çıkarsa int da hata verecektir.Ama int değer olursa double da hata vermez.
		Scanner girdi =new Scanner(System.in);
	    System.out.println("Quiz notunu giriniz: ");
	    quiz=girdi.nextInt();
	    System.out.println("Vize notunu giriniz: ");
	    vize=girdi.nextInt();
	    System.out.println("Final notunu giriniz: ");
	    ffinal=girdi.nextInt();
	    
	    ortalama=((quiz*0.2)+(vize*0.4)+(ffinal*0.4 ));
	    String sonuc = (ortalama>=60)? "Dersi "+ortalama+" ile  geçtiniz.":"Üzgünüm,kaldınız.";
	    System.out.println(sonuc);
	

	}

}

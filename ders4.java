package baslangic1;

import java.util.Scanner;

public class ders4 {

	public static void main(String[] args) {
		// Javada konsoldan veri almak için Scanner sınıfını kullanırız.Bu sınıfı dahil etmek için classın üzerine import java.util.Scanner;  yazarız.Yani meşhur import etme dedikleri :)) 
		// Scanner input = new Scanner.(System.in);
		// input:giriş demek ve değişebilir bir kelimedir.Kimisi klavye der , kimisi giriş,kimisi veri onun dışında bu tanımlamayı değiştiremeyiz.
		// Gelelim ayrıcalıklı özelliklere sahip değişkenlere göre olan durumlarına yukarıdaki tanım hiçbir şekilde değişmemekle birlikte(yalnızca tanım kelimesi değişebilir.) bunları değişken türüne göre entegre etmeliyiz.
		// Genel kural :  değişken türü  değişken adı = scanner tanım sözcüğü.next değişkenin adı ilk harfi büyük olmak zorunda.
		//Gelelim istisnai duruma String : Stringte değişken adı yerine Line yazıyoruz.
		// int için: int a = input.nextInt(); burada input yazmamın amacı tanımlamada kullandığım input sözcüğüdür.Siz ne yazdıysanız onu yazmalısınız.
		// double için : double  b =input.nextDouble(); // Double a int değer girebiliriz.!!! *** Double a ondalıklı veri girerken ',' kullanmalıyız yoksa hata alırız. 
		//  ***String için : String c= input.nextLine(); Dediğim gibi String narin bir kadın gibi daha bir nazlı bu yüzden farkı "Line" :))
		// float için : float d =input.nextFloat();
		// byte için: byte e = input.nextByte();
		// short için: short f=input.nextShort();
		Scanner girdi=new Scanner(System.in);
		int a,b;
		System.out.println("A Sayısını giriniz: ");
		a = girdi.nextInt();
		System.out.println("B Sayısını giriniz: ");
		b = girdi.nextInt();
		System.out.println("A sayısı: "+a+" "+"B sayısı: "+b+"'dır");
		
		double c;
		System.out.println("Double türünde bir sayı giriniz: ");
		c=girdi.nextDouble();
		System.out.println("C = "+c);

	}

}

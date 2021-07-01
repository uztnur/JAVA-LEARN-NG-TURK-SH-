package baslangic1;

public class ders3 {

	public static void main(String[] args) {
		// ARİTMETİK OPERATÖRLER
		// Toplama:a+b
		//Çıkarma:a-b
		//Çarpma:a*b
		//Bölme:a/b
		//Mod Alma ( 1.sayının 2.sayıya bölümünden kalan):a%b
		// 1 arttırma : a++
		// 1 azaltma: a--
		//İLİŞKİSEL OPERATÖRLER
		//Eşitlik: a == b
		//Eşit Değil : a != b
		//Büyüktür: a > b
		//Küçüktür: a < b
		//Büyük Eşittir: a >= b
		//Küçük Eşittir: a <= b
		//MANTIKSAL OPERATÖRLER
		// Ve : a && b 
		// - True && True = True   
		// - False && True = False
		//Veya: a || b
		// True || True = True 
		// True || False = True
		// Değil: !( a && b )
		//KOŞUL OPERATÖRÜ 
		// a = 6;
		// b= ( a==5)? 5 : 0;  ( a = 5 se 1.koşul 5 değilse 2.koşul 0 yazdırır.)
		// Çıktı: 0
		int a = 5;
		int b = 10;
		int toplam = a+b;
		int cikarma=a-b;
		int bolme =a/b;
		int carpma=a*b;
		int mod = a%b;
		System.out.println("toplam :"+toplam);
		System.out.println("çıkarma :"+cikarma);
		System.out.println("bölme :"+bolme);
		System.out.println("çarpma :"+carpma);
		System.out.println("mod :"+mod);
		toplam++;
		cikarma--;
		
		int sayi1=10;
		int sayi2=20;
		
		boolean kosul = (sayi1/sayi2) == 2;
		System.out.println(kosul);
		
		boolean kosul1=(sayi1< sayi2);
		boolean kosul2=(sayi1>sayi2);
		boolean sonuc1=kosul1&&kosul2;
		System.out.println(sonuc1);
		
		boolean sonuc2= kosul1 || kosul2 ;
		System.out.println(sonuc2);
		
		String sonuc3= (a==b)? "Doğru":"Yanlış";
		System.out.println(sonuc3);
		
		sayi1=sayi2;
		System.out.println(sayi1);
		sayi1 += 2;
		System.out.println(sayi1);
		

	}

}

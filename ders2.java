package baslangic1;

public class ders2 {

	public static void main(String[] args) {
		
		// String metin tutar."" içine yazarak tanımlama yaparız.
		String k="Hello Java's World";
		System.out.println("String değeri"+" "+k);
		// byte  -128 ve 127 arasındaki tam sayıları  tutmak istersek kullanabileceğimiz bir değişkendir.
		byte a=100;
		System.out.println("byte değeri"+" "+a);
		
		// short  -32.768 ve 32.767 arasındaki tam sayıları  tutmak istersek kullanabileceğimiz bir değişkendir.
		short c=32645;
        System.out.println("short değeri"+" "+c);
		
        // int  -2.147.483.648 ve 2.147.483.647 arasındaki tam sayıları  tutmak istersek kullanabileceğimiz bir değişkendir.
		int b =136;
		System.out.println("int değeri"+" "+b);
		
		// long  -9.223.372.036.854.775.808 ve 9.223.372.036.854.775.807 arasındaki tam sayıları  tutmak istersek kullanabileceğimiz bir değişkendir.
		long d =203685477;
		System.out.println("long değeri"+" "+d);
		
		// float maksimum 7 basamaklı ondalıklı sayıya izin verir.Tanımlamadan sonra 'f' veya 'F' yazmazk gereklidir.
		// floatla tam sayıları tanımlarken direkt sayıyı yazmamız yeterli olacaktır.Yani ayrıca f koymamıza gerek yoktur.ÖR: float z=23; çıktı:23.0
		float e=1.456987f;
		System.out.println("float değeri"+" "+e);
		
		//double maksimum 16 basamaklı ondalıklı sayıya izin verir.
		double f=2.145698756987856;
		System.out.println("double değeri"+" "+f);
		
		// char karakterleri tutar. '' lar içinde yazmalıyız .Evrensel dile sahip olduğundan ötürü tüm dillerdeki harfleri kullanmamıza olanak sağlar.
		char h = '&';
		System.out.println("char değeri"+" "+h);
		
		// boolean kontrol için kullanırız.True ve false değerlerini alır.
		boolean dolarDustuMu=false;
		System.out.println("boolean sonucu"+" "+dolarDustuMu);

	}

}

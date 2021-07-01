package baslangic1;

public class ders8 {

	public static void main(String[] args) {
		// if,else ve else if koşulların sonuçlarını kontrol etmemize yarar.
		// Sadece 2 sonuç ihtimali varsa if ve else kullanırız fakat 2'den fazla sonuç
		// ihtimali varsa else if de kullanırız.
		int a = 5;
		int b = 12;
		int c = 20;
		if (a == b) {
			System.out.println("a = b 'dir.");
		} else {
			System.out.println(" a, b'ye eşit değildir.");
		} // Burada 2 sayının eşit olup olmadığını kontrol ettik.Sadece 2 sonuç ihtimali
			// olduğundan if ve else kullandık.

		if ((a < b) && (a < c)) {
			System.out.println("En küçük sayı a ' dır.");
		} else if ((c < b) && (c < a)) {
			System.out.println("En küçük sayı c ' dir.");
		} else {
			System.out.println("En küçük sayı b ' dir.");
		} // Burada ise 3 sayıdan en küçük olanı bulduk.Burada 3 sonuç ihtimali olduğundan
			// else if de kullandık.

	}

}

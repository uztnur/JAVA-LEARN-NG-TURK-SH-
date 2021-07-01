package baslangic1;

import java.util.Scanner;

public class ders7DaireninAlaniniVeCevresiniBulanProgram {

	public static void main(String[] args) {
		int r,alan,cevre ;
		Scanner girdi=new Scanner(System.in);
		System.out.println("Dairenin yarıçapını giriniz:  ");
		r=girdi.nextInt();
		alan=3*r*r;
		cevre=2*3*r;
		System.out.println("Dairenin çevresi: "+cevre+  "\nDairenin alanı : "+alan);

	}

}

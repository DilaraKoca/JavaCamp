package intro;

public class Main {

	public static void main(String[] args) {
		//camel case - Don't repeat yourself
		String internetSubeButonu="�nternet �ubeye Gir";
		double dolarDun= 8.15;
		double dolarBugun = 8.18;
		int vade = 36;
		boolean dustuMu = false;
		System.out.println(internetSubeButonu);	
		
		if(dolarBugun<dolarDun){
			System.out.println("Dolar d��t� ikonu");
		}
		else if(dolarBugun==dolarDun) {
			System.out.println("Dolar e�ittir ikonu");	
		}
		else {
			System.out.println("Dolar y�kseldi ikonu");
		}	
		
		String[] krediler = {
		"H�zl� Kredi",
		"Emekli Kredisi",
		"Konut Kredisi",
		"�ift�i Kredisi",
		"Msb Kredisi",
		"Meb Kredisi",
		"K�lt�r Bakanl��� Kredisi",
		};		
		//foreach
		for(String kredi: krediler)
		{
		System.out.println(kredi);
		}
		System.out.println("-------------");
		//for
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		System.out.println("----------");
		int sayi1 =10;
		int sayi2=20;
		sayi1=sayi2;
		sayi2=100;
		System.out.println(sayi1);

		int[] sayilar1 = {1,2,3,4,5};
		int[] sayilar2 = {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);

	}
}

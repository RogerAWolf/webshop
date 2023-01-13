import webshop.Klant;
import webshop.Webshop;
import java.util.Scanner;

public class TestApp {
	public static void main(String[] fietsenwinkel){
		Scanner scan = new Scanner(System.in);
		Webshop webshop = new Webshop();
		
		System.out.println("Hoe heet de klant?");
		String klantnaamInput = scan.nextLine();
		webshop.setKlant(new Klant(klantnaamInput));
		
		System.out.println("Hoe heet de winkel?");
		String winkelnaamInput = scan.nextLine();
		webshop.setNameOfShop(winkelnaamInput);

		System.out.println("Hoeveel producten heeft de winkel?");
		String aantalProductenInput = scan.nextLine();		
		webshop.setNumberOfProducts(aantalProductenInput);

		System.out.println("Is de winkel open? (true/false)");
		String openInput = scan.nextLine();
		webshop.setIsOpen(openInput);

		System.out.println("Wat is de slogan van de winkel?");
		String sloganInput = scan.nextLine();
		webshop.setSlogan(sloganInput);

		System.out.println("Hoeveel klanten zijn er in de winkel?");
		String aantalKlantenInput = scan.nextLine();
		webshop.setNumberOfCustomers(aantalKlantenInput);

		System.out.println(webshop);
		
	}
}
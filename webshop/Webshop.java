package webshop;

public class Webshop {

	private Klant klant;
	private String nameOfShop;
	public int numberOfProducts;
	public boolean isOpen;
	String slogan;
	int numberOfCustomers;
	
	public Webshop(){
		this.klant = new Klant();
	}

	public Klant getKlant(){
		return this.klant;
	}

	public String getNameOfShop(){
		return this.nameOfShop;
	}

	public int getNumberOfProducts(){
		return this.numberOfProducts;
	}

	public boolean isOpen(){
		return this.isOpen;
	}

	public String getSlogan(){
		return this.slogan;
	}

	public int getNumberOfCustomers(){
		return this.numberOfCustomers;
	}

	public void setKlant(Klant klant){
		this.klant = klant;
	}

	public void setNameOfShop(String nameOfShop){
		this.nameOfShop = nameOfShop;
	}

	public void setNumberOfProducts(String numberOfProducts){
		try {
			if(Integer.valueOf(numberOfProducts) >= 0){
				this.numberOfProducts = Integer.valueOf(numberOfProducts);				
			} else {
				System.exit(0);
			}
		} catch (Exception e) {
			System.exit(0);
		}
	}

	public void setIsOpen(String isOpen){
		try {
			if(isOpen.equals("true") || isOpen.equals("false")){
				this.isOpen = Boolean.valueOf(isOpen);				
			} else {
				System.exit(0);
			}
		} catch (Exception e) {
			System.exit(0);
		}
	}

	public void setSlogan(String slogan){
		this.slogan = slogan;
	}

	public void setNumberOfCustomers(String numberOfCustomers){
		try {
			if(Integer.valueOf(numberOfCustomers) >= 0){
				this.numberOfCustomers = Integer.valueOf(numberOfCustomers);				
			} else {
				System.exit(0);
			}
		} catch (Exception e) {
			System.exit(0);
		}
	}

	public String toString(){
		return "Klantnaam: " + this.klant + "\n" + 
		"Naam van de winkel: " + this.nameOfShop + "\n" + 
		"Aantal producten: " + this.numberOfProducts + "\n" + 
		"De winkel is open: " + this.isOpen + "\n" + 
		"De slogan van de winkel is: " + this.slogan + "\n" + 
		"Er zijn " + numberOfCustomers + " klanten in de winkel."; 
	}
}
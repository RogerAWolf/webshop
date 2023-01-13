package webshop;

public class Klant {
	
	private String klantnaam;

	public Klant(){
		this.klantnaam = "";
	}

	public Klant(String klantnaam){
		this.klantnaam = klantnaam;
	}

	public String getKlantnaam(){
		return this.klantnaam;
	}

	public void setKlantnaam(String klantnaam){
		this.klantnaam = klantnaam;
	}

	public String toString(){
		return this.klantnaam;
	}
}
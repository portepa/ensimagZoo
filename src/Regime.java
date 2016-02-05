
public class Regime {
	private String nourriture;
	private int prixAuKilogramme;
	private int quantite;

	public Regime(String nourriture, int prixAuKilogramme, int quantite) {
		this.nourriture = nourriture;
		this.prixAuKilogramme = prixAuKilogramme;
		this.quantite = quantite;
	}

	public String getNourriture() {
		return this.nourriture;
	}

	public int getPrixAuKilogramme() {
		return this.prixAuKilogramme;
	}

	public int getQuantite() {
		return this.quantite;
	}

	public int getCout() {
		return this.getQuantite() * this.getPrixAuKilogramme();
	}

	public String toString() {
		return "Régime : " + this.getQuantite() + " kilos de " + this.getNourriture() + " à " + this.getPrixAuKilogramme() +"€ le kilogramme.";
	}
} 

public class Centaure extends Animal {
	private int vitesseDePointe;

	public Centaure(String nom, int poids, int vitesseDePointe) {
		super(nom, poids);
		this.setRegime(new Regime("Herbe", 7, 2 * this.getPoids()));
		this.vitesseDePointe = vitesseDePointe;
	}

	public int getVitesseDePointe() {
		return this.vitesseDePointe;
	}

	@Override
	public void crier() {
		System.out.println(this.getNom() + ", Centaure de " + this.getPoids() + " kilos avec une vitesse de pointe de " + this.getVitesseDePointe() + "km/h, crie... il hennit !");
	}

	public String toString() {
		return "Je suis " + this.getNom() + " le Centaure et je pèse " + this.getPoids() + " kilos.";
	}
}

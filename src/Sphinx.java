
public class Sphinx extends Animal {
	private int nombreEnigmes;

	public Sphinx(String nom, int poids, int nombreEnigmes) {
		super(nom, poids);
		this.setRegime(new Regime("Graines", 2, 1));
		this.nombreEnigmes = nombreEnigmes;
	}

	public int getNombreEnigmes() {
		return this.nombreEnigmes;
	}

	@Override
	public void crier() {
		System.out.println(this.getNom() + ", Sphinx de " + this.getPoids() + " kilos avec " + this.getNombreEnigmes() + " énigmes, crie... il feule !");
	}

	public String toString() {
		return "Je suis " + this.getNom() + " le Sphinx et je pèse " + this.getPoids() + " kilos.";
	}
}

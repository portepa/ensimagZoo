
public class Sphinx extends Animal {
	private int nombreEnigmes;

	public Sphinx(String nom, int poids, int nombreEnigmes) {
		super(nom, poids);
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
		return "Je suis " + this.getNom() + " et je pèse " + this.getPoids() + " kilos.";
	}
}

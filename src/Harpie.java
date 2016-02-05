
public class Harpie extends Animal {
	private String couleurDesPlumes;

	public Harpie(String nom, int poids, String couleurDesPlumes) {
		super(nom, poids);
		this.couleurDesPlumes = couleurDesPlumes;
	}

	public String getCouleurDesPlumes() {
		return this.couleurDesPlumes;
	}

	@Override
	public void crier() {
		System.out.println(this.getNom() + ", Harpie de " + this.getPoids() + " kilos avec des plumes de couleur " + this.getCouleurDesPlumes() + ", crie... elle glatit !");
	}

	public String toString() {
		return "Je suis " + this.getNom() + " et je pèse " + this.getPoids() + " kilos.";
	}
}

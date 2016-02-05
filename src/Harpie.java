
public class Harpie extends Animal {
	private String couleurDesPlumes;

	public Harpie(String nom, int poids, String couleurDesPlumes) {
		super(nom, poids);
		this.setRegime(new Regime("Poissons", 11, 2));
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
		return "Je suis " + this.getNom() + " la Harpie et je pèse " + this.getPoids() + " kilos.";
	}
}

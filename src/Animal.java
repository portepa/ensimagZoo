
public abstract class Animal {
	private String nom;
	private int poids;
	private Regime regime;

	public Animal(String nom, int poids) {
		this.nom = nom;
		this.poids = poids;
	}

	public String getNom() {
		return this.nom;
	}

	public int getPoids() {
		return this.poids;
	}

	public Regime getRegime() {
		return this.regime;
	}

	protected void setRegime(Regime regime) {
		this.regime = regime;
	}

	public void crier() {
		System.out.println(this.getNom() + " crie.");
	}

	public String toString() {
		return "Je suis " + this.getNom() + " et je pèse " + this.getPoids() + " kilos.";
	}

	public int coutDeNourriture() {
		return this.getRegime().getCout();
	}
}

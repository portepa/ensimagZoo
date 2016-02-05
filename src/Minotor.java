
public class Minotor extends Animal {
	private int nombreDeCornes;

	public Minotor(String nom, int poids, int nombreDeCornes) {
		super(nom, poids);
		this.nombreDeCornes = nombreDeCornes;
	}

	public int getNombreDeCornes() {
		return this.nombreDeCornes;
	}

	@Override
	public void crier() {
		System.out.println(this.getNom() + ", Minotor de " + this.getPoids() + " kilos avec ses " + this.getNombreDeCornes() + " cornes, crie... il rugit !");
	}

	public String toString() {
		return "Je suis " + this.getNom() + " et je pèse " + this.getPoids() + " kilos.";
	}
}

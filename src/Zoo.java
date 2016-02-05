import java.util.LinkedList;

class Zoo {
	private String nom;
	private LinkedList<Animal> animaux;

	public Zoo(String nom) {
		this.nom = nom;
		animaux = new LinkedList<Animal>();
	}

	public String getNom() {
		return this.nom;
	}

	public int getAnimaux() {
		return animaux.size();
	}

	public void ajouterAnimal(Animal animal) {
		animaux.add(animal);
	}

	public void crier() {
		for(Animal a : animaux) {
			a.crier();
		}
	}

	public void manger() {
		for(Animal a : animaux) {
			System.out.println(a.getNom() + " : " + a.getRegime().toString());
		}
	}

	public int coutDeNourriture() {
		int cout = 0;
		for(Animal a : animaux) {
			cout += a.coutDeNourriture();
		}
		return cout;
	}

	@Override
	public String toString() {
		return "Zoo " + this.getNom() + " contient " + animaux;
	}
}
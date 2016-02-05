import java.util.LinkedList;

class Zoo {
	private String nom;
	private LinkedList<Animal> animaux;

	public Zoo(String nom) {
		this.nom = nom;
		animaux = new LinkedList<Animal>();
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

	@Override
	public String toString() {
		return "Zoo " + this.nom + " contient " + animaux;
	}
}
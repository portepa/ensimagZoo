
public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("ENSIMAG");

		Animal catherine = new Animal("Catherine", 55);
		Animal gwen = new Animal("Gwne", 52);
		Animal mathias = new Animal("Mathias", 78);
		Animal matthieu = new Animal("Matthieu", 66);
		Animal nicolas = new Animal("Nicolas", 68);
		Animal sylvain = new Animal("Sylvain", 72);

		zoo.ajouterAnimal(catherine);
		zoo.ajouterAnimal(gwen);
		zoo.ajouterAnimal(mathias);
		zoo.ajouterAnimal(matthieu);
		zoo.ajouterAnimal(nicolas);
		zoo.ajouterAnimal(sylvain);

		zoo.crier();
	}
}

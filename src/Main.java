
public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("ENSIMAG");

		Animal catherine = new Minotor("Catherine", 55, 3);
		Animal gwen = new Harpie("Gwen", 52, "rose");
		Animal mathias = new Centaure("Mathias", 78, 124);
		Animal matthieu = new Sphinx("Matthieu", 66, 12);
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

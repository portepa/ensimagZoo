
public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("ENSIMAG");

		Animal catherine = new Minotor("Catherine", 55, 3);
		Animal gwen = new Harpie("Gwen", 52, "rose");
		Animal mathias = new Centaure("Mathias", 78, 124);
		Animal matthieu = new Sphinx("Matthieu", 66, 12);
		//Animal nicolas = new Animal("Nicolas", 68);
		//Animal sylvain = new Animal("Sylvain", 72);

		zoo.ajouterAnimal(catherine);
		zoo.ajouterAnimal(gwen);
		zoo.ajouterAnimal(mathias);
		zoo.ajouterAnimal(matthieu);
		//zoo.ajouterAnimal(nicolas);
		//zoo.ajouterAnimal(sylvain);

		System.out.println("============== CRIS DU ZOO");
		zoo.crier();
		System.out.println();

		System.out.println("============== RÉGIMES DU ZOO");
		zoo.manger();
		System.out.println();

		System.out.println("============== PRIX DES RÉGIMES");
		System.out.println(catherine.getNom() + " : " + catherine.coutDeNourriture() + "€");
		System.out.println(gwen.getNom() + " : " + gwen.coutDeNourriture() + "€");
		System.out.println(mathias.getNom() + " : " + mathias.coutDeNourriture() + "€");
		System.out.println(matthieu.getNom() + " : " + matthieu.coutDeNourriture() + "€");
		System.out.println();

		System.out.println("============== PRIX TOTAL");
		System.out.println("Prix total des régimes : " + zoo.coutDeNourriture() + "€");
		System.out.println();
	}
}

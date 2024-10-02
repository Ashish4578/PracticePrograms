
public class Lion extends Animal {
	String name;
	int count;

	Lion() {
		super();

	}

	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Animal(2);
//		Animal c = new Animal("tiger");
		Animal d = new Animal("lion", "non-veg");
	}
}


public class Animal {
	public Animal() {
		System.out.println("Default Animal Constructor");
	}

	private Animal(String name) {
		System.out.println("Private Animal Constructor " + name);
	}

	protected Animal(String name, String prefer) {
		System.out.println("Protected Animal Constructor " + name + " is diet preference is " + prefer);
	}

	Animal(int count) {
		System.out.println("Default constructor " + count);
	}

//	public static void main(String[] args) {
//		Animal a = new Animal();
//		Animal b = new Animal(2);
//		Animal c = new Animal("tiger");
//		Animal d = new Animal("lion", "non-veg");
//	}
}

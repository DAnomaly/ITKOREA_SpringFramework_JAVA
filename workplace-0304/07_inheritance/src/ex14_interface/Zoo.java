package ex14_interface;

public class Zoo {

	// field
	private Animal[] animals;
	private int idx;
	
	// constructor
	public Zoo(int animalCount) {
		animals = new Animal[animalCount];
	}
	
	// method
	public void addAniaml(Animal animal) {
		if(idx < animals.length) {
			animals[idx++] = animal;
		}
	}
	
	public void info() {
		for (Animal animal : animals) {
			if(animal != null)
				animal.move(); 
		}
	}
	
}

package ex16_interface_extends;

public class Person {

	// method
	// 1. Pet에게 food주기
	public void feed(Pet pet, String food) { 
		pet.feed(food);
	}
	
	// 2. Pet과 산책하기
	public void walking(Walkable pet) {
		System.out.println("Walking with " + ((Pet)pet).getName());
	}
	
}

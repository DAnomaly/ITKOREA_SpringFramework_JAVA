package ex03_generic;

public class MainClass {

	public static void main(String[] args) {

		Box<Fruit> box = new Box<Fruit>(8);

		try {
			box.addItem(new Fruit("Apple", 1000));
			box.addItem(new Fruit("Grape", 3000));
			box.addItem(new Fruit("StrawBerry", 2500));
			box.addItem(new Fruit("WaterMelon", 10000));
			box.addItem(new Fruit("melon", 15000));
			box.addItem(new Fruit("Orange", 1200));
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(box);

	}

}

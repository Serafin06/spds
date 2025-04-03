package lab2_2;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {

		Car car = createCitroen();
		Car car2 = car.clone();
		
		car2.setMake("Nissan");
		printCar(car);
		printCar(car2);
		
		car2.getEquipment().add(new Equipment("Radio", 2));
		car2.getEquipment().get(0).setName("XXX");
		System.out.println("============");
		printCar(car);
		printCar(car2);
		

	}

	public static Car createCitroen() {
		Car car = new Car();
		car.setMake("Citroen");
		car.setModel("Xsara");
		car.setEngine("2.0 HDI");
		List<Equipment> list = new ArrayList<Equipment>();
		list.add(new Equipment("Clima", 1));
		list.add(new Equipment("Airbag", 4));
		car.setEquipment(list);
		return car;
	}

	public static void printCar(Car car) {
		System.out.println(car.getMake() + " " + car.getModel() + " " + car.getEngine());
		for (Equipment e : car.getEquipment()) {
			System.out.println(e.getName() + " " + e.getAmount());
		}
	}

}

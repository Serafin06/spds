package lab2_2;

import java.util.ArrayList;
import java.util.List;

public class Car implements Cloneable {

	public int getIdc() {
		return idc;
	}

	public void setIdc(int idc) {
		this.idc = idc;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public List<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<Equipment> equipment) {
		this.equipment = equipment;
	}

	private int idc;
	private String make;
	private String model;
	private String engine;
	private List<Equipment> equipment = new ArrayList<Equipment>();

	public Car clone() throws CloneNotSupportedException{ 
		  Car nowy = (Car) super.clone();
		  List<Equipment> noweEq = new ArrayList<>();
		  
		  for (Equipment e:getEquipment()) {
			  
			  noweEq.add(new Equipment(e.getName(), e.getAmount()));
			  }
		  
		  nowy.setEquipment(noweEq);
		  
		  return nowy;
	 }

}

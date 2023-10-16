public class Test {
	public static void main(String[] args) {
		Water waterObjRef1 = new Water(10, "Soft");
		Electricity electricityObjRef1 = new Electricity(0.6f);
		WaterPurifier WaterPurifierObj1 = new WaterPurifier();
		WaterPurifierObj1.processWater(waterObjRef1, electricityObjRef1);
		
		Water waterObjRef2 = new Water(30, "Hard");
		Electricity electricityObjRef2 = new Electricity(0.3f);
		WaterPurifier WaterPurifierObj2 = new WaterPurifier();
		WaterPurifierObj2.processWater(waterObjRef2, electricityObjRef2);

	}
}

class Machine
{

}

class WaterPurifier extends Machine // isA
{
	private Brand brand = new Brand("Kent", true, true);
	private SedimentFilter filter = new SedimentFilter(); // hasA

        //producesA    usesA  
	void processWater(Water waterObjRef, Electricity electricityObjRef) {
		String out = "Filtering " + waterObjRef.getQuantity() + " in " + brand.getName() + " brand";

		float billForFiltering = 0;

		billForFiltering = waterObjRef.quantity * electricityObjRef.unitRate;

		System.out.println("Total bill : " + billForFiltering);
	}
}

class Water
{
	int quantity;
	String type;

	public Water(int quantity, String type) {
		this.quantity = quantity;
		this.type = type;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}

class Electricity
{
	public Electricity(float unitRate) {
		this.unitRate = unitRate;
	}

	float unitRate;

	public float getUnitRate() {
		return unitRate;
	}

	public void setUnitRate(float unitRate) {
		this.unitRate = unitRate;
	}

	
}

class Brand
{
	String name;
	boolean rO;
	boolean uV;

	public Brand(String name, boolean rO, boolean uV) {
		this.name = name;
		this.rO = rO;
		this.uV = uV;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean getrO() {
		return rO;
	}

	public void setrO(boolean rO) {
		this.rO = rO;
	}

	public boolean getuV() {
		return uV;
	}

	public void setuV(boolean uV) {
		this.uV = uV;
	}
}

class SedimentFilter
{
	String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}

/*
 * class Bird {
 * 
 * }
 * 
 * class Hen extends Bird // isA relationship
 * {
 * Wings henWingsObj = new Wings(); // hasA relationship
 * Sound henSoundObj = new Sound();
 * FoodType foodObj = new FoodType();
 * 
 * // producesA usesA usesA usesA
 * Egg layEgg(Food food, Water water, Supplement supplement) {
 * Egg eggObj = new Egg();
 * eggObj.setWeight();
 * }
 * }
 */

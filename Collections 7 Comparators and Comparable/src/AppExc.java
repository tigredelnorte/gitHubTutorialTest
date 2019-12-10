import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ReverseBrandNameComparator implements Comparator<Auto> {

	@Override
	public int compare(Auto auto1, Auto auto2) {

		return -auto1.brand.compareTo(auto2.brand);
	}

}
public class AppExc {

	// Array or list of custom class wiht two or more variables to be compared using
	// comparator and comparable

	public static void addCarsToList(List<Auto>cars) {
		cars.add(new Auto("Mercedes", "Maybach", 10));
		cars.add(new Auto("Audi", "TT", 14));
		cars.add(new Auto("BMW", "328", 11));
		cars.add(new Auto("Opel", "Astra", 0));
		cars.add(new Auto("Honda", "Civic", 100));
		cars.add(new Auto("Toyota", "Supra", 102));
		cars.add(new Auto("Ferrari", "Roma", 69));
	}


	public static void main(String[] args) {
		List<Auto> cars = new ArrayList<Auto>();

		addCarsToList(cars);
		
		System.out.println("-----------------NOt---SORTED--------------");
		for (Auto car : cars) {
			System.out.println(car);
		}

		Collections.sort(cars);
		System.out.println("-----BY ID---SORTED---class Auto implements Comparable--");
		for (Auto car : cars) {
			System.out.println(car);
		}
		Collections.sort(cars, new ReverseBrandNameComparator());
		System.out.println("----ReverseBrandName-SORTED---list sorted base on new comparator comparing strings length reversed--");
		for (Auto car : cars) {
			System.out.println(car);

		}
	}
}

class Auto implements Comparable<Auto> {
	String brand;
	String model;
	Integer id;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Auto [brand=" + brand + ", model=" + model + ", id=" + id + "]";
	}

	public Auto(String brand, String model, int id) {
		super();
		this.brand = brand;
		this.model = model;
		this.id = id;
	}

	public Auto() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + id;
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (id != other.id)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public int compareTo(Auto auto) {
		return id.compareTo(auto.id);
	}

}
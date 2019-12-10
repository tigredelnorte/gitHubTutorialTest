import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {

	public static void main(String[] args) {

		 //sort primitives array like int array
        int[] intArr = {5,9,1,10};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
        
        //sorting String array
        String[] strArr = {"A", "C", "B", "Z", "E"};
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        
        //sorting list of objects of Wrapper classes
        List<String> strList = new ArrayList<String>();
        strList.add("A");
        strList.add("C");
        strList.add("B");
        strList.add("Z");
        strList.add("E");
        Collections.sort(strList);
        for(String str: strList) System.out.println(" "+str);
		
		List<String> animals = new ArrayList();
		animals.add("giraffe");
		animals.add("ant");
		animals.add("mangoose");
		animals.add("bear");
		animals.add("frog");
		animals.add("camel");
		animals.add("snake");

		Collections.sort(animals);

		System.out.println(animals);

		for (String animal : animals) {
			System.out.println(animal);
		}

		Collections.sort(animals, new StringLengthComparator());
		System.out.println("------------String.LENGTH-ORDER---------------------------");
		for (String animal : animals) {
			System.out.println(animal);
		}
		Collections.sort(animals, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() < o2.length())
					return 1;
				else if (o1.length() > o2.length())
					return -1;
				else
					return 0;
			}});
		System.out.println("------------Reverse-String.LENGTH-ORDER---------------------------");
		for (String animal : animals) {
			System.out.println(animal);
		}
		Collections.sort(animals, new AlphabeticalComparator());
		System.out.println("---------------ALPHABETICAL-----------------------");
		for (String animal : animals) {
			System.out.println(animal);
		}
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		System.out.println("---------------REVERSE-ALPHABETICAL-----------------------");
		for (String animal : animals) {
			System.out.println(animal);
		}
	}
}

class StringLengthComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		if (o1.length() > o2.length())
			return 1;
		else if (o1.length() < o2.length())
			return -1;
		else
			return 0;
	}
}

class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
}
class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		return -o1.compareTo(o2);
	}
}
class Animal{
	int id;
	String species;
	int age;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", species=" + species + ", age=" + age + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + id;
		result = prime * result + ((species == null) ? 0 : species.hashCode());
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
		Animal other = (Animal) obj;
		if (age != other.age)
			return false;
		if (id != other.id)
			return false;
		if (species == null) {
			if (other.species != null)
				return false;
		} else if (!species.equals(other.species))
			return false;
		return true;
	}
	
	
	
}

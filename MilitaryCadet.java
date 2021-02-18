
public class MilitaryCadet {
	private String name;
	private int age;
	private double weight;
	
	public MilitaryCadet(String name, int age, double weight) {
		this.name = name;
		// age
		try {
			if(age <= 40) {
				this.age = age;
			}
			else {
				throw new InvalidCadetException();
			}
		} catch (InvalidCadetException ie) {
			System.out.println("Cadet is too old.");
		}
		
		// weight
		try {
			if(weight >= 40) {
				this.weight = weight;
			}
			else {
				throw new InvalidCadetException();
			}
		} catch (InvalidCadetException ine) {
			System.out.println("Cadet is underweight.");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		try {
			if(age <= 40) {
				this.age = age;
			}
			else {
				throw new InvalidCadetException();
			}
		} catch (InvalidCadetException ie) {
			System.out.println("Cadet is too old.");
		}
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		try {
			if(weight >= 40) {
				this.weight = weight;
			}
			else {
				throw new InvalidCadetException();
			}
		} catch (InvalidCadetException ine) {
			System.out.println("Cadet is underweight.");
		}
	}
}

import java.io.IOException;

public class Driver {

	public static void main(String[] args) {
		Employee e = new Employee("John", "111111", -5);
		e.setAge(-10);
		
		MilitaryCadet m = new MilitaryCadet("Joe", 50, 100);
		m.setWeight(30);
		
		try {
			new UserDataRead();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		new UserDataRead2();
	}

}

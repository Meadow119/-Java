
public class employeeTest {

	public static void main(String[] args) {
		Employee[] employee = new Employee[3];
		employee[0] = new Employee ("Jason", "Hurst", 8d);
		employee[1] = new Employee ("Hillary", "Duff", 16d);
		employee[2] = new Employee ("Justin", "Timberlake", 20d);
		
		for(int i = 0; i<employee.length; i++) {
			employee[i].display();
		}
	}

}

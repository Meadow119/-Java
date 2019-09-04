
public class Employee {
	private String firstName;
	private String lastName;
	private Double payRate;
	
	
	Employee(){};
	Employee(String firstName, String lastName, Double payRate){
		this.firstName = firstName;
		this.lastName = lastName;
		this.payRate = payRate;
			
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getPayRate() {
		return payRate;
	}
	public void setPayRates(Double payRate) {
		this.payRate = payRate;
	}
	
	public void display(){
		System.out.printf("%s" + "\n" + "%s" + "\n" + "$" + "%.2f" + "\n" + "\n", getFirstName(), getLastName(), getPayRate());
	}
	
}

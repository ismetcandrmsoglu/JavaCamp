package inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		Employee employee = new Employee();
		customer.setFirstName("Berna");
		employee.setLastName("Özgen");
		
		EmployeeManager employeeManager= new EmployeeManager();
		CustomerManager customerManager= new CustomerManager();
		customerManager.List();
		employeeManager.Add();
		employeeManager.BestEmployee();

	}

}

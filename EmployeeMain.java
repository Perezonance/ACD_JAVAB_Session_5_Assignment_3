package assignment_3;

public class EmployeeMain {
	public static void main(String[] args) {
		PermanentEmployee pEmp = new PermanentEmployee();
		TemporaryEmployee tEmp = new TemporaryEmployee();
		
		pEmp.calcSalary();
		pEmp.printLeaveDetails();
		
		System.out.println();
		
		System.out.println(tEmp.availLeave(2, 'p'));
		tEmp.calcSalary();
	}
}

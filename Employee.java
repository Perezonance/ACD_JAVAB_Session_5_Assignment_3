package assignment_3;

public abstract class Employee {
	private int empID, totalLeaves;
	private String empName;
	private double totalSalary;
	
	public abstract void calcBalanceLeaves();
	public abstract boolean availLeave(int noLeaves, char typeLeaves);
	public abstract void calcSalary();
}

package assignment_3;

public class PermanentEmployee extends Employee {
	
	private int paidLeave, sickLeave, casualLeave;
	private double basic, hra = .5 * basic, pfa = .12 * basic;

	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
		paidLeave = 5;
		sickLeave = 6;
		casualLeave = 3;
		basic = 75000;
	}
	
	@Override
	public void calcBalanceLeaves() {
		// TODO Auto-generated method stub
		System.out.println("Paid Leave days left: " + (paidLeave - (6-sickLeave + 3 - casualLeave)) 
				 		+ "\nSick Leave Days Left: " + sickLeave + "\nCasual Leave Days Left: " + casualLeave); 
	}

	@Override
	public boolean availLeave(int noLeaves, char typeLeaves) {
		// TODO Auto-generated method stub
		if(typeLeaves == 'p'){
			return (paidLeave - noLeaves > 0)? true:false;
		}else if(typeLeaves == 's'){
			return (sickLeave - noLeaves > 0)? true:false;
		}else if(typeLeaves == 'c'){
			return (casualLeave - noLeaves > 0)? true:false;
		}else
			return false;
	}

	@Override
	public void calcSalary() {
		// TODO Auto-generated method stub
		System.out.println("Employee's Salary is: " + (basic + hra - pfa));
	}
	
	public void printLeaveDetails(){
		System.out.println("Employee Leaves Available:\nPaid Leave: " + paidLeave + " days remain."
													+ "\nSick Leave: " + sickLeave + " days remain."
													+ "\nCasual Leave: " + casualLeave + " days remain.");
		
	}
	

}

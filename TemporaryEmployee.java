package assignment_3;

public class TemporaryEmployee extends Employee {

	private int paidLeave, sickLeave, casualLeave;
	private double basic, hra = .5 * basic, pfa = .12 * basic;
	
	public TemporaryEmployee() {
		// TODO Auto-generated constructor stub
		paidLeave = 3;
		sickLeave = 4;
		casualLeave = 1;
		basic = 45000;
	}
	
	@Override
	public void calcBalanceLeaves() {
		// TODO Auto-generated method stub
		System.out.println("Paid Leave days left: " + (paidLeave - (4-sickLeave + 1-casualLeave)) 
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

}

public class FTEmp extends EmployeeInfo {
	
	// Unique Attributes
	
	protected double salary;
	
	// Constructors

	public FTEmp() {
		
		super();
		salary = 0;
		
	}
	
	public FTEmp (int eN, String fN, String lN, String g, String l, double dR, double s) {
		
		super(eN, fN, lN, g, l, dR);
		
		if (s < 0) {
			
			salary = 0;
			
		}
		
		else {
			
			salary = s;
			
		}
		
	}
	
	public double calcGrossIncome (FTEmp theEmp) {
		
		double grossIncome = theEmp.salary;
		
		return grossIncome;
		
	}
	
	public double calcNetIncome (FTEmp theEmp) {
		
		double netIncome = this.calcGrossIncome(theEmp) * (1 - theEmp.deductRate);
		return netIncome;
		
	}
	
}

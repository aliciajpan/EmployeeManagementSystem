public class PTEmp extends EmployeeInfo {
	
	// Unique Attributes
	
	protected double hrWage;
	protected double hrWeek;
	protected double wkYear;

	// Constructors
	
	public PTEmp() {

		super();
		hrWage = 0;
		hrWeek = 0;
		wkYear = 0;
		
	}
	
	public PTEmp (int eN, String fN, String lN, String g, String l, double dR, double hW, double hWk, double wY) {
		
		super(eN, fN, lN, g, l, dR);
		
		if (hW < 0) {	
			hrWage = 0;	
		}
		
		else {	
			hrWage = hW;
		}
		
		if (hWk < 0) {	
			hrWeek = 0;	
		}
		
		else {	
			hrWeek = hWk;	
		}
		
		if (wY < 0) {	
			wkYear = 0;	
		}
		
		else {
			wkYear = wY;
			
		}
		
	}
		
	public double calcGrossIncome (PTEmp theEmp) {
		
		double grossIncome = (theEmp.hrWage * theEmp.hrWeek * theEmp.wkYear);
		return grossIncome;
		
	}
		
	public double calcNetIncome (PTEmp theEmp) {
		
		double netIncome = this.calcGrossIncome(theEmp) * (1 - theEmp.deductRate);
		return netIncome;
		
	}

}

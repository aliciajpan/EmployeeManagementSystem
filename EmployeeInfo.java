public class EmployeeInfo {
	
	// Attributes
	
	protected int empNumber;
	protected String firstName;
	protected String lastName;
	protected String gender;
	protected String location;
	protected double deductRate;
	
	// Constructors
	
	public EmployeeInfo() {
		
		empNumber = 0;
		firstName = "FirstName";
		lastName = "LastName";
		gender = "O";
		location = "M";
		deductRate = 0;
		
	}
	
	public EmployeeInfo(int eN, String fN, String lN, String g, String l, double dR) {
		
		if (eN < 0) {
			
			empNumber = 0;
			
		}
		
		else {
			
			empNumber = eN;
			
		}
		
		if (dR < 0) {
			
			deductRate = 0;
			
		}
		
		else {
			
			deductRate = dR;
			
		}
		
		firstName = fN;
		lastName = lN;
		gender = g;
		location = l;
		
	}

}

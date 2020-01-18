import java.util.ArrayList;

public class MyHashTable { // put comments bacc

	private ArrayList<EmployeeInfo>[] buckets;

	public MyHashTable(int howManyBuckets) {

		buckets = new ArrayList[howManyBuckets];

		for (int i = 0; i < howManyBuckets; i++) {
			buckets[i] = new ArrayList();
		}
	}

	public int calcBucket(int studentNumber) {
		return(studentNumber % buckets.length);
	}

	public void addToTable(EmployeeInfo theEmp) { 
		
		if (theEmp == null) {
			
			return;
		}

		int subarraylist = this.calcBucket(theEmp.empNumber);
		buckets[subarraylist].add(theEmp);
	}
	
	//TEST
	
	public EmployeeInfo findEmp (EmployeeInfo theEmp) {
		
		EmployeeInfo thisOne = null;
		
		int compareThis = theEmp.empNumber;
		int subarraylist = this.calcBucket(theEmp.empNumber);
		for (int i = 0; i < buckets[subarraylist].size(); i ++) {
			
			if (compareThis == buckets[subarraylist].get(i).empNumber) {
				
				thisOne = theEmp;
			}
			
		}
		
		return thisOne;
		
	}


	public EmployeeInfo removeFromTable(EmployeeInfo theEmp) {
		
		/*
		
		int compareThis = theEmp.empNumber;
		
		int subarraylist = this.calcBucket(theEmp.empNumber);
		
		for (int i = 0; i < buckets[subarraylist].size(); i++) {
			
			if (compareThis == buckets[subarraylist].get(i).empNumber) {
				
				buckets[subarraylist].remove(theEmp);
				
			}
			
		}
		
		*/
		
		int subarraylist = this.calcBucket(theEmp.empNumber);
		EmployeeInfo empToRemove = this.findEmp(theEmp);
		buckets[subarraylist].remove(empToRemove);
		
		return empToRemove;
		
	}
	
	public EmployeeInfo readFromTable(EmployeeInfo theEmp) {
		
		/*
		
		int compareThis = theEmp.empNumber;
		int subarraylist = this.calcBucket(theEmp.empNumber);
		for (int i = 0; i < buckets[subarraylist].size(); i ++) {
			if (compareThis == buckets[subarraylist].get(i).empNumber) {
				break;
			}
			
		}
		
		*/
		
		EmployeeInfo empToRead = this.findEmp(theEmp);
		
		return empToRead;
		
	}

	public boolean isInTable(EmployeeInfo theEmp) {
		
	    int compareThis = theEmp.empNumber;
		
		int subarraylist = this.calcBucket(theEmp.empNumber);
		
		boolean inTable = false;
		
		for (int i = 0; i < buckets[subarraylist].size(); i++) {
			
			if (buckets[subarraylist].get(i).empNumber == compareThis) {
				
				inTable = true;
				
			}
		}
		
		return inTable;
	}
	
	public void displayTable() {
		
		for (int i = 1; i <= buckets.length; i++) {
			
			System.out.println("Mod" + " " + (i-1) + ":");
			
			for (int x = 0; x < buckets[i-1].size(); x ++) {
				
				System.out.println(buckets[i-1].get(x).empNumber);
				
			}

		}
		
	}

}

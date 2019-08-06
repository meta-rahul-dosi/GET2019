package employee;
/**
 *this class contains the employee data
 */
public class Employee {

	private int employeeID = 0;
	private String employeeName = null;
	private String employeeAddress = null;
	
	/**constructor  to initialize the employee parameters.
	 * @param employeeID
	 * @param employeeName
	 * @param employeeAddress
	 */
	public Employee(int employeeID, String employeeName, String employeeAddress)
	{
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
	}

	@Override
	public boolean equals(Object e)
	{
		return this.employeeID == ((Employee)e).employeeID;
	}
	
	@Override
	public int hashCode() 
	{ 
	   return this.employeeID; 
	} 
	
	@Override
	public String toString() { 
	    return "\nName: '" + this.employeeName + "', ID: '" + this.employeeID + "', address: '" + this.employeeAddress + "'";
	} 
	
	// getters and setters
	
	public int getEmployeeID() {
		return employeeID;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(String employeeAddress) {
		this.employeeAddress = employeeAddress;
	}
}

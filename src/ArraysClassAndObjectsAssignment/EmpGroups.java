package ArraysClassAndObjectsAssignment;

public class EmpGroups {
	

	public static void main(String[] args) {
		
		//creating array to store employee names
		String empName[]= new String[3];
        
		//creating array to store employee Ids
		int empId[] =  new int[3];
		
		
	//creating object to call the values from Employees class and store it in empName and empId array
		Employees emp=new Employees();
		
		//storing values in empName Array
		empName[0]=emp.employeeName1;
		empName[1]=emp.employeeName2;
		empName[2]=emp.employeeName3;
		
		//storing values in empId Array
		empId[0]=emp.employeeId1;
		empId[1]=emp.employeeId2;
		empId[2]=emp.employeeId3;
		
		
		
	/*print each employee's name along with their corresponding ID
	Example:
		• Employee Name: Bharath, Employee ID: 1234    */
		
		System.out.println("Employee Name:"+empName[0]+","+"Employee ID:"+empId[0]);
		System.out.println("Employee Name:"+empName[1]+","+"Employee ID:"+empId[1]);
		System.out.println("Employee Name:"+empName[2]+","+"Employee ID:"+empId[2]);
		
		
		
		

	}

}

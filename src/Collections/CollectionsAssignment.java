package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsAssignment {

	public static void main(String[] args) {
		
	

	//Storing Studentdetails data -- each row into each map collection(as its column name is same for all the 3rows so considering column names as key and data as values)
		
		//storing student1 details
		Map<String,String> stud1Map=new HashMap<String,String>();
		stud1Map.put("Name", "John Doe");
		stud1Map.put("Age", "Twenty");
		stud1Map.put("Gender", "Male");
		stud1Map.put("Roll Number", "SBA12345");
		stud1Map.put("Grade", "A++");
		stud1Map.put("Major", "Computer Science");
		stud1Map.put("GPA", "A3.8");
		stud1Map.put("Email", "john@example.com");
		stud1Map.put("PAN Number", "SDF6543210");
		stud1Map.put("Address", "123 Elm St");
		
		
		        //storing student2 details
				Map<String,String> stud2Map=new HashMap<String,String>();
				stud2Map.put("Name", "Jane Smith");
				stud2Map.put("Age", "Twenty One");
				stud2Map.put("Gender", "Female");
				stud2Map.put("Roll Number", "SBA12346");
				stud2Map.put("Grade", "B+");
				stud2Map.put("Major", "Mathematics");
				stud2Map.put("GPA", "A3.5");
				stud2Map.put("Email", "jane@example.com");
				stud2Map.put("PAN Number", "REW6543211");
				stud2Map.put("Address", "456 Oak St");
				
				
				//storing student3 details
				Map<String,String> stud3Map=new HashMap<String,String>();
				stud3Map.put("Name", "Mike Browne");
				stud3Map.put("Age", "Twenty Two");
				stud3Map.put("Gender", "Male");
				stud3Map.put("Roll Number", "SBA12347");
				stud3Map.put("Grade", "A+");
				stud3Map.put("Major", "Physics");
				stud3Map.put("GPA", "A3.9");
				stud3Map.put("Email", "mike@example.com");
				stud3Map.put("PAN Number", "TYR6543212");
				stud3Map.put("Address", "789 Pine St");
				
	
	//Storing Employeedetails data
				//Storing employee1 details
				Map<String,String> Emp1Map=new HashMap<String,String>();
				Emp1Map.put("Employee ID", "E001");
				Emp1Map.put("Name", "Alice Green");
				Emp1Map.put("Age", "Thirty");
				Emp1Map.put("Gender", "Female");
				Emp1Map.put("Department", "Engineering");
				Emp1Map.put("Position", "Software Engineer");
				Emp1Map.put("Salaryr", "75K Pounds");
				Emp1Map.put("Email", "alice@example.com");
				Emp1Map.put("PAN Number", "SDF6543210");
				
				//Storing employee2 details
				Map<String,String> Emp2Map=new HashMap<String,String>();
				Emp2Map.put("Employee ID", "E002");
				Emp2Map.put("Name", "Bob Johnson");
				Emp2Map.put("Age", "Thirty Five");
				Emp2Map.put("Gender", "Male");
				Emp2Map.put("Department", "Marketing");
				Emp2Map.put("Position", "Marketing Manager");
				Emp2Map.put("Salaryr", "85K Pounds");
				Emp2Map.put("Email", "bob@example.com");
				Emp2Map.put("PAN Number", "REW6543211");
				
				
			   //Storing employee3 details
				Map<String,String> Emp3Map=new HashMap<String,String>();
				Emp3Map.put("Employee ID", "E003");
			    Emp3Map.put("Name", "Carol White");
				Emp3Map.put("Age", "Twenty Eight");
				Emp3Map.put("Gender", "Female");
				Emp3Map.put("Department", "Sales");
				Emp3Map.put("Position", "Sales Executive");
				Emp3Map.put("Salaryr", "65K Pounds");
				Emp3Map.put("Email", "carol@example.com");
				Emp3Map.put("PAN Number", "TYR6543212");
				
				
	//String product details
				//storing product1 details
				Map<String,String> prod1Map=new HashMap<String,String>();
				prod1Map.put("Product ID", "P001");
				prod1Map.put("Name", "Laptop");
				prod1Map.put("Category", "Electronics");
				prod1Map.put("Price", "12K Pounds");
				prod1Map.put("Stock Quantity", "Not Available");
				prod1Map.put("Supplier", "Tech Supplies");
				prod1Map.put("Warranty", "2 years");
				prod1Map.put("Rating", "4.5 Stars");
				prod1Map.put("Manufacturing Date", "Aug 2023");
				prod1Map.put("Expiry Date", "Aug 2028");
				
				Map<String,String> prod2Map=new HashMap<String,String>();
				prod2Map.put("Product ID", "P002");
				prod2Map.put("Name", "Desk Chair");
				prod2Map.put("Category", "Furniture");
				prod2Map.put("Price", "150K Pounds");
				prod2Map.put("Stock Quantity", "Two");
				prod2Map.put("Supplier", "Office Depot");
				prod2Map.put("Warranty", "1 years");
				prod2Map.put("Rating", "4 Stars");
				prod2Map.put("Manufacturing Date", "Sep 2024");
				prod2Map.put("Expiry Date", "N/A");
				
				Map<String,String> prod3Map=new HashMap<String,String>();
				prod3Map.put("Product ID", "P003");
				prod3Map.put("Name", "Coffee Maker");
				prod3Map.put("Category", "Kitchen");
				prod3Map.put("Price", "75 Pounds");
				prod3Map.put("Stock Quantity", "Two Hundred");
				prod3Map.put("Supplier", "KitchenWorld");
				prod3Map.put("Warranty", "6 months");
				prod3Map.put("Rating", "4.2 Stars");
				prod3Map.put("Manufacturing Date", "Jan 2025");
				prod3Map.put("Expiry Date", "Jan 2027");
				
				
	//Stroing all the individual rows data for each testcase(sheet) into one variable(variable refers to table here) using List(bcz Order of Storing : Insertion Order)
				//Storing for student details
				List<Map<String,String>> studentDetails=new ArrayList<Map<String,String>>();
				studentDetails.add(stud1Map);
				studentDetails.add(stud2Map);
				studentDetails.add(stud3Map);
				
				//Storing Employee Details
				List<Map<String,String>> employeeDetails=new ArrayList<Map<String,String>>();
				employeeDetails.add(Emp1Map);
				employeeDetails.add(Emp2Map);
				employeeDetails.add(Emp3Map);
				
				//Storing Product Details
				List<Map<String,String>> productDetails=new ArrayList<Map<String,String>>();
				productDetails.add(prod1Map);
				productDetails.add(prod2Map);
				productDetails.add(prod3Map);
				
				
				//Create Map<String, Map<String,String>> to store all the data
	//Storing or combining all the 3tables/varaible as a one varaible/table to access the data
				Map<String,List<Map<String,String>>> data=new HashMap<String,List<Map<String,String>>>();
				data.put("student data", studentDetails);
				data.put("employee data", employeeDetails);
				data.put("product data", productDetails);
				
				
	//Print the data from Product details > Supplier Name > Office Depot  from the   Map<String, Map<String,String>>
				System.out.println(data.get("product data").get(1).get("Supplier"));
	}

}

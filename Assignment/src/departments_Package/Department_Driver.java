package departments_Package;
// Instances of HR_Department, Tech_Department and Admin_Department will be created in driver main class.
public class Department_Driver {
	
	public static void main(String[] args) {
		/**
		 * SuperDepartment will act as a super class for all the departments.
		 * Each department  will display whether today is a holiday or not with the help of the Super Department.
		
		*/
	
		Admin_Department AdminObj = new Admin_Department(); 		//Admin_Department class object
		HR_Department HRObj = new HR_Department(); 			//HR_Department class object
		Tech_Department TechObj = new Tech_Department();	//Tech_Department class object
		
		// Admin_Department method invocations
		System.out.println(AdminObj.departmentName());
		System.out.println(AdminObj.getTodaysWork());
		System.out.println(AdminObj.getWorkDeadline());
		// SuperDepartment method invocations
		System.out.println(AdminObj.isTodayAHoliday());
		
		System.out.println("");
		System.out.println("");
		
		// HR_Department method invocations
		System.out.println(HRObj.departmentName());
		System.out.println(HRObj.doActivity());
		System.out.println(HRObj.getTodaysWork());
		System.out.println(HRObj.getWorkDeadline());
		// SuperDepartment method invocations
		System.out.println(HRObj.isTodayAHoliday());
		
		System.out.println("");
		System.out.println("");
		
		// Tech_Department method invocations
		System.out.println(TechObj.departmentName());
		System.out.println(TechObj.getTodaysWork());
		System.out.println(TechObj.getWorkDeadline());
		System.out.println(TechObj.getTechStackInformation());
		// SuperDepartment method invocations
		System.out.println(TechObj.isTodayAHoliday());
		
		
		System.out.println("");
		System.out.println("");
		System.out.println("End of program");
	}

}


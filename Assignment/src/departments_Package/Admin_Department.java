package departments_Package;
//Admin_Department class will extend Super_Department class.
public class Admin_Department extends Super_Department {

	/**
	  Method overriding
	 */
	public String departmentName () {
		return "Welcome to Admin Department";
	}
	public String getTodaysWork () {
		return "Complete your documents Submission";
	}
	public String getWorkDeadline () {
		return "Complete by EOD";
	}
}
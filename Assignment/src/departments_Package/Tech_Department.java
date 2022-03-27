package departments_Package;
// Tech_Department class will extend from Super_Department.
public class Tech_Department extends Super_Department {
	/**
	 Method overriding
	 */
	public String departmentName () {
		return "Welcome to Tech Department";
	}
	public String getTodaysWork () {
		return "Complete coding of module 1";
	}
	public String getWorkDeadline () {
		return "Complete by EOD";
	}
	// Local method
	public String getTechStackInformation () {
		return "core Java";
	}
}
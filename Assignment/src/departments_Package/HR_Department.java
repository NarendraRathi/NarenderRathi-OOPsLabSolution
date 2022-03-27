package departments_Package;
// HR_Department class will extend Super_Department class
public class HR_Department extends Super_Department {
	/**
	  Method overriding
	 */
	public String departmentName () {
		return "Welcome to HR Department";
	}
	public String getTodaysWork () {
		return "Fill today’s timesheet and mark your attendance";
	}
	public String getWorkDeadline () {
		return "Complete by EOD";
	}
	// local method
	public String doActivity () {
		return "team Lunch";
	}
}
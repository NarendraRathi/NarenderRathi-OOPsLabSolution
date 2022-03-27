package departments_Package;

// Super_Department class is the superclass and all other departments will extend it.

public class Super_Department {
	// Below are the super class methods which will be overridden.
	public String departmentName () {
		return "Welcome to Super Department";
	}

	public String getTodaysWork () {
		return "No Work as of now";
	}

	public String getWorkDeadline () {
		return "Nil";
	}

	public String isTodayAHoliday () {
	 // super class method which will not be overridden.
		return "Today is not a holiday";
	}

}

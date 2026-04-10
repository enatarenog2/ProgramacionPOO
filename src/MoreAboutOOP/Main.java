package MoreAboutOOP;

public class Main {

	public static void main(String[] args) {
		 // Objects to Employee class
	    // First object - setting values using constructor
	    Encapsulation emp = new Encapsulation("Robert", "EMP001", 75450.00);

	    // Printing data
	    System.out.println("Employee (Intial Values):");
	    System.out.println(emp.getEmp_id() + " , " + emp.getEmp_name() + " , " + emp.getNet_salary());

	    // Updating values using setter methods
	    emp.setEmp_name("Riyan");
	    emp.setEmp_id("EMP002");
	    emp.setNet_salary(90500.00);

	    // Printing data
	    System.out.println("Employee (Updated Values):");
	    System.out.println(emp.getEmp_id() + " , " + emp.getEmp_name() + " , " + emp.getNet_salary());

	}

}

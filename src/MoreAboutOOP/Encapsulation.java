package MoreAboutOOP;

public class Encapsulation {

	  private String emp_name;
	  private String emp_id;
	  private double net_salary;
	  
	  //constructor
	  public Encapsulation(String emp_name, String emp_id, double net_salary) {
		super();
		this.emp_name = emp_name;
		this.emp_id = emp_id;
		this.net_salary = net_salary;
	  }
//metodos getters
	  public String getEmp_name() {
		  return emp_name;
	  }

	  public String getEmp_id() {
		  return emp_id;
	  }

	  public double getNet_salary() {
		  return net_salary;
	  }

	  //metodos setters
	  public void setEmp_name(String emp_name) {
		  this.emp_name = emp_name;
	  }
	  
	  public void setEmp_id(String emp_id) {
		  this.emp_id = emp_id;
	  }
	  
	  public void setNet_salary(double net_salary) {
		  this.net_salary = net_salary;
	  }

}

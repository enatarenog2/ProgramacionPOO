package MoreAboutOOP;

public class Inheritance {
	
	public static void main(String[] args) {
		Car car = new Car(); 

		car.setLicensePlate("123"); 
		car.updateLicensePlate("abc"); 

		System.out.println("matrícula: " 
		        + car.getLicensePlate());
		
	}
	
	
	
	public static class Vehicle {

	    String licensePlate = null;

	    public void setLicensePlate(String licensePlate) {
	        this.licensePlate = licensePlate;
	    }

	    public String getLicensePlate() {
	        return licensePlate;
	    }
	}
	
	public static class Car extends Vehicle {

	    protected String licensePlate = null;

	    @Override
	    public void setLicensePlate(String license) {
	        super.setLicensePlate(license);
	    }

	    @Override
	    public String getLicensePlate() {
	        return super.getLicensePlate();
	    }

	    public void updateLicensePlate(String license){
	        this.licensePlate = license;
	    }
	}

}

package learnthebasics;

public class Car {
	public String marca = null;
    public String modelo = null;
    public String color = null;
    
    
	public Car(String marca, String modelo, String color) {
		super();
		this.marca = "Toyota";
		this.modelo = "Tacoma";
		this.color = "negro";
	}
	
	public void setColor(String newColor) {
        this.color = newColor;
    }

}

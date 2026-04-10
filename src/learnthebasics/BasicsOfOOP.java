package learnthebasics;

public class BasicsOfOOP {

	public static void main(String[] args) {
	
		Car coche1 = new Car("Toyota","Scion","Amarillo"); 
		Car coche2 = new Car("Nissan","Frontier","Negro");  
		Car coche3 = new Car("Toyota","Tacoma","Amarillo"); 

		coche1.setColor("rojo"); 
		coche2.setColor("verde"); 
		coche3.setColor("azul");
		
		System.out.println(coche1);
		System.out.println(coche2);
		System.out.println(coche3);

	}

}

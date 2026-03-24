package learnthebasics;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Conversión de entero a double
		 // create int type variable

	    int num = 50;

	    System.out.println("The integer value: " + num);

	    // convert into double type

	    double data = num;

	    System.out.println("The double value: " + data);

	    
	  //Conversión de un número Double a un número Int.
	 // create double type variable

	    double num2 = 50.55;

	    System.out.println("The double value: " + num2);

	    // convert into int type

	    int data2 = (int)num2;

	    System.out.println("The integer value: " + data2);

	    
	    //Conversión de entero a String
	    // create int type variable

	    int num3 = 50;

	    System.out.println("The integer value is: " + num3);

	    // convert int to string type

	    String data3 = String.valueOf(num3);

	    System.out.println("The string value is: " + data3);
	    
	    
	    //Convertir String a entero
	    // create string type variable

	    String data4 = "50";

	    System.out.println("The string value is: " + data4);

	    // convert string variable to int

	    int num4 = Integer.parseInt(data4);

	    System.out.println("The integer value is: " + num4);
	  }
	

}

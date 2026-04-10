package BasicsOOP;

public class ExceptionHandling {

	public static void main(String[] args) {
	
		
		try {
			int myInt = Integer.parseInt("pants");
		
		}
		catch(Exception e) {
			System.out.println("No se puede hacer eso");
			
		}
		finally {
			System.out.println("bloque finally");
		}
		System.out.println("Fin");

	}

}

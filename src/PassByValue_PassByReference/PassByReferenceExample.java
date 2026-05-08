package PassByValue_PassByReference;

public class PassByReferenceExample {

	
	public static class Persona {

	    String nombre;

	    public Persona(String nombre) {
	        this.nombre = nombre;
	    }
	}
	
	public class EjemploObjetos {

	    public static void main(String[] args) {

	        Persona p1 = new Persona("Carlos");

	        System.out.println("Antes del metodo:");
	        System.out.println(p1.nombre);

	        cambiarNombre(p1);

	        System.out.println("\nDespues del metodo:");
	        System.out.println(p1.nombre);
	    }

	    public static void cambiarNombre(Persona p) {

	        p.nombre = "Juan";

	        System.out.println("\nDentro del metodo:");
	        System.out.println(p.nombre);
	    }
	}
}

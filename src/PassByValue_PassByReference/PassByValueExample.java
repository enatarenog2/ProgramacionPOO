package PassByValue_PassByReference;

public class PassByValueExample {
	
	public static void main(String[] args) {

        int x = 5;
        int y = 10;

        System.out.println("Antes del metodo:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        modificar(x, y);

        System.out.println("\nDespues del metodo:");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

    public static void modificar(int a, int b) {

        a = 100;
        b = 200;

        System.out.println("\nDentro del metodo:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

	
}

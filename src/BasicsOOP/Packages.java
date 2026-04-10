package BasicsOOP;

public class Packages {

	public static void main(String[] args) {
		Package paquete = Package.class.getPackage();
		
		System.out.println("Nombre: " + paquete.getName());
        System.out.println("Versión implementación: " + paquete.getImplementationVersion());
        System.out.println("Proveedor: " + paquete.getImplementationVendor());

	}

}

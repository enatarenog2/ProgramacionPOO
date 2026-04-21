package MoreAboutOOP;

//Ejemplo de Bloque inicializador de instancia
public class InitializerBlock {
	
	{
        System.out.println("Instance initializer block 1");
    }
    
    {
        System.out.println("Instance initializer block 2");
    }
    
    public InitializerBlock() {
        System.out.println("Class constructor");
    }

    public static void main(String[] args) {
        InitializerBlock iib = new InitializerBlock();
        System.out.println("Main Method");
    }
	
}

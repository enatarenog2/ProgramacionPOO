package MoreAboutOOP;

 enum Nivel {
    ALTO,
    MEDIO,
    BAJO
}

public class Enums {
	public static void main(String[] args) {

        Nivel nivel = Nivel.ALTO;

        System.out.println(nivel);
        

        //uso en if
        
        Nivel nivel1 = Nivel.MEDIO;
        if (nivel1 == Nivel.ALTO) {
            System.out.println("Es alto");
        } else if (nivel1 == Nivel.MEDIO) {
            System.out.println("Es medio");
        } else {
            System.out.println("Es bajo");
        }
        
        //uso en switch
        
        Nivel nivel2 = Nivel.BAJO;

        switch (nivel2) {
            case ALTO:
                System.out.println("Nivel alto");
                break;
            case MEDIO:
                System.out.println("Nivel medio");
                break;
            case BAJO:
                System.out.println("Nivel bajo");
                break;
        }
        
        
    }

}

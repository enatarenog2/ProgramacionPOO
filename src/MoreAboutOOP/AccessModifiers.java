package MoreAboutOOP;

public class AccessModifiers {
	
	
	 public static void main(String[] args) {
 		
 		ClockReader reader = new ClockReader();

         System.out.println("Tiempo: " + reader.readClock());
         Clock clock = new Clock();
         
         
         PrivatedClock cl = new PrivatedClock();

         // Acceso mediante getter
         System.out.println("Tiempo: " + cl.getPrivatedTime());

         // Modificar mediante setter
         cl.setPrivatedTime(5000);

         System.out.println("Nuevo tiempo: " + cl.getPrivatedTime());
         
         
         
         SmartClock smart = new SmartClock();

         System.out.println("Tiempo en segundos: "
                 + smart.getTimeInSeconds());
 		
 	}
	
	
	
	
	//Publico
	static class Clock {
        public long time = 0;
    }

    
    static class ClockReader {

        Clock clock = new Clock();

        public long readClock() {
            return clock.time;
        }
    }

    //privado

    static class PrivatedClock {

        // ATRIBUTO PRIVADO
        private long privatedtime = 1000;

        // MÉTODO GET
        public long getPrivatedTime() {
            return privatedtime;
        }

        // MÉTODO SET
        public void setPrivatedTime(long time) {
            this.privatedtime = time;
        }
   
    }
    
    
    //Protegido
    
    
    static class ProtectedClock {
        protected long protectedtime = 3000;
    }


    static class SmartClock extends ProtectedClock {

        public long getTimeInSeconds() {
            return this.protectedtime / 1000;
        }
    }
    
    
}

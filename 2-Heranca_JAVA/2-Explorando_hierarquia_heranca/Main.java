class Externa {  
   void getPosClasse () {
       System.out.println( "Externa" );
   }
    class Intermediaria {  
        void getPosClasse () {
            System.out.println( "Intermediaria" );
        }
        class Interna {  
            void getPosClasse () {
                System.out.println( "Interna" );
            }
        }
    }
    class IntermediariaEstendida extends Intermediaria {
        void getPosClasse () {
            super.getPosClasse();
            System.out.println( "Intermediaria Estendida" );
        }
    }
}
public class Main {
    public static void main ( String args [ ] ) {
        Externa.IntermediariaEstendida in = new Externa().new IntermediariaEstendida();
        in.getPosClasse();
    }    
}
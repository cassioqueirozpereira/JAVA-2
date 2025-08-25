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
}
class NaoAninhada extends Externa.Intermediaria.Interna {
    public NaoAninhada ( ) {
        new Externa().new Intermediaria().super();
    }
    void getPosClasse () {
        super.getPosClasse();
        System.out.println( "Intermediaria Estendida" );
    }
}
public class Principa {
    public static void main ( String args [ ] ) {
        NaoAninhada na = new NaoAninhada ();
        na.getPosClasse();
    }    
}
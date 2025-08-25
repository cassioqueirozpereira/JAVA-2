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
public class Principal {
    public static void main ( String args [ ] ) {
        Externa.Intermediaria.Interna in = new Externa().new Intermediaria().new Interna();
        in.getPosClasse();
    }    
} 
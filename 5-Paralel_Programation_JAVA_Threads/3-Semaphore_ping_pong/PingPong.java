import java.util.concurrent.Semaphore;

public class PingPong {
  //Métodos
  public PingPong ( int tamanho_partida ) {
	 // s1 começa com 1 permissão para que Ping comece primeiro.
	 // s2 começa com 0 permissões, forçando Pong a esperar.
	 final Semaphore s1 = new Semaphore(1);
	 final Semaphore s2 = new Semaphore(0);
	 
	 final Controle contador = new Controle ( tamanho_partida );
	 final Ping ping = new Ping ( s1 , s2 , contador );
   	 final Pong pong = new Pong ( s1 , s2 , contador );
	 
	 new Thread ( ping, "Ping" ).start ();
	 new Thread ( pong, "Pong" ).start ();
  }   
}

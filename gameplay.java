import java.io.IOException;

public class gameplay {

    public static String nombreJugador;


    public gameplay(String jugador){
        gameplay.nombreJugador = jugador;        
    }


    public void startGame() throws InterruptedException, IOException{
        
        menu myMenu= new menu();

        myMenu.setActiveMenu(1);
        myMenu.printMenu();
    }

}

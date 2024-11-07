package TerminalHeroquest.game;
import java.io.IOException;


public class gameplay {

    public static String playerName;
    public static menu myMenu= new menu();
    
    


    public gameplay(String jugador){
        gameplay.playerName = jugador;
        
    }


    public void initGame() throws InterruptedException, IOException{
    	
    	myMenu.setActiveMenu(1);   	
    	int opcion = myMenu.printMenu();
    	
    	switch(opcion) {
    	case 1://New game
    		break;
    	case 2://Load Game
    		break;
    	case 3://Help
    		break;
    	case 4://Exit
    		System.out.println("\nSi te vas será porque eres un cobarde.. ¡Adiós!");
    		System.exit(0);
    		break;
    	}
    	
    }
    
    public void startGame() throws InterruptedException, IOException{
               

    }

}
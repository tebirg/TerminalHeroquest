package TerminalHeroquest.game;

import java.io.IOException;

public class main {

	
    public static void main(String[] args) throws IOException, InterruptedException {

        switch (args.length) {
            case 1 -> {

                verificaciones();
                utils.executeCommand("cls");
                printGameLogo();

                String jugador=args[0];
                gameplay myGame = new gameplay(jugador);
                myGame.initGame();
            }

            default -> {
                System.out.println("Al menos has de introducir tu nombre como primer prámetro.\n ¡Querémos conocerte mejor valiente guerrero!");
                return;
            }
        }
    }

    private static void printGameLogo(){


        System.out.println ("\n");
        System.out.println ("\n");
        System.out.println (constants.AMARILLO + "#>The tErMinAl rOl gaMe" + constants.RESET); 

        System.out.println (constants.ROJO+"-------------------------------------------------------------------------------------    ");
        System.out.println (constants.ROJO+"|"+constants.AMARILLO+"    █    █▄    ▄█████▄  ████████ ██████▄ ██████▄   ▄   ▄   ▄██████   ████          "+constants.ROJO+"| ");
        System.out.println (constants.ROJO+"|"+constants.AMARILLO+"   ██    ██    ██   ██   ██   ██ ██   ██ ██   ██  ██   ██  ██  ███  ██ ██ ▀██████▄ "+constants.ROJO+"| ");
        System.out.println (constants.ROJO+"|"+constants.AMARILLO+"   ██    ██    ██   █▀   ██   ██ ██   ██ ██   ██  ██   ██  ██  █▀   ██ █▀   ▀██▀██ "+constants.ROJO+"| ");
        System.out.println (constants.ROJO+"|"+constants.VERDE+ "  ▄██▄▄▄▄██▄▄ ▄██▄▄▄    ▄██▄▄▄█▀ ██   ██ ██   ██  ██   ██  ██▄▄     ██       ██  ▀ "+constants.ROJO+"| ");
        System.out.println (constants.ROJO+"|"+constants.VERDE+ " ▀▀██▀▀▀▀██▀  ▀██▀▀▀    ▀██▀▀▀▀▀ ██   ██ ██   ██  ██   ██ ▀██▀▀    ▀█████    ██    "+constants.ROJO+"| ");
        System.out.println (constants.ROJO+"|"+constants.VERDE+ "   ██    ██    ██   █▄ ▀████████ ██   ██ ██ █ ██  ██   ██  ██  █▄      ██    ██    "+constants.ROJO+"| ");
        System.out.println (constants.ROJO+"|"+constants.VERDE+ "   ██    ██    ██   ██   ██   ██ ██   ██ ██  ███  ██   ██  ██  ███ ▄█  ██    ██    "+constants.ROJO+"| ");
        System.out.println (constants.ROJO+"|"+constants.AMARILLO+"   ██    █▀    ███████   ██   ██ ▀████▀  ▀██████ ▄███████▀ ███████▄██████▀ ▄████▀  "+constants.ROJO+"| ");
        
        System.out.println (constants.ROJO+"-------------------------------------------------------------------------------------    ");
        System.out.println (constants.ROJO+"|"+constants.RESET + constants.NEGRITA+constants.AZUL+"           ©Esteban Rodriguez" + constants.CYAN + constants.NEGRITA + "                 https://github.com/tebirg            "
        +constants.ROJO + "| " + constants.RESET);
        System.out.println (constants.ROJO+"-------------------------------------------------------------------------------------    ");
        System.out.println ("\n");
    }

    
    private static void verificaciones(){

        try {
            // Verifica si estamos en un sistema basado en Unix (Linux/macOS)
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            	//Ejecuta linux
            	//utils.executeCommand("resize -s 40 120");
            } else {
                // Para sistemas Windows
            }
        } catch (Exception e) {
        }
    }
}


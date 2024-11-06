import java.io.IOException;

public class main {


    public static void main(String[] args) throws IOException, InterruptedException {

        switch (args.length) {
            case 1 -> {

                ProcessBuilder pb = new ProcessBuilder();
                pb.command("clear");
                pb.inheritIO();  
                pb.start().waitFor(); 

                verificaciones();

                printGameLogo();

                String jugador=args[0];
                gameplay myGame = new gameplay(jugador);
                myGame.startGame();
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
                // Utiliza ProcessBuilder para ejecutar el comando "clear"
                ProcessBuilder pb = new ProcessBuilder("clear");
                pb.inheritIO();  // Esto hará que la salida del proceso sea heredada por la consola actual
                pb.start().waitFor(); // Inicia el proceso y espera a que termine
            } else {
                // Para sistemas Windows, se puede usar el comando "cls"
                throw new Exception("Operating System not ready for this. ");
            }
        } catch (Exception e) {
        }


    }
}

package TerminalHeroquest.game;

public class utils {
	
	
	public static void executeCommand(String comando) {
		
        ProcessBuilder pb = new ProcessBuilder();        

        String comand;
        
        try {
            // Verifica si estamos en un sistema basado en Unix (Linux/macOS)
            String os = System.getProperty("os.name").toLowerCase();

            if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
                // Utiliza ProcessBuilder para ejecutar el comando "clear"
            	comand = comando;
            	pb.command(comand);
                pb.inheritIO();  // Esto hará que la salida del proceso sea heredada por la consola actual
                pb.start().waitFor(); // Inicia el proceso y espera a que termine
            } else {
                // Para sistemas Windows, se puede usar el comando "cls"
            	comand = translate(comando);
            	pb.command(comand);
                //throw new Exception("Operating System not ready for this. ");
            }
        } catch (Exception e) {
        }
		
	}
	
	
	private static String translate(String comando) {
		
		String comand="";
		
		switch(comando) {
			case "clear": comand="cls";
			break;
			default:break;
		}
		
		return(comand);
		
	}

}

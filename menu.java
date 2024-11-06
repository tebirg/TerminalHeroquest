

//This class show the diferents menus for the game returning the selecction.

import java.io.IOException;
import java.util.Scanner;

public class menu {


    private int selecction;
    private int active_menu;



    public menu(){

        this.selecction=0;
        this.active_menu=0;
    }


    public void setActiveMenu( int selectMenu){
        active_menu=selectMenu;
    }


    //***** Imprime los diferentes menus ******/
    public int printMenu() throws InterruptedException, IOException{        

        ProcessBuilder pb = new ProcessBuilder();


        switch(this.active_menu){

            /* Primer menú inicial */
            case 1 -> {
                menuInicial();
            }
            /* Menu de partida */
            case 2 -> {
                menuSeleccionReto();
            }
            /* Menu de partida */
            case 3 -> {
                menuPartida();
            }
            default -> {
            }
        }

        pb.command("clear");
        pb.inheritIO();  
        pb.start().waitFor();
        return this.selecction;

    }

    private void menuInicial(){
        
        boolean correctOption=false;

        // Bucle para mostrar el menú y validar la opción
        try (Scanner scanner = new Scanner(System.in)) {
            // Bucle para mostrar el menú y validar la opción
            do {
                // Mostrar las this.selecctiones del menú
                System.out.println(constants.BLANCO + "1. Nueva partida" + constants.RESET);
                System.out.println(constants.BLANCO + "2. Cargar partida" + constants.RESET);
                System.out.println(constants.BLANCO + "3. Ayuda" + constants.RESET);
                System.out.println(constants.BLANCO + "4. Salir\n" + constants.RESET);
                
                // Verificar que la entrada es un número entero
                if (scanner.hasNextInt()) {
                    this.selecction = scanner.nextInt(); // Leer la opción del usuario
                    
                    // Verificar si la opción es válida
                    if (this.selecction < 1 || this.selecction > 4) {
                        System.out.println("¡Opción inválida! Por favor, elige una opción entre 1 y 4.\n");
                    } else {
                        correctOption=true;
                    }
                } else {
                    // Si la entrada no es un número entero
                    System.out.println("¡Entrada inválida! Por favor, introduce un número entero.\n");
                    scanner.next(); // Limpiar el buffer para evitar bucles infinitos
                }
                
            } while (!correctOption); // Continuar hasta que el usuario elija opcion correcta
        }
        catch(Exception e){
            System.out.println("Error grave de ejecución. No es posible cargar el menú de opciones.\n");
        } 
    }


    private void menuPartida(){
        
        boolean correctOption=false;

        // Bucle para mostrar el menú y validar la opción
        try (Scanner scanner = new Scanner(System.in)) {
            // Bucle para mostrar el menú y validar la opción
            do {
                // Mostrar las this.selecctiones del menú
                System.out.println(constants.MAGENTA + "¿Que deseas hacer?" + constants.RESET);
                System.out.println(constants.MAGENTA + "____________________________" + constants.RESET);
                System.out.println(constants.MAGENTA + "1. Buscar puertas secretas" + constants.RESET);
                System.out.println(constants.MAGENTA + "2. Buscar trampas" + constants.RESET);
                System.out.println(constants.MAGENTA + "3. Buscar tesoros" + constants.RESET);
                System.out.println(constants.MAGENTA + "4. Moverte" + constants.RESET);
                System.out.println(constants.MAGENTA + "5. Atacar" + constants.RESET);
                System.out.println(constants.MAGENTA + "6. Defenderte" + constants.RESET);
                System.out.println(constants.MAGENTA + "7. Salvar partida" + constants.RESET);
                System.out.println(constants.MAGENTA + "8. Texto de misión" + constants.RESET);
                System.out.println(constants.MAGENTA + "9. Salir\n" + constants.RESET);
                
                
                // Verificar que la entrada es un número entero
                if (scanner.hasNextInt()) {
                    this.selecction = scanner.nextInt(); // Leer la opción del usuario
                    
                    // Verificar si la opción es válida
                    if (this.selecction < 1 || this.selecction > 9) {
                        System.out.println("¡Opción inválida! Por favor, elige una opción entre 1 y 9.\n");
                    } else {
                        correctOption=true;
                    }
                } else {
                    // Si la entrada no es un número entero
                    System.out.println("¡Entrada inválida! Por favor, introduce un número entero.\n");
                    scanner.next(); // Limpiar el buffer para evitar bucles infinitos
                }
                
            } while (!correctOption); // Continuar hasta que el usuario elija opcion correcta
        }
        catch(Exception e){
            System.out.println("Error grave de ejecución. No es posible cargar el menú de opciones.\n");
        } 
    }


    private void menuSeleccionReto(){
        
        boolean correctOption=false;

        // Bucle para mostrar el menú y validar la opción
        try (Scanner scanner = new Scanner(System.in)) {
            // Bucle para mostrar el menú y validar la opción
            do {
                //Habrá que cargar los retos del folder por defecto.
                System.out.println("Elige tu aventura " + gameplay.nombreJugador);
                System.out.println("____________________________");
                System.out.println("1. La furia de ragnar\n");
   
                
                
                // Verificar que la entrada es un número entero
                if (scanner.hasNextInt()) {
                    this.selecction = scanner.nextInt(); // Leer la opción del usuario
                    
                    // Verificar si la opción es válida
                    if (this.selecction < 1 || this.selecction > 1) {
                        System.out.println("¡Opción inválida! Por favor, elige bien.\n");
                    } else {
                        correctOption=true;
                    }
                } else {
                    // Si la entrada no es un número entero
                    System.out.println("¡Entrada inválida! Por favor, introduce un número entero.\n");
                    scanner.next(); // Limpiar el buffer para evitar bucles infinitos
                }
                
            } while (!correctOption); // Continuar hasta que el usuario elija opcion correcta
        }
        catch(Exception e){
            System.out.println("Error grave de ejecución. No es posible cargar el menú de opciones.\n");
        } 
    }



}

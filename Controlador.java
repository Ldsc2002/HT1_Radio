/********************************************************
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Profesor: Moises Gonzales
Controlador.java
Autores: 
-Luis Santos: 20226
-Diego Cordova: 20212
Última fecha de modificaión: 2021-01-16

Clase controlador
Driver program
********************************************************/

// Clase Controlador
public class Controlador {

    //Atribnutos
    private static Radio rad = new Radio(); // Instancia de Clase Radio
    private static Vista v = new Vista(); // Instancia de clase Vista

    // Inicio del programa
    public static void main(String[] args) {
        
        boolean menu_p = true; //
        v.hola();
        int opcion;
        
        while (menu_p) {

            opcion = v.input(v.menuPrincipal(), 6); // Se imprime el menu principal y se le pide al usuario que escoja una opcion

            // Encender/Apagar
            if (opcion == 1){
                //TODO

            // Am/Fm
            } else if (opcion == 2){
                //TODO

            // Guardar
            } else if (opcion == 3){
                //TODO

            // Seleccionar
            } else if (opcion == 4){
                //TODO

            // Avanzar
            } else if (opcion == 5){
                //TODO

            // Salir
            } else if (opcion == 6){
                menu_p = false;
            }
        }
        v.bye(); // Mensaje de Despedida
    }
}

/********************************************************
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Profesor: Moises Gonzales
Controlador.java
Autores: 
-Luis Santos: 20226
-Diego Cordova: 20212
Última fecha de modificaión: 2021-01-20

Clase controlador
Driver program
********************************************************/

// Clase Controlador
public class Controlador {

    //Atribnutos
    private static Radio rad = new Radio(); // Instancia de Clase Radio
    private static Vista v = new Vista(); // Instancia de clase Vista
    private static double estacionActual = 0;
    private static boolean estado;
    // Inicio del programa
    public static void main(String[] args) {
        
        boolean menu_p = true; //
        v.hola();
        int opcion;
        
        while (menu_p) {

            opcion = v.input(v.menuPrincipal(), 6); // Se imprime el menu principal y se le pide al usuario que escoja una opcion

            // Encender/Apagar
            if (opcion == 1){
                estado = rad.encenderApagar();
                v.encenderApagar(estado);

            } else if (opcion != 1 && estado && opcion != 6) {
                // Am/Fm
                if (opcion == 2){
                    v.amFm(rad.amFm());

                // Guardar
                } else if (opcion == 3){
                    v.guardar(rad.guardar(v.input(v.guardar_menu(), 12)));

                // Seleccionar
                } else if (opcion == 4){
                    v.seleccionar(rad.seleccionar(v.input(v.seleccionar_menu(), 12)));

                // Avanzar
                } else if (opcion == 5){
                    estacionActual = rad.avanzar();
                    v.avanzar(estacionActual);
                }

            // salir
            } else if ( opcion == 6){
                menu_p = false;
            
            // Si el usuario quiere utilizar funciones de la radio y este esta apagado
            } else if (opcion !=1 && estado == false && opcion != 6){
                v.apagado();
            }
        }
        v.bye(); // Mensaje de Despedida
    }
}

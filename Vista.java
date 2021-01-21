/********************************************************
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Profesor: Moises Gonzales
Vista.java
Autores: 
-Luis Santos: 20226
-Diego Cordova: 20212
Última fecha de modificaión: 2021-01-21

Clase Vista
Clase que interactua con el usuario
********************************************************/

import java.util.Scanner; // Se importa la clase Scanner

// Clase vista
public class Vista {

    // Atributos
    private Scanner scan;

    // Constructor
    public Vista(){
        scan = new Scanner(System.in);
    }

    // Metodos

    // Metodo que imprime un dato
    private void print(Object o){
        System.out.println(o);
    }
    
     // Metodo que imporime un linea (Estetica)
     private void line() {
        print("\n******************************************************************************************");
    }

    // Mensaje de despedida
    public void bye(){
        line();
        print("\nGracias por utilizar la radio UVG!!!\n\nRecuerda que seguimos en pandemia\nUsa mascarilla y lavate las manos estimado conciudadano :)");
        line();
    }

    // Mensaje de bienvenida
    public void hola() {
        line();
        print("Bienvenido a la Radio UVG!!!");
    }

    /* Método que enseña un menú al usuario, pide un input
       y aplica programacion defensiva tomando en cuebnta el tamaño del menú y el tipo de dato requerido
       param: String menu, menu textual
       param: int Size, numero de opciones del menu, minimo 1
    */
    public int input(String menu, int size){

        line();
        print(menu);
        
        while (true) { //Se repite hasta que se logre el return

            try { 

              int opcion = Integer.parseInt(scan.next());

              if (opcion > 0 && opcion < (size + 1)) {

                return opcion; //Devuelve la selección del usuario

              } else {

                throw new NumberFormatException();
              }

            } catch (NumberFormatException e) {

                print("\nERROR: Escoja una opcion valida\n");
            }
        }
    }

    // Metodo que devuelve el menu principal de la radio
    public String menuPrincipal(){

        String temp;
        temp = "\n-----Seleccione una opcion-----";
        temp += "\n1. Encender/Apagar";
        temp += "\n2. Cambiar Am/Fm";
        temp += "\n3. guardar estacion";
        temp += "\n4. Seleccionar emisora guardada";
        temp += "\n5. Avanzar";
        temp += "\n6. Salir\n\n";
        return temp;
    }

    // Imprime el comportamiento del  radio cuando se enciende o apaga
    public void encenderApagar(boolean estado){
        String temp;

        // Si elradio esta encendido
        if (estado){
            temp = "Encendido";

        // Si el radio esta apagado
        } else {
            temp = "Apagado";
        }

        line();
        print("El radio ahora esta " + temp);
    }

    // imprime el comportamiento del radio cuando se cambia de am,fm
    public void amFm(boolean emisora){
        String temp;

        // Si el radio esta en Am
        if (emisora){
            temp = "Am";

        // Si el radio esta en Fm
        } else {
            temp = "Fm";
        }

        line();
        print("Ha cambiado a radio " + temp);
    }

    // devuelve representacion grafica de los botones (estetica)
    private String boton(){
        return "\n\n[1] [2] [3] [4] [5] [6] [7] [8] [9] [10] [11] [12]\n";
    }

    // devuelve el menu de seleccionar estacion
    public String seleccionar_menu(){
        return "\nSeleccione un boton para sintonizar la estacion correspondiente" + boton();
    }

    // devueve el menu de guardar estacion
    public String guardar_menu(){
        return "En que boton guardara la estacion?" + boton();
    }

    // Imprime el comportamiento del radio cuando se guarda una estacion
    public void guardar(String estacion){
        line();
        print("Se ha guardado la estacion: " + estacion);
    }

    // imprime el comportamiento del radio cuando se selecciona una estacion
    public void seleccionar(String estacion){        
        line();

        // Si no hay estacion guardada en el boton seleccionado
        if (estacion.equals("")){
            print("El boton seleccionado no contiene ninguna estacion guardada\n");

        // Si hay estacion guardada en el boton seleccionado
        } else{
            print("Usted esta sintonizando la estacion: " + estacion + "\n");
        }
    }   

    // Imprime el comportamiento del raio cuando se avanza
    public void avanzar(double estacion){
        line();
        print("Usted esta sintonizando la estacion: " + estacion + "\n");
    }

    // Mensaje de radio apagado
    public void apagado(){
        line();
        print("La radio esta apgada\nEnceiendela para utilizar esta funcion");
    }
}

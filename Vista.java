/********************************************************
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Profesor: Moises Gonzales
Vista.java
Autores: 
-Luis Santos: 20226
-Diego Cordova: 20212
Última fecha de modificaión: 2021-01-16

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

    public void encenderApagar(boolean estado){
        String temp;

        if (estado){
            temp = "Encendido";

        } else {
            temp = "Apagado";
        }

        line();
        print("El radio ahora esta " + temp);
    }

    public void amFm(boolean emisora){
        String temp;

        if (emisora){
            temp = "Am";

        } else {
            temp = "Fm";
        }

        line();
        print("Ha cambiado a radio " + temp);
    }
}

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

// Clase vista
public class Vista {

    // Metodo print 
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
        print("\nGracias por utilizar la radio UVG\n\nRecuerda que seguimos en pandemia\nUsa mascarilla y lavate las manos estimado conciudadano :)\n");
        line();
    }
}

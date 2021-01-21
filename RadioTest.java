/********************************************************
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Profesor: Moises Gonzales
RadioTest.java
Autores: 
-Luis Santos: 20226
-Diego Cordova: 20212
Última fecha de modificaión: 2021-01-21

Pruebas unitoarias de clase Radio
********************************************************/

import static org.junit.Assert.*;  
import org.junit.*;
    
public class RadioTest {

    private Radio rad = new Radio(); // Se crea un objeto de la calse Radio para realizar pruebas unitarias de sus metodos
        
    @Test
    public void seleccionarSinMemoria(){
        String output = rad.seleccionar(1);
        assertEquals("", output); // Se compara la respuesta esperada con la obtenida
    }

    @Test
    public void seleccionarConMemoria(){
        String estacion_num = String.valueOf(rad.avanzar()); // Se guarda la estacion actual en una variable
        rad.guardar(1); // Se guarda la estacion actual en el boton 1
        rad.avanzar();
        rad.avanzar();
        rad.avanzar();
        String output = rad.seleccionar(1); // Se selecciona el boton 1 y se guarda el output en una variable
        assertEquals(estacion_num, output); // Se compara la estacion actual con la estacion 
    }

    @Test
    public void avanzarAm(){
        String estacion = String.valueOf(rad.avanzar() + 10); // Se guarda la estacion esperada la proxima vez que avance
        String output = String.valueOf(rad.avanzar()); // Se guarada la estacion resultante de avanzar
        assertEquals(estacion, output); // Se compara la respuesta esperada con la obtenida
    } 

    @Test
    public void avanzarFm(){
        rad.amFm(); // Se cambia de Am a Fm
        String estacion = String.valueOf(rad.avanzar() + 0.2); // Se guarda la estacion esperada la proxima vez que avance
        String output = String.valueOf(rad.avanzar()); // Se guarada la estacion resultante de avanzar
        assertEquals(estacion, output); // Se compara la respuesta esperada con la obtenida
    }

    @Test
    public void encender(){
        boolean output = rad.encenderApagar(); // Se gaurda el estado resultante
        assertEquals(true, output); // Se compara la respuesta esperada con la obtenida
    }

    @Test
    public void apagar(){
        
        rad.encenderApagar();
        boolean output = rad.encenderApagar(); // Se gaurda el estado resultante
        assertEquals(false, output); // Se compara la respuesta esperada con la obtenida
    }

    @Test
    public void guardar(){
        String estacion = String.valueOf(rad.avanzar()); // Se guarda la estacion actual
        String output = rad.guardar(1); // Se guarda la estacion guardada
        assertEquals(estacion, output); // Se compara la respuesta esperada con la obtenida
    }
}
    
/********************************************************
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Profesor: Moises Gonzales
Radio.java
Autores: 
-Luis Santos: 20226
-Diego Cordova: 20212
Última fecha de modificaión: 2021-01-16

Clase Radio
Implementacion de la interfaz (Interface)
********************************************************/

public class Radio implements Interface {

    // Atributos
    private boolean emisora; // true = am | false = fm
    private boolean estado; // Guarda el estado del radio | true = encendido, false = apagado
    private double estacion; // Guarda la estacion de radio que se esta sintonizando

    //Cosntructor
    public Radio(){
        this.estado = false;
        this.emisora = true;
    }
    
    @Override
    public boolean encenderApagar() {
        return false;
    }

    @Override
    public boolean amFm() {
        return false;
    }

    @Override
    public String guardar(int btn) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String seleccionar(int btn) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double avanzar() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    // Getter de estacion
    public double getEstacion() {
        return estacion;
    }
}

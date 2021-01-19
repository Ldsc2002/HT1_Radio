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
    private int[] fm; // simula los botones de la emisora fm
    private int[] am; // simula los botones de la emisora am
    private boolean emisora; // true = am | false = fm
    private boolean estado; // Guarda el estado del radio | true = encendido, false = apagado

    //Cosntructor
    public Radio(){
        this.fm = new int[12];
        this.am = new int[12];
        this.estado = false;
        this.emisora = true;
    }
    
    @Override
    public boolean encenderApagar() {
        boolean temp = cambio(this.estado);
        this.estado = temp;
        return temp;
    }

    @Override
    public boolean amFm() {
        boolean temp = cambio(this.emisora);
        this.emisora = temp;
        return temp;
    }

    // cambia el estado del parametro state de true a false o biceversa y devuelve su nuevo valor
    private boolean cambio(boolean state){

        boolean temp;
        if (state){
            temp = false;

        } else {
            temp = true;
        }

        return temp;
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
    
}

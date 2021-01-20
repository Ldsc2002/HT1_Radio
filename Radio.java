/********************************************************
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Profesor: Moises Gonzales
Radio.java
Autores: 
-Luis Santos: 20226
-Diego Cordova: 20212
Última fecha de modificaión: 2021-01-19

Clase Radio
Implementacion de la interfaz (Interface)
********************************************************/

public class Radio implements Interface {

    // Atributos
    private boolean emisora; // true = am | false = fm
    private boolean estado; // Guarda el estado del radio | true = encendido, false = apagado
    private double estacion; // Guarda la estacion de radio que se esta sintonizando
    private double[] memoriaAM = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private double[] memoriaFM = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    //Cosntructor
    public Radio(){
        this.estado = false;
        this.emisora = true;
    }
    
    @Override
    public boolean encenderApagar() {
        if (estado == false) {
            estado = true;
            return true;
        }
        else {
            estado = false;
            return false;
        }
    }

    @Override
    public boolean amFm() {
        if (emisora == false) {
            emisora = true;
            estacion = 530;
            return true;
        }
        else {
            emisora = false;
            estacion = 87.9;
            return false;
        }
    }

    @Override
    public String guardar(int btn) {
        boolean check = true;

        if (emisora == true) {
            while (check) {
                for (int i = 0; i < memoriaAM.length; i++) {
                    if (memoriaAM[i] == 0) {
                        memoriaAM[i] = estacion;
                        check = false;
                    }
                }
            }
        } else {
            while (check) {
                for (int i = 0; i < memoriaFM.length; i++) {
                    if (memoriaFM[i] == 0) {
                        memoriaFM[i] = estacion;
                        check = false;
                    }
                }
            }
        }

        return String.valueOf(estacion);
    }

    @Override
    public String seleccionar(int btn) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public double avanzar() {
        if (emisora == true) {
            estacion = estacion + 10;
            if (estacion == 1620) {
                estacion = 530;
            }
        } else {
            estacion = estacion + 0.2;
            if (estacion == 108.1) {
                estacion = 107.9;
            }
        }
        return estacion;
    }
}

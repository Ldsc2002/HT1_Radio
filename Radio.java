/********************************************************
Universidad del Valle de Guatemala
Algoritmos y Estructuras de Datos
Profesor: Moises Gonzales
Radio.java
Autores: 
-Luis Santos: 20226
-Diego Cordova: 20212
Última fecha de modificaión: 2021-01-20

Clase Radio
Implementacion de la interfaz (Interface)
********************************************************/

public class Radio implements Interface {

    // Atributos
    private boolean emisora; // true = am | false = fm
    private boolean estado; // Guarda el estado del radio | true = encendido, false = apagado
    private double estacion; // Guarda la estacion de radio que se esta sintonizando
    private double[] memoriaAM = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //Radios AM guardadas en la radio
    private double[] memoriaFM = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //Radios FM guardadas en la radio

    //Cosntructor
    public Radio(){
        this.estado = false; // EL radio inicia estando apagado
        this.emisora = true; // El raio inicia en Am
    }
    
    @Override
    public boolean encenderApagar() { //Cambia el estado de la radio
        if (estado == false) { //Si esta apagada
            estado = true; //La enciende
            return true;
        }
        else { //Si esta encendida
            estado = false; //La apaga
            return false;
        }
        //Devuelve el estado de la radio
    }

    @Override
    public boolean amFm() { //Cambia entre AM y FM
        if (emisora == false) { //Si es FM
            emisora = true; //Cambia a AM
            estacion = 530; //Estacion inicial de AM
            return true;
        }
        else { //Si es AM
            emisora = false; //Cambia a FM
            estacion = 87.9; //Estacion inicial de FM
            return false;
        }
        //Devuelve si esta en AM o FM
    }

    @Override
    public String guardar(int btn) { //Guarda la estacion actual en el boton indicado
        if (emisora == true) { //Si es AM
            memoriaAM[btn - 1] = estacion; //Guarda la estacion AM
        } else { //Si es FM
            memoriaFM[btn - 1] = estacion; //Guarda la estacion FM
        }

        return String.valueOf(estacion); //Devuelve la estacion almacenada
    }

    @Override
    public String seleccionar(int btn) { //Selecciona una estacion previamente almacenada
        if (emisora == true) { //Si es AM
            if (memoriaAM[btn - 1] != 0) { //Verifica que haya una estacion guardada
                estacion = memoriaAM[btn - 1]; //Cambia la estacion
            } else { //Si no hay estacion guardada
                return "";
            }
        } else { //Si es FM
            if (memoriaFM[btn - 1] != 0) { //Verifica que haya una estacion guardada
                estacion = memoriaFM[btn - 1]; //Cambia la estacion
            } else { //Si no hay estacion guardada
                return "";
            }
        }
        return String.valueOf(estacion); //Devuelve la estacion a la que se cambio
    }

    @Override
    public double avanzar() { //Avanza a la siguiente estacion 
        if (emisora == true) { //Si es AM
            estacion = estacion + 10; //Cambia a la siguiente estacion
            if (estacion == 1620) { //Si llega al final de las frecuencias
                estacion = 530; //Regresa al inicio
            }
        } else { //Si es FM
            estacion = estacion + 0.2; //Cambia a la siguiente estacion
            if (estacion == 108.1) { //Si llega al final de las frecuencias
                estacion = 107.9; //Regresa al inicio
            }
        }
        return estacion; //Regresa la estacion que se esta sintonizando
    }
}

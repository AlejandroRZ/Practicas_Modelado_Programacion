package Controlador;

/**
* Declaración e importación de paquetes tanto propios como axuiliares externos.
* Se separan las clases en el proyecto acorde al patrón MVC.
*/
import Modelo.*;
import Vista.*;
import java.io.*;

/**
* Clase que define el comportamiento de un tamagotchi mientras se encuentra aburrido
* acorde al patrón de diseño State para la clase <code>Tamagotchi</code>.
* @author Gabby, SanMa, Immerwahr. 
* @version 1.3
**/
public class Aburrido implements State {
    private Tamagotchi tamagotchi;


    /**
    * Método que define la respuesta del tamagotchi mientras se encuentra aburrido
    * una vez que se le solicita que juegue con el usuario.
    **/
    @Override
    public void jugar() {
        System.out.println(" ");
        System.out.println("\u001B[34m" + "Síiiiiii :D" + "\u001B[0m");
        System.out.println(tamagotchi.getSkin().graficoJugando());
        int monedas = new MenuDeJuegos().menuJuegos(tamagotchi.juegosDisponibles());
        tamagotchi.setMonedas(tamagotchi.getMonedas()+monedas);
        tamagotchi.setState(new Sucio());
    }

    /**
    * Método que define la respuesta del tamagotchi mientras se encuentra aburrido
    * una vez que se le trata de alimentar.
    **/
    @Override
    public void alimentar() {
        System.out.println("\u001B[34m" + " ");
        System.out.println("No quiero comer" + "\u001B[0m");
        System.out.println(tamagotchi.getSkin().graficoIndispuesto());
    }

    /**
    * Método que define la respuesta del tamagotchi mientras se encuentra aburrido
    * cuando se trata de hacerle dormir.
    **/
    @Override
    public void dormir() {
        System.out.println("\u001B[34m" + " ");
        System.out.println("No quiero dormir" + "\u001B[0m");
        System.out.println(tamagotchi.getSkin().graficoIndispuesto());
    }

    /**
    * Método que define la respuesta del tamagotchi mientras se encuentra aburrido
    * una vez que se intenta darle un baño.
    **/
    @Override
    public void baniar() {
        System.out.println("\u001B[34m" + " ");
        System.out.println("No me quiero bañar" + "\u001B[0m");
        System.out.println(tamagotchi.getSkin().graficoIndispuesto());
    }

    /**
    * Método que nos da una descripción del estado actual del tamagotchi.
    **/
    @Override
    public void comoEstas() {
        System.out.println("\u001B[34m" + " ");
        System.out.println("Estoy aburrido, ¡Quiero jugar!" + "\u001B[0m");
        System.out.println(tamagotchi.getSkin().graficoIndispuesto());
    }

    /**
    * Método que permite asignar un tamagotchi del cuál se manipulara su estado.
    * @param tamagotchi la mascota virtual de la cuál se cambia el estado. 
    **/
    @Override
    public void setTamagotchi(Tamagotchi tamagotchi) {
        this.tamagotchi = tamagotchi;
    }
}

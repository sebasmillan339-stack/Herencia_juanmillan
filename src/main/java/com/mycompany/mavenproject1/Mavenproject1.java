/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.mavenproject1;

import modelo.*;
import vista.Vistacombate;
import Controlador.ControladorCombate;

public class Mavenproject1 {

    public static void main(String[] args) {
        System.out.println("Simulador de rol");

        Personaje arquero = new Ranger("Kael", 15);
        Personaje caballero = new Paladin("Selene", 16);
        Personaje aldeano = new Personaje("Maestro Rowan", 9);

        Personaje[] grupoAventura = {arquero, caballero, aldeano};
        Vistacombate pantalla = new Vistacombate();

        // el controlador recibe el modelo (arreglo) y la vista
        ControladorCombate coordinador = new ControladorCombate(grupoAventura, pantalla);
        coordinador.ejecutarRonda();
    }
}
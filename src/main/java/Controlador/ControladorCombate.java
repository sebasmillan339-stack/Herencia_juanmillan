/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import modelo.Personaje;
import vista.Vistacombate;

public class ControladorCombate {
    private Personaje[] personajes;
    private Vistacombate pantalla;

    public ControladorCombate(Personaje[] listaPersonajes, Vistacombate vistaCombate) {
        this.personajes = listaPersonajes;
        this.pantalla = vistaCombate;
    }

    // recorre el arreglo y cada personaje ejecuta su propio ataque (polimorfismo)
    public void ejecutarRonda() {
        pantalla.mostrarInicioDeCombate();
        for (Personaje pj : personajes) {
            String descripcion = pj.realiazarAtaque();
            pantalla.mostrarAtaque(pj.getNombre(), descripcion);
        }
    }
}
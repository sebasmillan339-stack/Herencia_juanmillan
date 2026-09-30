/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Paladin extends Personaje {

    public Paladin(String nombrePj, int puntosConstitucion) {
        super(nombrePj, puntosConstitucion);
    }

    @Override
    public String realiazarAtaque() {
        return "lanza un golpe sagrado con su martillo";
    }
}
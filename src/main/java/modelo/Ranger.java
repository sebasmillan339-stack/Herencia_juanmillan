/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Ranger extends Personaje {

    public Ranger(String nombrePj, int puntosConstitucion) {
        super(nombrePj, puntosConstitucion);
    }

    @Override
    public String realiazarAtaque() {
        return "dispara una flecha certera desde lejos";
    }
}
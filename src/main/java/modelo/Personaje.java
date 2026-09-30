/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

public class Personaje {
    protected String nombre;
    protected int constitucion;

    public Personaje(String nombrePj, int puntosConstitucion) {
        this.nombre = nombrePj;
        this.constitucion = puntosConstitucion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nuevoNombre) {
        this.nombre = nuevoNombre;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public void setConstitucion(int nuevaConstitucion) {
        this.constitucion = nuevaConstitucion;
    }

    // ataque por defecto, las subclases lo sobrescriben
    public String realiazarAtaque() {
        return "golpea con los puños";
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Mariela Cortes C
 */
public class Estudiante {
    private String nombre;
    private int edad;
    private String carne;

    public Estudiante( String nombre, int edad , String carne) {
        this.nombre = nombre;
        this.edad = edad;
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }
    
    public String getInformacion ()
    {
        return this.getCarne()+"\t"+this.getNombre()+"\t"+this.getEdad()+"\t";
    }
    
}

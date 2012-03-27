/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reto01;

/**
 *
 * @author CARLOS
 */
public class Cliente {
    
    String dni;
    String nombre;
    String Apellido;
    String Tipo;

    public Cliente(String dni, String nombre, String Apellido, String Tipo) {
        this.dni = dni;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.Tipo = Tipo;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
    
}

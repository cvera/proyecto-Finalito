/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package reto01;

/**
 *
 * @author CARLOS
 */
public class Premio extends Factura{
    String Fecha;

    public Premio(String Fecha, int montoF, String dni, String nombre, String Apellido, String Tipo, String codigo) {
        super(montoF, dni, nombre, Apellido, Tipo, codigo);
        this.Fecha = Fecha;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}

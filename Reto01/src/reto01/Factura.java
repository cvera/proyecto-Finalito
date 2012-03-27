
package reto01;

/**
 *
 * @author CARLOS
 */
public class Factura extends Cliente{
    String codigo;
    int montoF;

    public Factura(int montoF, String dni, String nombre, String Apellido, String Tipo,String codigo) {
        super(dni, nombre, Apellido, Tipo);
        this.montoF = montoF;
        this.codigo=codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getMontoF() {
        return montoF;
    }

    public void setMontoF(int montoF) {
        this.montoF = montoF;
    }
    
    
}

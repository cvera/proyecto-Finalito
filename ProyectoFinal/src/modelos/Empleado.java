
package modelos;


public class Empleado extends Usuario{
    public String codEmpleado;

    public Empleado(String codEmpleado, String nombre, String apellido, String userName, String passWord) {
        super(nombre, apellido, userName, passWord);
        this.codEmpleado = codEmpleado;
    }

    public String getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(String codEmpleado) {
        this.codEmpleado = codEmpleado;
    }
    
    
    
}

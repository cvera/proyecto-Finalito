
package modelos;


<<<<<<< HEAD

public class Empleado extends Usuario{

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol);
    }
=======
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
    
    
>>>>>>> d691b66db66f71397d540d7bdab9734265567b81
    
}

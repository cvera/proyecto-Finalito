/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author CARLOS
 */
public class Administrador extends Usuario{

    public Administrador(String nombre, String apellidoPaterno, String apellidoMaterno, String dni, String correoE, String fechaIngreso, String userName, String passWord, String confpassWord, String cargo, String rol) {
        super(nombre, apellidoPaterno, apellidoMaterno, dni, correoE, fechaIngreso, userName, passWord, confpassWord, cargo, rol);
    }

    
}

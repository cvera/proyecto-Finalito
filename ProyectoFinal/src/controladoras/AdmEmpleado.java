/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Empleado;


/**
 *
 * @author CARLOS
 */
public class AdmEmpleado {
    
    private ArrayList<Empleado> dbEmpleados=new ArrayList<Empleado>();
    
    private void simularTabla(){
        this.dbEmpleados.add(new Empleado("Luis","Cabrera","Hernandez","41713324","lcabrera@hotmail.com","25/03/2012","lcabrera","lu123","lu123","empleado","RRHH"));
        this.dbEmpleados.add(new Empleado("Paul","Rodriguez","Suarez","43456328","prodriguez@hotmail.com","12/02/2012","prodriguez","p123","p123","empleado","logistica"));
             
    }
    
    public boolean verificarEmpleado(String user){
        if(user!=null){
            return true;
        }
           return false;
    }
    public boolean verificarPassword(String user){
        if(user!=null){
            return true;
        }
          return false;
    }
    
    public Empleado existeUsuario(String userName){
        simularTabla();
        Empleado usuarioEncontrado=null;
        for(Empleado empleado:dbEmpleados){
          if(empleado.getUserName().equals(userName))
              usuarioEncontrado=empleado;
    }
        return usuarioEncontrado;
    }
    
    public boolean validarPassword(String userName, String password){
       boolean acceso=false;
       Empleado usuarioValido=existeUsuario(userName);
       if(usuarioValido.getPassWord().equals(password)){
           acceso=true;
       }
       return acceso;
   }
}

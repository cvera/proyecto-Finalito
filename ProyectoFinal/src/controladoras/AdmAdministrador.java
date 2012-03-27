/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

<<<<<<< HEAD
import java.util.ArrayList;
import modelos.Administrador;


=======
>>>>>>> d691b66db66f71397d540d7bdab9734265567b81
/**
 *
 * @author CARLOS
 */
public class AdmAdministrador {
    
<<<<<<< HEAD
    private ArrayList<Administrador> dbAdministrador=new ArrayList<Administrador>();
    
    private void simularTabla(){
        this.dbAdministrador.add(new Administrador("Carlos","Vera","Villanueva","41713326","carlosvera2004@hotmail.com","25/03/2012","cvera","car123","car123","administrador","RRHH"));
        this.dbAdministrador.add(new Administrador("Grace","Navarro","Galarza","43456678","gnavarro@hotmail.com","12/02/2012","gnavarro","g123","g123","administrador","logistica"));
         
         
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
    
    public Administrador existeUsuario(String userName){
        simularTabla();
        Administrador usuarioEncontrado=null;
        for(Administrador empleado:dbAdministrador){
          if(empleado.getUserName().equals(userName))
              usuarioEncontrado=empleado;
    }
        return usuarioEncontrado;
    }
    
    public boolean validarPassword(String userName, String password){
       boolean acceso=false;
       Administrador usuarioValido=existeUsuario(userName);
       if(usuarioValido.getPassWord().equals(password)){
           acceso=true;
       }
       return acceso;
   }
=======
>>>>>>> d691b66db66f71397d540d7bdab9734265567b81
}

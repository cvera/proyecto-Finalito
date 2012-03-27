
package controladoras;

import java.util.ArrayList;
import modelos.Usuario;

public class AdmUsuarios {
    
    private ArrayList<Usuario> dbUsuarios=new ArrayList<Usuario>();
    
    private void simularTabla(){
        this.dbUsuarios.add(new Usuario("Carlos","Vera","Villanueva","41713326","carlosvera2004@hotmail.com","25/03/2012","cvera","car123","car123","administrador","RRHH"));
        this.dbUsuarios.add(new Usuario("Grace","Navarro","Galarza","43456678","gnavarro@hotmail.com","12/02/2012","gnavarro","g123","g123","empleado","logistica"));
         
         
    }
    
    public boolean verificarUsuario(String user){
        if(user!=null){
            return true;
        }
          return false;
    }
    
    public boolean verificarPassword(String password){
        if(password!=null){
            return true;
        }
        return false;
    }
    
    public Usuario existeUsuario(String userName){
        simularTabla();
        Usuario usuarioEncontrado=null;
        for(Usuario usuario:dbUsuarios){
            if(usuario.getUserName().equals(userName))
               usuarioEncontrado=usuario;         
         } 
            return usuarioEncontrado;      
     }
    
    public boolean validarPassword(String userName, String password){
       boolean acceso=false;
       Usuario usuarioValido=existeUsuario(userName);
       if(usuarioValido.getPassWord().equals(password)){
           acceso=true;
       }
       return acceso;
   }
}

package controladoras;

import java.util.ArrayList;
import modelos.Empleado;
import modelos.Usuario;

public class AdmUsuarios {
    
    private ArrayList<Usuario> dbUsuarios=new ArrayList<Usuario>();
    
    private void simularTabla(){
        this.dbUsuarios.add(new Empleado("001","Carlos","vera","cvera","car123"));
        this.dbUsuarios.add(new Empleado("002","Juan","Perez","jperez","per123"));
         this.dbUsuarios.add(new Empleado("003","Luis","Sanchez","lsanchez","lsan123"));
          this.dbUsuarios.add(new Empleado("004","Sandra","castro","scastro","san123"));
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
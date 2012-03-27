/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import java.util.ArrayList;
import modelos.Usuario;
import modelos.Empleado;
/**
 *
 * @author operador
 */
public class AdmUsuarios {
    
    private ArrayList<Usuario> dbUsuarios=new ArrayList<Usuario>();
    
    private void simularTabla(){
        this.dbUsuarios.add(new Empleado("001","Carlos","Salinas","carsa1","carsa1111"));
         this.dbUsuarios.add(new Empleado("002","Sandra","Perez","sanper","sanper222"));
         this.dbUsuarios.add(new Empleado("003","Jose","Salinas","carsa1","josrab333"));
         this.dbUsuarios.add(new Empleado("004","Gonzalo","Gutierrez","gongut","gongut444"));
    }
    
    public boolean verificarUsuario(String user){
        if(user != null){
            return true;
           
        }
             return false;
    }
    
    //Verificar que password no es null
    
   public Usuario existeUsuario(String userName){
       simularTabla();
       Usuario usuarioEncontrado=null;
       for(Usuario usuario: dbUsuarios){
           if(usuario.getUserName().equals(userName))
               usuarioEncontrado=usuario;
       }
       return usuarioEncontrado;
   }
   
   public boolean validarPassword(String userName, String password){
       boolean acceso=false;
       Usuario usuarioValido=existeUsuario(userName);
       if(usuarioValido.getPassword().equals(password)){
           acceso=true;
       }
       return acceso;
   }
}

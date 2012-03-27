/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import controladoras.AdmUsuarios;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 *
 * @author operador
 */
public class AdmUsuariosTest {
    
    AdmUsuarios admUsuarios=new AdmUsuarios();
    
    @Test
    public void siNoIngresoElUsuarioMeDebeDarError(){
        assertFalse(admUsuarios.verificarUsuario(null));
        System.out.println("Usuarios no debe estar vacio");
        
    }
    
    /* Verificar que password no es null*/
    
    @Test
    
    public void siIngresoElUsuarioDebeAceptarlo(){
        assertTrue(admUsuarios.verificarUsuario("carlos"));
        System.out.println("Usuario ingresado");
    }
    
   /* Verificar que Password no es null*/
    
    @Test
    public void siElUsuarioNoExisteDebeMandarMensaje(){
        assertNull(admUsuarios.existeUsuario("adrierm"));
        System.out.println("Usuario Inexistente");
    }
    @Test
    public void siElUsuarioExisteDebeMandarMensaje(){
        assertNotNull(admUsuarios.existeUsuario("sanper"));
         System.out.println("Usuario existente");
    }
    @Test
    public void siElPassWordEsValidoDebeDarmeAcceso(){
        assertTrue(admUsuarios.validarPassword("sanper","sanper222"));
        System.out.println("Acceso Aceptado");
    }
    
    @Test
    public void siElPassWordNoEsValidoNoDebeDarmeAcceso(){
        assertTrue(admUsuarios.validarPassword("sanper","sadkasd"));
        System.out.println("Acceso No Aceptado");
    }
   
}
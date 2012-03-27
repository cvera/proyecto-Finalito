/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;


import org.junit.Test;
import static org.junit.Assert.*;

public class AdmAdministradorTest {
    
    
    AdmAdministrador admAdministrador=new AdmAdministrador();
    
    @Test
    
    public void siNoIngresoElAdministradorMeDebeDarError(){
        assertFalse(admAdministrador.verificarEmpleado(null));
        System.out.println("Usuario no debe estar vacio");
    
      }
    @Test
    
    public void siIngresoElAdministradorDebeAceptarlo(){
        assertTrue(admAdministrador.verificarEmpleado("Luis"));
        System.out.println("Usuario Ingresado");
    }
    
    @Test
    
    public void siNoIngresaPasswordAdministradorMeDebeDarError(){
        assertFalse(admAdministrador.verificarPassword(null));
        System.out.println("Password no debe estar vacio");
    }
    @Test
    
     public void siIngresoPasswordDebeAceptarlo(){
        assertTrue(admAdministrador.verificarPassword("lu123"));
        System.out.println("Password Ingresado");
    
}
    @Test
    
    public void siElEmpleadoNoExisteDebeMandarMensaje(){
        assertNull(admAdministrador.existeUsuario("lsanz"));
        System.out.println("Usuario no existe");
    }
    @Test
    
    public void siElExisteDeBeMandarMensaje(){
        assertNotNull(admAdministrador.existeUsuario("cvera"));
        System.out.println("Usuario existente");
    
    }
    @Test
    
    public void siElPasswordEsValidoDebeDarmeAcceso(){
        assertTrue(admAdministrador.validarPassword("cvera","car123"));
         System.out.println("Acceso Aceptado");
    }
    
    @Test
    
    public void siElPasswordNoEsValidoNoDebeDarmeAceeso(){
        assertFalse(admAdministrador.validarPassword("cvera","lu124"));
         System.out.println("Acceso Denegado");
    
   }

    
}

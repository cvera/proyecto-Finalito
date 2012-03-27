/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controladoras;

import org.junit.Test;
import static org.junit.Assert.*;

public class AdmEmpleadoTest {
    AdmEmpleado admEmpleado=new AdmEmpleado();
    
    @Test
    
    public void siNoIngresoElEmpleadoMeDebeDarError(){
        assertFalse(admEmpleado.verificarEmpleado(null));
        System.out.println("Usuario no debe estar vacio");
    
      }
    @Test
    
    public void siIngresoElEmpleadoDebeAceptarlo(){
        assertTrue(admEmpleado.verificarEmpleado("Luis"));
        System.out.println("Usuario Ingresado");
    }
    
    @Test
    
    public void siNoIngresaPasswordEmpleadoMeDebeDarError(){
        assertFalse(admEmpleado.verificarPassword(null));
        System.out.println("Password no debe estar vacio");
    }
    @Test
    
     public void siIngresoPasswordDebeAceptarlo(){
        assertTrue(admEmpleado.verificarPassword("lu123"));
        System.out.println("Password Ingresado");
    
}
    @Test
    
    public void siElEmpleadoNoExisteDebeMandarMensaje(){
        assertNull(admEmpleado.existeUsuario("lsanz"));
        System.out.println("Usuario no existe");
    }
    @Test
    
    public void siElExisteDeBeMandarMensaje(){
        assertNotNull(admEmpleado.existeUsuario("lcabrera"));
        System.out.println("Usuario existente");
    
    }
    @Test
    
    public void siElPasswordEsValidoDebeDarmeAcceso(){
        assertTrue(admEmpleado.validarPassword("lcabrera","lu123"));
         System.out.println("Acceso Aceptado");
    }
    
    @Test
    
    public void siElPasswordNoEsValidoNoDebeDarmeAceeso(){
        assertFalse(admEmpleado.validarPassword("lcabrera","lu124"));
         System.out.println("Acceso Denegado");
    
   }

}
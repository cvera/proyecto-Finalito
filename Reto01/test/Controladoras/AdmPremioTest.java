/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CARLOS
 */
public class AdmPremioTest {
    
    public AdmPremioTest() {
    }
     
    AdmPremio admPremio=new AdmPremio();
    
    @Test
    
    public void siElClienteEsClienteNormalCalcularPuntos(){
        assertNotNull(admPremio.existeTipo("normal"));
        System.out.println("Es un cliente Normal");
    }
    
    @Test
     public void siElClienteNoEsClienteNormalCalcularPuntos(){
        assertNull(admPremio.existeTipo("plata"));
        System.out.println("No Es un cliente Normal");
    
}
}
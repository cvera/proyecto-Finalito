/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras;

import java.util.ArrayList;
import reto01.Factura;


public class AdmFactura {
    
    private ArrayList<Factura> dbUsuarios=new ArrayList<Factura>();
    
    private void simularTabla(){
        this.dbUsuarios.add(new Factura(10000,"41713326","Carlos","Vera","normal","001"));
        this.dbUsuarios.add(new Factura(12000,"43456678","Grace","Galarza","gold","002"));
        this.dbUsuarios.add(new Factura(12000,"43456623","Luis","Perez","platinum","003"));
         
        
         
    }
    
}

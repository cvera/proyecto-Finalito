/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladoras;

import java.util.ArrayList;
import reto01.Factura;
import reto01.Premio;


/**
 *
 * @author CARLOS
 */
public class AdmPremio {
     private ArrayList<Premio> dbPremios=new ArrayList<Premio>();
    
    private void simularTabla(){
        this.dbPremios.add(new Premio("12/10/2012",10000,"41713326","Carlos","Vera","normal","001"));
        this.dbPremios.add(new Premio("12/10/2012",12000,"43456678","Grace","Galarza","gold","002"));
        this.dbPremios.add(new Premio("12/10/2012",12000,"43456623","Luis","Perez","platinum","003"));
         
        
         
    }
    public Factura existeTipo(String tipo){
        simularTabla();
        Premio tipoEncontrado=null;
        for(Premio premio:dbPremios){
            if(premio.getTipo().equals(tipo))
               tipoEncontrado=premio;         
         } 
            return tipoEncontrado;
        
        
    }
   
}

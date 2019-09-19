/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicas;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 *
 * @author usuario
 */
public class HastablePractica {
    
    public static void main(String[] args) {
    
        Hashtable <Integer, String> table = new Hashtable();
        table.put(101,"Juan");
        table.put(102,"Pepe");
        table.put(103,"Pedro");
        table.put(104,"Antonio");
        table.put(105,"Jose");
        
        Enumeration e = table.keys();
        Object clave;
        Object valor;
        while( e.hasMoreElements() ){
        clave = e.nextElement();
        valor = table.get( clave );
        System.out.println( "Clave : " + clave + " - Valor : " + valor );
}
        
    
        
        
    }
    
}

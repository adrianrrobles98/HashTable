/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Test extends Empleado{
    
    public static void main(String[] args) {
        
        Empleado e1 = new JefesDeProyecto("Pedro ","Perez ",88);
        Empleado e2 = new TrabajadoresPorHoras("Juan ","Jose ",99);
        Empleado e3 = new Montador("Antonio ","Rodriguez ",11);
        Empleado e4 = new Vendedores();
        
        ArrayList<Empleado> empleados = new ArrayList<>();
        
        empleados.add(e1);
        empleados.add(e2);
        empleados.add(e3);
        empleados.add(e4);
        
        for(Empleado e: empleados){
            System.out.println(e);      }
    }
    
}

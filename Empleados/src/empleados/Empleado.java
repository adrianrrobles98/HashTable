/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;

/**
 *
 * @author usuario
 */
public class Empleado {
    

    protected double salarioBase;
    protected double incentivo;
    protected String nombre;
    protected String apellido;
    
    public Empleado(){}
    
    public Empleado(String nombre, String apellido, double salarioFinal){
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.incentivo = incentivo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    public double salarioBase() {
        return salarioBase;
    }
      
    
    public double Salario(){
        double salarioFinal = this.salarioBase * this.incentivo;
        return salarioFinal;    
    }
    
    public String toString(){
        return this.nombre + this.apellido;
        
    }
    
    
}

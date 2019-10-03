/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleados;


public class JefesDeProyecto extends Empleado{
    
    double salarioBase;
    int numeroProyectos;
    
    public JefesDeProyecto(){}

    public JefesDeProyecto(String nombre, String apellido, double salarioFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.incentivo = incentivo;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public int getNumeroProyectos() {
        return numeroProyectos;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNumeroProyectos(int numeroProyectos) {
        this.numeroProyectos = numeroProyectos;
    }
    
    public void salario(){
        
    }
    
    public String toString(){
        return this.nombre + this.apellido +"Jefes de proyecto";
        
    }
    
    
    
}

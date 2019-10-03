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
public class TrabajadoresPorHoras extends Empleado{
    
    int numeroHorasTrabajadas;
    double salarioPorHora;
    
    public TrabajadoresPorHoras(){}
    
        public TrabajadoresPorHoras(String nombre, String apellido, double salarioFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.incentivo = incentivo;
    }

    public int getNumeroHorasTrabajadas() {
        return numeroHorasTrabajadas;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setNumeroHorasTrabajadas(int numeroHorasTrabajadas) {
        this.numeroHorasTrabajadas = numeroHorasTrabajadas;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }
    
    public void salario(){
        
    }
    
    public String toString(){
        return this.nombre + this.apellido +"TrabajadoresPorHoras";
        
    }
    
    
}

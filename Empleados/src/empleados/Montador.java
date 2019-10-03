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
public class Montador extends Empleado{
    
    int numeroElectrodomesticos;
    double importePorUnidad;
    
 
    
    public Montador(String nombre, String apellido, double salarioFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.incentivo = incentivo;
    }

    public int getNumeroElectrodomesticos() {
        return numeroElectrodomesticos;
    }

    public double getImportePorUnidad() {
        return importePorUnidad;
    }

    public void setNumeroElectrodomesticos(int numeroElectrodomesticos) {
        this.numeroElectrodomesticos = numeroElectrodomesticos;
    }

    public void setImportePorUnidad(double importePorUnidad) {
        this.importePorUnidad = importePorUnidad;
    }
    
    public void salario(){
        
    }
    
   public String toString(){
        return this.nombre + this.apellido +"Montador";
        
    }
    
}

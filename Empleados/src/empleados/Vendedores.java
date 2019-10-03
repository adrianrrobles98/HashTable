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
public class Vendedores extends Empleado{
    
    int electrodomesticosVendidos;
    double comision;

    
    public Vendedores(String nombre, String apellido, double salarioFinal) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salarioBase = salarioBase;
        this.incentivo = incentivo;
    }


    public int getElectrodomesticosVendidos() {
        return electrodomesticosVendidos;
    }
    
    public double comision() {
        return electrodomesticosVendidos;
    }

    public void setElectrodomesticosVendidos(int electrodomesticosVendidos) {
        this.electrodomesticosVendidos = electrodomesticosVendidos;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }
    
    public void salario(){
        
    }
    
    public String toString(){
        return this.nombre + this.apellido +"Vendedores";
        
    }

    
}

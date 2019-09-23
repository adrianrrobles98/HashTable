/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animal;

/**
 *
 * @author usuario
 */
public abstract class Animal {

    protected double peso = 0;
    protected String nombre = "";

    public double getPeso() {
        return peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
  public abstract String ruido();

    
}

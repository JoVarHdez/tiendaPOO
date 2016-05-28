/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

/**
 *
 * @author ema
 */
public abstract class Producto {
    
    
    private int precio;
    private String nombre;
    
    public void setPrecio(int precio){
        this.precio = precio;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
}

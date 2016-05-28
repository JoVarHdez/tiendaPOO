/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.ArrayList;

/**
 *
 * @author ema
 */
public class Tienda {
    
    private String nombre;
    private String cedulaJuridica;
    private String direccion; 
    private Caja caja;
    private Bodega bodega;
    
    private ArrayList <Cliente> clientes;
    
    public Tienda( String nombre, String cedulaJuridica, String direccion){
        caja = new Caja(100000, 0.13);
        this.nombre = nombre;
        this.cedulaJuridica = cedulaJuridica;
        this.direccion = direccion;
    }
}

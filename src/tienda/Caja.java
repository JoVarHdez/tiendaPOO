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
public class Caja {
    
    private double monto;
    private int consecutivoFacturas;
    private double impuesto;
    
    private ArrayList <Factura> historial;
    
    public Caja( double montoInicial, double impuesto){
        this.monto = montoInicial;
        this.impuesto = impuesto;
    }
}

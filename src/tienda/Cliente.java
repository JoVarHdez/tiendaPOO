/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import javax.mail.internet.InternetAddress;

/**
 *
 * @author ema
 */
public class Cliente {
    
    private String nombre;
    private String email;
    private int telefono;
    
    public Cliente(){
        
    }
    
    public String getNombre(){
        /**
         * @return nombre
         */
        return nombre;
    }
    
    public void setNombre(String nombre){
        /**
         * 
         */
        this.nombre = nombre;
    }
    
    public String getEmail(){
        /**
         * @return email
         */
        return email;
    }
    
    public void setEmail(String email) throws Exception{
        /**
         * @throws si el email no es valido
         */
        try{
            InternetAddress emailAddr = new InternetAddress(email);
            emailAddr.validate();
        }
        catch(Exception e){
            throw new Exception("el email no es valido");
        }
        this.email = email;
    }
    
    public int getTelefono(){
        /**
         * @return telefono
         */
        return telefono;
    }
    
    public void setTelefono(int telefono) throws Exception{
        /**
         * @throws si el telefono no es valido
         */
        if(telefono>99999999 || telefono<10000000){
            throw new Exception("telefono invalido");
        }
        this.telefono = telefono;
    }
}

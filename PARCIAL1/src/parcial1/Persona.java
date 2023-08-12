/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;

/**
 *
 * @author AGUILAR
 */
public class Persona {
    
    private String nombre;
    private int edad;
    private String genero;
    private String direccion;
    
    public Persona (String nombre, int edad, String genero, String direccion){
        
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.direccion = direccion;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public String getDireccion(){
        return direccion;
    }
    
    
}

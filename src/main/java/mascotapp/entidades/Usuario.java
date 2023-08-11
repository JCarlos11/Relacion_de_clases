/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapp.entidades;

import java.util.Date;
import java.util.List;
import mascotapp.enumeraciones.SexoHumano;

/**
 *
 * @author JCarlos
 */
public class Usuario {
    
    private String nombre;
    private String apellido;
    private Integer dni;
    private Date nacimiento;
    private String pais;
    private SexoHumano sexo;
    
    //private Mascota mascota; //Así establecemos la relacion mascota-persona 
    //(Poniendola como atributo de la clase a la que queremos que se vincule)
    
    private List<Mascota> mascotas;
    
    
    public Usuario(){
    
    }

   
    
}

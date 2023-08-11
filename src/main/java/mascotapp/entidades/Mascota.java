/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapp.entidades;

import java.util.Objects;
import mascotapp.enumeraciones.Raza;
import mascotapp.enumeraciones.SexoAnimal;

/**
 *
 * @author JCarlos
 */
public class Mascota  {
    
    private String apodo;
    private String tipo;
    private String nombre;
    private String color;
    private Integer edad;
    private boolean cola;
    private Raza raza;
    private SexoAnimal sexo;
    
    private int energia;

    public Mascota() {
        this.energia = 1000;
    }

   
    
}

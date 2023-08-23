/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mascotaapp;

import mascotapp.entidades.Usuario;
import mascotapp.enumeraciones.Raza;
import mascotapp.enumeraciones.SexoHumano;


/**
 *
 * @author JCarlos
 */
public class MascotaAPP {

    public static void main(String[] args) {
        
        Usuario u = new Usuario();
        
        u.setSexo(SexoHumano.HOMBRE);
        
//        String razaInput = "BEAGLE";
//        
//        for (Raza aux : Raza.values()) {
//            if (aux.toString().equals(razaInput)) {
//                System.out.println("Raza input es igual al enum: " + aux);
//            }
//         
//        }
        
 
    }
}

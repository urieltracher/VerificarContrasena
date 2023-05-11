/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificarcontrasena;

/**
 *
 * @author 
 */


import java.util.Scanner;

public class VerificarContrasena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contrasena = pedirContrasena(input);
        mostrarResultado();
    }
    
    public static String pedirContrasena(Scanner input) {
        String contrasena;
        do {
            System.out.print("Ingresa la contraseña: ");
            contrasena = input.nextLine();
        } while(!contrasena.equals("abc123"));
        return contrasena;
    }
    
    public static void mostrarResultado() {
        System.out.println("¡Contraseña correcta!");
    }
}

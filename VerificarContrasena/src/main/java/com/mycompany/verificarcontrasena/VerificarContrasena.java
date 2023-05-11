/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.verificarcontrasena;

/**
 *
 * @author rider
 */
import java.util.Scanner;

public class VerificarContrasena {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String contrasena;
        do {
            System.out.print("Ingresa la contraseña: ");
            contrasena = input.nextLine();
        } while(!contrasena.equals("abc123"));
        System.out.println("¡Contraseña correcta!");
    }
}

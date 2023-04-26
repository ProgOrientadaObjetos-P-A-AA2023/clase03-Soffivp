/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package manejoclases03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALA H
 */
public class Ejecutable05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        Hospital mihospital = new Hospital();
        String nombre;
        int camas;
        double presupuesto;
        System.out.println("Ingrese el nombre del hospital");
        nombre = entrada.nextLine();
        System.out.println("Ingrese el numero de camas del hospital");
        camas = entrada.nextInt();
        System.out.println("Ingrese el presupuesto del hospital");
        presupuesto = entrada.nextDouble();
        
        mihospital.establecerNombre(nombre);
        mihospital.establecerNumeroCamas(camas);
        mihospital.establecerPresupuesto(presupuesto);
                
        System.out.printf("%s - %d - %.2f\n", mihospital.obtenerNombre(),
                mihospital.obtenerNumeroCamas(), mihospital.obtenerPresupuesto());
    }
}

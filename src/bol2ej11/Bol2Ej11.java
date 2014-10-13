
package bol2ej11;

import java.util.Scanner;

public class Bol2Ej11 {

    public static void main(String[] args) {
        
        float sueldo_f = 0;
        float ventas = 0;
        float km = 0;
        float dietas = 0;
        float resultado = 0;
        
        System.out.println("Introduzca el sueldo fijo:");
        Scanner sue= new Scanner (System.in);
        sueldo_f= sue.nextFloat();
        System.out.println("Introduca el importe de ventas:");
        Scanner vent= new Scanner (System.in);
        ventas= vent.nextFloat();
        System.out.println("Introduzca los kilómetros recorridos:");
        Scanner kil= new Scanner(System.in);
        km = kil.nextFloat();
        System.out.println("Introduzca las dietas consumidas:");
        Scanner die= new Scanner(System.in);
        dietas = die.nextFloat();
        
        resultado = sueldo_f + (ventas -(ventas * 95 /100) + (km * 2) + (dietas * 30));
        
        System.out.println("El sueldo  mas comisiones es de " + resultado + " euros al mes");
        
        System.out.println("El sueldo final con las retenciones es de " + (resultado - ((resultado *18 /100)-36)));
        
        
    }
    
}

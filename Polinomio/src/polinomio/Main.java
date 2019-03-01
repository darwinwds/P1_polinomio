/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polinomio;

import static polinomio.Polinomioo.Impresion_de_Monomio3;
import static polinomio.Polinomioo.Impresion_de_Monomio4;
import static polinomio.Polinomioo.Impresion_de_Monomio5;
import static polinomio.Polinomioo.entrada_datos;
import static polinomio.Polinomioo.entrada_datos2;
import static polinomio.Polinomioo.entrada_de_datos3;
import java.util.Scanner;

/**
 *
 * @author Darwin W. Diaz Simon
 */
public class Main {
    private static Object entrada;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion;
		
		
                entrada_datos();
		entrada_datos2();
		entrada_de_datos3();
		
		
			System.out.println("\n\n\nEligue una Opcion");
                        System.out.println("1.-Suma de los Polinomios");
			System.out.println("2.-Resta de los Polinomios");
			System.out.println("3.-Multiplicacion de los Polinomios");
			System.out.println("4.-Salir\n");
                        Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
                        
			
			switch(opcion) {
			
			case 1: 
				
				Impresion_de_Monomio3();
				
				break;
				
				
			case 2:
				
				Impresion_de_Monomio4();
				
				break;
				
			case 3:
				
				Impresion_de_Monomio5();
				
				break;
				
			case 4:
				
				System.out.println("Presiono Salir\n");
				
				break;
				
			default:
				
					System.out.println("\nPresiono un numero incorrecto que no esta en el menu\n\n");

			}
    }
    
}

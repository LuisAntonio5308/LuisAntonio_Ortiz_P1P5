
package Practica5;

import java.util.Scanner;
public class practica5 {
    

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
      
        double[] numero;
        int[] pocision;
        pocision = new int[10];
        numero = new double[10];
        System.out.println("PRACTICA 5");
        System.out.println("Deberas ingresar 10 numeros, elegir en que posicion se encuentra");
        System.out.println("--------------------------------------------------------------------");
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingresa un Numero ID[" + i + "]: ");
            numero[i]= sc.nextDouble();
        }
        
        double aux = 0;
        
        System.out.println("¿Que pocision de numero te gustaria encontrar?");
        System.out.print("Ingresa Numero: ");
        aux = sc.nextDouble();
        int pos = 0;
        
        //Imprimira todos los numeros que se repitan
        for (int i = 0; i < 10; i++){
            //Imprimir si es igual y regresa terminando el trabajo
            pocision[i]=-9999;
            if(aux == numero[i]){
              pocision[pos] = pos;
            }
            pos = pos + 1;
            
        }
        int impre=0;
        for (int i = 0; i < 10; i++) {
            
            if(pocision[i]==-9999) {
            }else{
            System.out.println("El ID encontrado es: "+ "[" + pocision[i] + "]");
            impre++;
            }
        }
        if (impre == 0) {
            System.out.println("--> No es un numero registrado: -1 <--");
        }

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eparrales;

import java.util.Scanner;

/**
 *
 * @author UsuarioEp
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*Realizar la potencia a¨b  de dos numeros enteros positivos*/
        Scanner sc = new Scanner(System.in);
        Operaciones operar = new Operaciones();
        int base=0;
        int exponente=0;
        int result=1;
          
          try{
              System.out.println(" Ingrese el número base ");
              base= sc.nextInt();
              System.out.println(" Ingrese el número exponente ");
              exponente=sc.nextInt();
          }catch(Exception e ){
              System.out.println(" Error "+e);
                      
          }
             result=operar.potencia(base, exponente);
          
        
            System.out.println(" el resultado es "+result);
            
            System.out.println(" metodo dos "+operar.potencia1(5, 0));
    }
    
}

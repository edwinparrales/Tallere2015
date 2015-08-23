/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eparrales;

/**
 *
 * @author UsuarioEp
 */
public class Potencia {
    
    
    public int metodoPotencia0(int base,int exponente){
        int resul=1;
         for (int exp = 0; exp < exponente; exp++) 
              resul=resul*base;
              
        
        return  resul;
    }
    
    public int metodoPotencia1(int base,int exponente){
        int result=1,cont=0;
        while(cont<exponente){
           result= result*base; 
           cont++;
        }
        return result;
    }
     public int metodoPotencia2(int base,int exponente){
         int result = 1, cont = 0;
         do {
             if (exponente != 0) {
                 result = result * base;
                 cont++;
             } 
                 
             
           
         } while (exponente < cont);

         return result;
    }
    
}

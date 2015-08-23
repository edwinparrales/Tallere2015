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
public class Operaciones {
    
    
    public int potencia(int base,int exponente){
        int resul=1;
         for (int exp = 0; exp < exponente; exp++) 
              resul=resul*base;
              
        
        return  resul;
    }
    
    public int potencia1(int base,int exponente){
        int result=1,cont=0;
        while(cont<exponente){
           result= result*base; 
           cont++;
        }
        return result;
    }
    
}

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
public class EdadPersona {
    private int[]edades;
    private int edadMedia;
    private int edadMax;
    private int edadMin;
    private int cont;
    private int ed;
    private Scanner sc;
    
    

    public EdadPersona() {
        sc = new Scanner(System.in);
        edades= new int[4000];
        ed=0;
    }
   
    public void ingresoEdades() {
       

        for (int i = 0; i < edades.length; i++) {

            System.out.println(" !!! ingrese edad ¡¡¡");

            try {
                ed = sc.nextInt();
            } catch (Exception e) {
                System.out.println(" error" + e);
                break;
            }

            if (ed > 0) {
                edades[i] = ed;
                this.cont++;
            } else {
                break;
            }

        }

    }

    
    
    public int edadPromedio() {

        for (int i = 0; i < edades.length; i++) {
            if (edades != null) {

                this.edadMedia += edades[i];
               
            }
        }
        
      
        return edadMedia / this.cont;

    }

}

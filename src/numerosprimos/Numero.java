/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numerosprimos;

import javax.swing.JOptionPane;

/**
 *
 * @author carlo
 */
public class Numero {
    private int numero;
    
    
    
    
    public Numero(){
        this.numero=0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public void Operacion(){
        int div=12%3;
        System.out.println(div);
    }
    
    
    public int ObtenerPrimo(int numero){
        int contador=1;
        int capturar;
        int i=0;
        int mult=0;
        int div=0;
        while(numero!=0 ){
            
            
             div=numero/contador;
           // JOptionPane.showMessageDialog(null, div);
             capturar=div*contador;
               //JOptionPane.showMessageDialog(null,"div"+div+"contador"+contador+"="+capturar);
               
               if(capturar==numero){
                   i=i+1;
                //   JOptionPane.showMessageDialog(null, i);
               } 
               
               
            contador=contador+1;
            
           
            
            if(div==0){
                break;
            }
            
            
            
        }
        
        
  //  while(numero!=0){
        
        
     
    //    capturar=numero+contador;
  //      
        
 //       contador=contador+1;
 //   }
    
    
    
     return i;
    
    
    
    
    
    
    
    
}
}

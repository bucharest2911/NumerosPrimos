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
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Numero primo=new Numero();
        int numero=Integer.parseInt(JOptionPane.showInputDialog(null, "digite numero"));
   if(primo.ObtenerPrimo(numero)>2){
       JOptionPane.showMessageDialog(null, " NO ES PRIMO");
   }else{
             JOptionPane.showMessageDialog(null, "  ES PRIMO");
   }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid5code1b;

import javax.swing.JOptionPane;

/**
 *
 * @author Sassaki
 */
public class Unid5Code1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int x;
        String resp;
        
        resp = JOptionPane.showInputDialog("Digite um valor inteiro para x");
        x = Integer.parseInt(resp);
        
        JOptionPane.showMessageDialog(null, "O valor digitado foi: " + x);    
        
    }
    
}

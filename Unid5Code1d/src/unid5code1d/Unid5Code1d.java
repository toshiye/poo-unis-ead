/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid5code1d;

import java.util.Random;

/**
 *
 * @author Sassaki
 */
public class Unid5Code1d {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // bingo quando sortear o 13!
        int quantidade = 50;        
        Random sorteio = new Random();
        int sorteado = 0;
        
        while(quantidade > 0){
            sorteado = sorteio.nextInt(100) + 1;
            if (sorteado == 13) {
                System.out.println("Bingo!");
                quantidade = 0;
                System.out.println("Qtd Zerado");
            }
            quantidade--;
        }
        System.out.println("Fim do Jogo!!!");
    }
    
}

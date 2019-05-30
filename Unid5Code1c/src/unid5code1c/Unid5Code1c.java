/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid5code1c;

/**
 *
 * @author Sassaki
 */
public class Unid5Code1c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        int a;     
//         
//        a = 2;
//        
//        if (a > 3){
//            System.out.println("O a é maior que 3!");
//        } else {
//            System.out.println("O a é menor que 3!");
//        }
        
        String opcao;
        opcao = "aluno";        
        switch(opcao){
            case "aluno":
                System.out.println("O tipo da opção é Aluno.");
                break;
            case "professor":
                System.out.println("O tipo da opção é Professor.");
                break;
            case "secretaria":
                System.out.println("O tipo da opção é Secretaria.");
                break;
            default:
                System.out.println("O tipo da opção é Desconhecido.");
        }
    }
    
}

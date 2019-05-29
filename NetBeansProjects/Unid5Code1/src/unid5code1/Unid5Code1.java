/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unid5code1;

/**
 *
 * @author Sassaki
 */
public class Unid5Code1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empregado func = new Empregado();
        func.nome = "Sara";
        func.sobrenome = "Sassaki";
        func.matricula = 1;
        func.salario = 3534.77f;
        
        System.out.println("Nome do funcionário: " + func.nome + );
    }
    
}

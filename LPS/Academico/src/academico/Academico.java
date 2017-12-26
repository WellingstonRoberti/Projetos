/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academico;

import Frames.Menu;
import java.util.Scanner;

/**
 *
 * @author Junim Roberti
 */
public class Academico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
            Menu menu = new Menu();
            menu.setLocationRelativeTo(null);
            menu.setDefaultCloseOperation(menu.EXIT_ON_CLOSE);
            menu.setVisible(true);
    }
    public void imprimir(Aluno aluno1, Curso curso1, Matricula matricula1){
        int opcao = 1;
        Scanner scanner = new Scanner(System.in);
        while(opcao != 0){
            System.out.println("\nSelecione uma opcao: \n0-Sair\n1-Imprimir Aluno\n2-Imprimir Curso\n3-Imprimir Matricula");
            opcao = scanner.nextInt();            
            switch(opcao){
                    case 0: break;
                    case 1:  
                        for (int i = 0; i < aluno1.getArrayAluno().size(); i++)
                           aluno1.imprimirAluno(aluno1.getArrayAluno().get(i));                          
                        break;
                    case 2:
                        for (int i = 0; i < curso1.getArrayCurso().size(); i++)
                           curso1.imprimirCurso(curso1.getArrayCurso().get(i));      
                        break;
                    case 3:
                        for (int i = 0; i < matricula1.getArrayMatricula().size(); i++)
                            matricula1.imprimirMatricula(matricula1.getArrayMatricula().get(i));                      
                        break;
            }
        }        
    }
               
    
}

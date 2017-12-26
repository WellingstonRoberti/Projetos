/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemamatricula;

/**
 *
 * @author junimRoberti
 */
public class SistemaMatricula {

    
    public static void main(String[] args) {
        Aluno Aluno[];
        Aluno = new Aluno[6];
        Aluno Leticia = new Aluno(1234,"Leticia", 23213123); // Instanciando os alunos
        Aluno[0] = Leticia;
        Aluno Renan = new Aluno(2323,"Renan", 233545355); 
        Aluno[1] = Renan;
        Aluno Pablo = new Aluno(9876,"Pablo", 23098764); 
        Aluno[2] = Pablo;
        Aluno Junior = new Aluno(1984,"Junior", 2654954); 
        Aluno[3] = Junior;
        Aluno Beto = new Aluno(6544,"Beto", 0344751); 
        Aluno[4] = Beto;
        Aluno Gabriel = new Aluno(3456,"Gabriel", 290475); 
        Aluno[5] = Gabriel;
        Curso Curso;
        Curso Algoritimos = new Curso (001,"Algoritimos", 66);
        Curso Grafos = new Curso (002,"Grafos", 66);
        Curso Compiladores = new Curso (003,"Compiladores", 99);
        
        Matricular.realizaMatricula(int numeroMatricula, String nomeAluno, String nomeCurso);
    }
    
}

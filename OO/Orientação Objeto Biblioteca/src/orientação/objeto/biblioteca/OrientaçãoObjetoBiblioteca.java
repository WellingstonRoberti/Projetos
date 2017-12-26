/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientação.objeto.biblioteca;
import java.util.Scanner;
/**
 *
 * @author junimRoberti
 */
public class OrientaçãoObjetoBiblioteca {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alunos Alunos[];
        Alunos = new Alunos[5];
        Professor Professor[];
        Professor = new Professor[5];
        Livros Livros[];
        Livros= new Livros[5];
        Artigo Artigo[];
        Artigo= new Artigo[5];
        Revista Revista[];
        Revista = new Revista[5];
        //criação das variaveis
        Alunos Leticia = new Alunos(1234,"Leticia", 23, 43561234,"Ruasambou", 1, 564321);
        Alunos Junim = new Alunos(2345,"Junim", 23, 82739454,"Av. cascalha", 1, 768974);
        Alunos Alessandra = new Alunos(3456,"Alessandra", 25, 8765432, "Ruacascata", 1, 765436);
        Alunos Mauricio = new Alunos(4567,"Mauricio", 21, 89298647,"Ruaavenida", 1, 987123);     
        Alunos Gabriel = new Alunos(5678, "Gabriel", 20, 87628942, "Avenidacascalha", 1, 897123);     
        Professor George = new Professor(6789,"George", 35, 87612356,"Ruapenido", 2);
        Professor Alex = new Professor(7890,"Alex",40,9812736,"Avenidarua", 2);   
        Professor Lucas = new Professor(8901,"Lucas", 30, 97312984,"Ruapenido" ,2);
        Professor Flavio = new Professor(9012, "Flavio", 43, 89712354,"Ruasouza", 2);  
        Professor ZeRui = new Professor(0123,"ZeRui", 33, 98719834, "Ruaavenida", 2);
        Livros GOT = new Livros(2312,"GameOfthrones", 1,"George M.M","Abril",2016, 10, 1);
        Livros ASombra = new Livros(6322,"ASombadaSerpente", 1,"Rick","Abril",2016, 10, 1);
        Livros AeD = new Livros(7653,"AnjoseDemonios", 4,"DanBrown","Abril",2016, 10, 1);
        Livros OCodigo = new Livros(7644,"OCodigoDaVinci",2,"DanBrown","Abril",2016, 10, 1);
        Livros Fortaleza = new Livros(1235,"FortalezaDigital", 3,"DanBrown","Abril",2016, 10, 1);
        Artigo CG = new Artigo(10, 5573,"ComputaçãoGrafica", 1,"AlessandraMartins", 1);
        Artigo Processamento = new Artigo(10, 2352,"ProcessamentodeImagens", 1,"LucasLattari", 1);
        Artigo Rift = new Artigo(10, 2312,"OculusRift", 1,"AlexMachado", 1);       
        Artigo IA = new Artigo(10, 9421, "InteligenciaArtificial", 1,"AlexMachado", 1);      
        Artigo APA = new Artigo(10, 7345,"AnalisedeProjetosdeAlgoritmos", 1,"RuiBarbosa", 1);    
        Revista Veja = new Revista(9873, "Veja", 2, 13, 2015,1);       
        Revista Capricho = new Revista(9833, "Capricho", 2, 13, 2015,1);
        Revista Caras = new Revista(9813, "Caras", 2, 13, 2013,1);
        Revista Catraca = new Revista(9773, "Catraca", 2, 9, 2015,1);
        Revista Raika = new Revista(9874, "Raika", 2, 10, 2016,1);
        //preenchendo o vetor de alunos
        Alunos[0] = Leticia;
        Alunos[1] = Junim;
        Alunos[2] = Alessandra;
        Alunos[3] = Mauricio;
        Alunos[4] = Gabriel;
        //preenchendo o vetor de professores
        Professor[0] = George;
        Professor[1] = Alex;
        Professor[2] = Lucas;
        Professor[3] = Flavio;
        Professor[4] = ZeRui;
        //preenchendo o vetor de livros
        Livros[0] = GOT;
        Livros[1] = ASombra;
        Livros[2] = AeD;
        Livros[3] = OCodigo;
        Livros[4] = Fortaleza;
        //preenchendo o vetor de artigos
        Artigo[0] = CG;
        Artigo[1] = Processamento;
        Artigo[2] = Rift;
        Artigo[3] = IA;
        Artigo[4] = APA;
        //preenchendo o vetor de revistas
        Revista[0] = Veja;
        Revista[1] = Capricho;
        Revista[2] = Caras;
        Revista[3] = Catraca;
        Revista[4] = Raika;
        Scanner scanner = new Scanner(System.in);
        int numDeMatr, dataDeEmpDia, dataDeEmpMes, dataDeEmpAno;
        String nomedoliv;
        int opcao = -1;
        Emprestimo emprestimo;
        emprestimo = new Emprestimo();
        boolean saida = true;
        while(saida == true){
            System.out.println("------------------------------------");
            System.out.println("1- Emprestimo de livro.");
            System.out.println("2- Emprestimo de Artigo.");
            System.out.println("3- Emprestimo de Revista.");
            System.out.println("4- Devolução de livro.");
            System.out.println("5- Devolução de Artigo.");
            System.out.println("6- Devolução de Revista.");
            System.out.println("0- Sair.");
            System.out.println("------------------------------------");                    
            try{
            opcao = scanner.nextInt();
            }
            catch(Exception e){
                System.out.println("só aceita inteiros." + e);
            }
            switch (opcao){
                case 0:
                    saida = false;
                    break;
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Digite o numero de Matricula do Aluno ou o Codigo do Professor:");
                    numDeMatr = scanner.nextInt();
                    System.out.println("Digite o dia do Emprestimo:");
                    dataDeEmpDia = scanner.nextInt();
                    System.out.println("Digite o mês do Emprestimo:");
                    dataDeEmpMes = scanner.nextInt();
                    System.out.println("Digite o Ano do Emprestimo:");
                    dataDeEmpAno = scanner.nextInt();
                    System.out.println("Digite o nome do livro a ser emprestado:");
                    nomedoliv = scanner.next();     
                    for(int h = 0; h<5;h++){
                        emprestimo.realizaemprestimo(numDeMatr, dataDeEmpDia, dataDeEmpMes, dataDeEmpAno, nomedoliv, Livros[h]);
                    }
                    break;
                case 2:
                    System.out.println("------------------------------------");
                    System.out.println("Digite o numero de Matricula do Aluno ou o Codigo do Professor:");
                    numDeMatr = scanner.nextInt();
                    System.out.println("Digite o dia do Emprestimo:");
                    dataDeEmpDia = scanner.nextInt();
                    System.out.println("Digite o mês do Emprestimo:");
                    dataDeEmpMes = scanner.nextInt();
                    System.out.println("Digite o Ano do Emprestimo:");
                    dataDeEmpAno = scanner.nextInt();
                    System.out.println("Digite o nome do livro a ser emprestado:");
                    nomedoliv = scanner.next();     
                    for(int h = 0; h<5;h++){
                        emprestimo.realizaemprestimo(numDeMatr, dataDeEmpDia, dataDeEmpMes, dataDeEmpAno, nomedoliv, Artigo[h]);
                    }
                    break;
                case 3:
                    System.out.println("------------------------------------");
                    System.out.println("Digite o numero de Matricula do Aluno ou o Codigo do Professor:");
                    numDeMatr = scanner.nextInt();
                    System.out.println("Digite o dia do Emprestimo:");
                    dataDeEmpDia = scanner.nextInt();
                    System.out.println("Digite o mês do Emprestimo:");
                    dataDeEmpMes = scanner.nextInt();
                    System.out.println("Digite o Ano do Emprestimo:");
                    dataDeEmpAno = scanner.nextInt();
                    System.out.println("Digite o nome do livro a ser emprestado:");
                    nomedoliv = scanner.next();     
                    for(int h = 0; h<5;h++){
                        emprestimo.realizaemprestimo(numDeMatr, dataDeEmpDia, dataDeEmpMes, dataDeEmpAno, nomedoliv, Revista[h]);
                    }
                    break;
                case 4:
                    System.out.println("------------------------------------");
                    System.out.println("Digite o nome do livro a ser devolvido");
                    nomedoliv = scanner.next();
                    for(int k =0; k<5;k++)
                        if(Livros[k].VerificaLivros(nomedoliv) == 1){
                            emprestimo.realizadevolucaoLivro(Livros[k]);
                        }
                    break;
                case 5:
                    System.out.println("------------------------------------");
                    System.out.println("Digite o nome do livro a ser devolvido");
                    nomedoliv = scanner.next();
                    for(int k =0; k<5;k++)
                        if(Artigo[k].VerificaArtigos(nomedoliv) == 1){
                            emprestimo.realizadevolucaoArtigo(Artigo[k]);
                        }
                    break;
                case 6:
                    System.out.println("------------------------------------");
                    System.out.println("Digite o nome do livro a ser devolvido");
                    nomedoliv = scanner.next();
                    for(int k =0; k<5;k++)
                        if(Revista[k].VerificaRev(nomedoliv) == 1){
                            emprestimo.realizadevolucaoRev(Revista[k]);
                        }
                    break;
                default:
                    System.out.println("Este não é uma opção válida!");
            }
        }
    }
}

        
    


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package astarsearchalgo;

/**
 *
 * @author Junim Roberti
 */

import static astarsearchalgo.Menu.menu;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AstarSearchAlgo{
public static int x,s,r,c = 0,cont = 0;


        //h scores is the stright-line distance from the current city to Bucharest
        public static void main(String[] args) throws FileNotFoundException{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite a quantidade de cidades do mapa:");
            x = scanner.nextInt();
            double[][] distancia = new double[x][x];
            String[] vet = new String[x];
            double[] vetheu = new double[x];
            Scanner cid = new Scanner(new FileReader("cid.txt")).useDelimiter(" "); 
             while(cid.hasNext()){
                vet[c] = cid.next();
                c++;
            }
           try
           {
            Scanner valor = new Scanner(new FileReader("mat.txt")).useDelimiter(" ");
                int conv;
             while(valor.hasNext()){
                 for(int linha = 0; linha < x; linha++)
                     for(int coluna = 0; coluna < x; coluna++){
                        conv = valor.nextInt();
                        distancia[linha][coluna] = conv;
                  // distancia[linha][coluna] = valor.nextInt();
                    }
            }
           }
           catch(InputMismatchException erro){
               System.out.println(" ");
           }
           /*for(int q = 0; q < x;q++){
                    System.out.print(vet[0]);      
                }
            /*
             for(int i = 0;i < 14;i++){
                for(int j = 0;j < 14;j++){
                    if(j == 13){
                       System.out.print(distancia[i][j]+"\n");
                   }else{
                   System.out.print(distancia[i][j]+" ");
                   }
               }
            }*/
           
           
            int[] quant = new int[x];
            for(s = 0;s<x;s++){
                for(r = 0;r<x;r++){
                    if(distancia[s][r] != 0){   
                       quant[s]++;
                    }
                   
                }   
                //System.out.print(quant[s]);
            }
            Node[] cidade = new Node[x];
            for(int q = 0; q<x;q++){
                    cidade[q] = new Node(vet[q],0);        
                    }
                    for(s = 0;s<x;s++){
                        Edge[] edge = new Edge[quant[s]];
                        for(int f = 0;f < x; f++){
                                if(distancia[s][f] != 0){
                                    edge[cont] = new Edge(cidade[f],distancia[s][f]);
                                    cont++;
                                }
                            }
                        cidade[s].adjacencies = edge;
                        cont = 0;
                    }
            System.out.println("Digite as cidades de inicio e destino desejadas:");
                String nome1 = scanner.next();
                String nome2 = scanner.next();
                int aux1 = 0, aux2 = 0;
                for(int k = 0; k < x;k++){
                    if(nome1 == null ? vet[k] == null : nome1.equals(vet[k])){
                        aux1 = k;
                    }
                    if(nome2 == null ? vet[k] == null : nome2.equals(vet[k]))
                        aux2 = k;
                }
                //AEstrela(cidade[aux1],cidade[aux2]);
            for(int j =0; j<x; j++ ){
                AEstrela(cidade[aux2],cidade[j]);
                List<Node> path1 = imprimirCaminho(cidade[j]);
                vetheu[j] = path1.size() - 1;
                
            }
            double menor = 99999;
            for(int j =0; j<x; j++ ){
                for(int i =0; i<x; i++ ){
                    if(distancia[i][j] != 0 && distancia[i][j]< menor){
                        menor = distancia[i][j];
                    }
                }
            }
            
            
            for(int j =0; j<x; j++ ){
                vetheu[j] = menor * vetheu[j] ;
            }
           /* vetheu[0] = 366;
            vetheu[1] = 374;
            vetheu[2] = 380;
            vetheu[3] = 253;
            vetheu[4] = 178;
            vetheu[5] = 193;          
            vetheu[6] = 98;
            vetheu[7] = 329;
            vetheu[8] = 244;
            vetheu[9] = 241;
            vetheu[10] = 242;
            vetheu[11] = 160;
            vetheu[12] = 0;
            vetheu[13] = 77;*/
            
            
            menu();
            
            int op = scanner.nextInt();
            switch(op){
                case 1:
                    for(int q = 0; q < x;q++){
                    cidade[q] = new Node(vet[q],vetheu[q]);
                     
                    }
                    for(s = 0;s<x;s++){
                        Edge[] edge = new Edge[quant[s]];
                        for(int f = 0;f < x; f++){
                                if(distancia[s][f] != 0){
                                    edge[cont] = new Edge(cidade[f],distancia[s][f]);
                                   cont++;
                                }
                            }
                        cidade[s].adjacencies = edge;
                        cont = 0;
                    }
                break;
                case 2:
                    for(int q = 0; q<x;q++){
                        cidade[q] = new Node(vet[q],vetheu[q]);        
                    }
                    for(s = 0;s<x;s++){
                        Edge[] edge = new Edge[quant[s]];
                        for(int f = 0;f < x; f++){
                                if(distancia[s][f] != 0){
                                    edge[cont] = new Edge(cidade[f],0);
                                    cont++;
                                }
                            }
                        cidade[s].adjacencies = edge;
                        cont = 0;
                    }
                break;
                case 3:
                    for(int q = 0; q<x;q++){
                    cidade[q] = new Node(vet[q],0);        
                    }
                    for(s = 0;s<x;s++){
                        Edge[] edge = new Edge[quant[s]];
                        for(int f = 0;f < x; f++){
                                if(distancia[s][f] != 0){
                                    edge[cont] = new Edge(cidade[f],distancia[s][f]);
                                    cont++;
                                }
                            }
                        cidade[s].adjacencies = edge;
                        cont = 0;
                    }
                break;
                default:
                }
                
                AEstrela(cidade[aux1],cidade[aux2]);

                List<Node> caminho = imprimirCaminho(cidade[aux2]);

                
                System.out.println("Caminho: " + caminho);
                double impricusto, impricusto2;
                 impricusto2 = imprimirCustoHeu(cidade[aux2],vet,distancia, vetheu); 
                 if (op == 3 || op == 1){
                 System.out.println("Custo: " + cidade[aux2].g_scores); 
                 }
                if (op == 2){                                 
                 System.out.println("Custo: " + impricusto2);
                }

        }

        public static List<Node> imprimirCaminho(Node target){
                List<Node> path = new ArrayList<>();
        
        for(Node node = target; node!=null; node = node.parent){
            path.add(node);
        }

        Collections.reverse(path);

        return path;
        }
        
    public static double imprimirCustoA(Node target){
                double cust = 0;
        
        for(Node node = target; node!=null; node = node.parent){
           cust = cust + node.g_scores + node.h_scores;            
   
        }         

        return cust;
        }
      public static double imprimirCustoHeu(Node target, String[] vet, double[][] distancia, double[] vetheu){
                double cust = 0;
        for(Node node = target; node!=null; node = node.parent){
            cust  = cust + node.h_scores;            
        }
        return cust;
        }
        

        public static void AEstrela(Node source, Node goal){

                Set<Node> explored = new HashSet<>();

                PriorityQueue<Node> queue = new PriorityQueue<>(20, (Node i, Node j) -> {
                    if(i.f_scores > j.f_scores){
                        return 1;
                    }

                    else if (i.f_scores < j.f_scores){
                        return -1;
                    }

                    else{
                        return 0;
                    }
                } //override compare method
                );

                //cost from start
                source.g_scores = 0;

                queue.add(source);

                boolean found = false;

                while((!queue.isEmpty())&&(!found)){

                        //the node in having the lowest f_score value
                        Node current = queue.poll();

                        explored.add(current);

                        //goal found
                        if(current.value.equals(goal.value)){
                                found = true;
                        }

                        //check every child of current node
                        for(Edge e : current.adjacencies){
                                Node child = e.target;
                                double cost = e.cost;
                                double temp_g_scores = current.g_scores + cost;
                                double temp_f_scores = temp_g_scores + child.h_scores;


                                /*if child node has been evaluated and 
                                the newer f_score is higher, skip*/
                                
                                if((explored.contains(child)) && 
                                        (temp_f_scores >= child.f_scores)){
                                }

                                /*else if child node is not in queue or 
                                newer f_score is lower*/
                                
                                else if((!queue.contains(child)) || 
                                        (temp_f_scores < child.f_scores)){

                                        child.parent = current;
                                        child.g_scores = temp_g_scores;
                                        child.f_scores = temp_f_scores;

                                        if(queue.contains(child)){
                                                queue.remove(child);
                                        }

                                        queue.add(child);

                                }

                        }

                }

        }
        
}

class Node{

        public final String value;
        public double g_scores;
        public final double h_scores;
        public double f_scores = 0;
        public Edge[] adjacencies;
        public Node parent;

        public Node(String val, double hVal){
                value = val;
                h_scores = hVal;
        }

        @Override
        public String toString(){
                return value;
        }

}

class Edge{
        public final double cost;
        public final Node target;

        public Edge(Node targetNode, double costVal){
                target = targetNode;
                cost = costVal;
        }
}

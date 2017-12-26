/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author junimRoberti
 */
import java.util.*;
import java.util.Scanner;

abstract class HuffmanArvore implements Comparable<HuffmanArvore> {
    public final int freq;
    //
    public HuffmanArvore(int freq) { 
    	this.freq = freq; 
    }
    @Override
    public int compareTo(HuffmanArvore arvore) {
        return freq - arvore.freq;
    }
}
class HuffmanFolha extends HuffmanArvore {
    public final char letra; 
 
    public HuffmanFolha(int freq, char letra) {
        super(freq);
        this.letra = letra;
    }
}
class HuffmanNodo extends HuffmanArvore {
    public final HuffmanArvore esquerda, direita;
 
    public HuffmanNodo(HuffmanArvore l, HuffmanArvore r) {
        super(l.freq + r.freq);
        esquerda = l;
        direita = r;
    }
}
public class Huffman {
	
	public static void main(String[] args) {
        System.out.println("Digite a palavra que será compactada:");
        Scanner scanner = new Scanner(System.in);
        String palavra = scanner.next();
        int[] charFreqs = new int[256];
        for (char c : palavra.toCharArray()){
            charFreqs[c]++;
        }
        HuffmanArvore arvore = construirArvore(charFreqs);
        
       
        System.out.println("\nTABELA DE CÓDIGOS");
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("Símbolo        ");
        printCodigosValor(arvore, new StringBuffer());
        System.out.print("\nQuantidade     ");
        printCodigosFrequencia(arvore, new StringBuffer());
        System.out.print("\nHuffman código ");
        printCodigosPrefixo(arvore, new StringBuffer());
        System.out.println("\n---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        
        String codificar = codificar(arvore,palavra);
       
        System.out.println("\nCodigo do texto compactado");
        System.out.println(codificar); 

    }
    public static HuffmanArvore construirArvore(int[] charFreqs) {
    	
        PriorityQueue<HuffmanArvore> arvores = new PriorityQueue<>();
        for (int i = 0; i < charFreqs.length; i++){
            if (charFreqs[i] > 0)
                arvores.offer(new HuffmanFolha(charFreqs[i], (char)i)); 
        }
        
        while (arvores.size() > 1) {
            
            HuffmanArvore a = arvores.poll(); 
            HuffmanArvore b = arvores.poll(); 
            arvores.offer(new HuffmanNodo(a, b)); 
        }
        return arvores.poll();
    }
    public static String codificar(HuffmanArvore arvore, String codificar){
    	assert arvore != null;
    	
    	String codificarTexto = "";
        for (char c : codificar.toCharArray()){
        	codificarTexto+=(getCodigos(arvore, new StringBuffer(),c));
        }
    	return codificarTexto;
    }
    
    public static void printCodigosValor(HuffmanArvore arvore, StringBuffer prefixo) {
        assert arvore != null;
        
        if (arvore instanceof HuffmanFolha) {
            HuffmanFolha folha = (HuffmanFolha)arvore;
            System.out.print("\t" + folha.letra);
            
 
        } else if (arvore instanceof HuffmanNodo) {
            HuffmanNodo nodo = (HuffmanNodo)arvore;
 

            prefixo.append('0');
            printCodigosValor(nodo.esquerda, prefixo);
            prefixo.deleteCharAt(prefixo.length()-1);
 
            
            prefixo.append('1');
            printCodigosValor(nodo.direita, prefixo);
            prefixo.deleteCharAt(prefixo.length()-1);
        }
    }
    public static void printCodigosFrequencia(HuffmanArvore arvore, StringBuffer prefixo) {
        assert arvore != null;
        
        if (arvore instanceof HuffmanFolha) {
            HuffmanFolha folha = (HuffmanFolha)arvore;
            
            System.out.print("\t" + folha.freq);
            
 
        } else if (arvore instanceof HuffmanNodo) {
            HuffmanNodo nodo = (HuffmanNodo)arvore;
 

            prefixo.append('0');
            printCodigosFrequencia(nodo.esquerda, prefixo);
            prefixo.deleteCharAt(prefixo.length()-1);
 
            
            prefixo.append('1');
            printCodigosFrequencia(nodo.direita, prefixo);
            prefixo.deleteCharAt(prefixo.length()-1);
        }
    }
    public static void printCodigosPrefixo(HuffmanArvore arvore, StringBuffer prefixo) {
        assert arvore != null;
        
        if (arvore instanceof HuffmanFolha) {
            HuffmanFolha folha = (HuffmanFolha)arvore;
            
            System.out.print("\t" + prefixo);
            
            
 
        } else if (arvore instanceof HuffmanNodo) {
            HuffmanNodo nodo = (HuffmanNodo)arvore;
 

            prefixo.append('0');
            printCodigosPrefixo(nodo.esquerda, prefixo);
            prefixo.deleteCharAt(prefixo.length()-1);
 
            
            prefixo.append('1');
            printCodigosPrefixo(nodo.direita, prefixo);
            prefixo.deleteCharAt(prefixo.length()-1);
        }
    }
    
    public static String getCodigos(HuffmanArvore arvore, StringBuffer prefixo, char w) {
        assert arvore != null;
        
        if (arvore instanceof HuffmanFolha) {
            HuffmanFolha folha = (HuffmanFolha)arvore;
            
            
            if (folha.letra == w ){
            	return prefixo.toString();
            }
            
        } else if (arvore instanceof HuffmanNodo) {
            HuffmanNodo nodo = (HuffmanNodo)arvore;
 
            
            prefixo.append('0');
            String esquerda = getCodigos(nodo.esquerda, prefixo, w);
            prefixo.deleteCharAt(prefixo.length()-1);
 
            
            prefixo.append('1');
            String direita = getCodigos(nodo.direita, prefixo,w);
            prefixo.deleteCharAt(prefixo.length()-1);
            
            if (esquerda==null) return direita; else return esquerda;
        }
		return null;
    }

}

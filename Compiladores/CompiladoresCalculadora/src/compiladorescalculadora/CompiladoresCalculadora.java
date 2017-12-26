/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compiladorescalculadora;


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Junim Roberti
 */

public class CompiladoresCalculadora {
    private static String transicao;
    public static String[] palavrasReservadas = {"inicio", "float", "int", "+", "-", "*", "/", "(", ")", ";", "=", "$"};
    public static String analiseLexica(String palavra) {
        for (int i = 0; i < palavrasReservadas.length;i++){
            String x = palavrasReservadas[i];
            if (palavra.equals(x)) {
                if (i == 0){
                    return "<KW_INICIO>";
                }
                if (i == 1){
                    return " <KW_FLOAT>";
                }
                if (i == 2){
                    return " <KW_INT>";
                }
                if (i == 3){
                    return " <OP_SOMA>";
                }
                if (i == 4){
                    return " <OP_SUB>";
                }
                if (i == 5){
                    return " <OP_MULT>";
                }
                if (i == 6){
                    return " <OP_DIV>";
                }
                if (i == 7){
                    return " <KW_PARENT_E>";
                }
                if (i == 8){
                    return " <KW_PARENT_D>";
                }
                if (i == 9){
                    return " <KW_PV>";
                }
                if (i == 10){
                    return " <OP_IGUAL>";
                }
                if (i == 11){
                    return " <KW_CIFRAO>";
                }                
                return "";
            }
        }
        if (palavra.matches("[0-9][0-9]*[.]{0,1}[0-9][0-9]*")) {
            return " <NUM>";
        }
        if(palavra.matches("[0-9]")){
            return " <NUM>";
        }
        if (palavra.matches("[0-9][A-z]*")) {
            return "";
        }
        if (palavra.matches("[A-z]{1,1}[A-z0-9]*")) {
            return " <IDENT>";
        }
        if (palavra.matches("[/]{1,1}[*]{1,1}.*[*]{1,1}[/]{1,1}")) {
            return " <COMENTARIO>";
        }
        return "";
    }
    
    
    
    public static String analiseSemanticaTipo(String palavra) {
        //{"inicio", "float", "int", "+", "-", "*", "/", "(", ")", ";", "=", "$"}
        for (int i = 0; i < palavrasReservadas.length;i++){
            String x = palavrasReservadas[i];
            if (palavra.equals(x)) {
                if (i == 0){
                    return "void";
                }
                if (i == 1){
                    return "float";
                }
                if (i == 2){
                    return "int";
                }
                if (i == 3){
                    return "-";
                }
                if (i == 4){
                    return "-";
                }
                if (i == 5){
                    return "-";
                }
                if (i == 6){
                    return "-";
                }
                if (i == 7){
                    return "-";
                }
                if (i == 8){
                    return "-";
                }
                if (i == 9){
                    return "-";
                }
                if (i == 10){
                    return "-";
                }
                if (i == 11){
                    return "-";
                }                
                return "";
            }
        }
        if (palavra.matches("[0-9][0-9]*[.]{0,1}[0-9][0-9]*")) {
            return "-";
        }
        if(palavra.matches("[0-9]")){
            return "-";
        }
        if (palavra.matches("[0-9][A-z]*")) {
            return "";
        }
        if (palavra.matches("[A-z]{1,1}[A-z0-9]*")) {
            return "int";
        }
        if (palavra.matches("[/]{1,1}[*]{1,1}.*[*]{1,1}[/]{1,1}")) {
            return "-";
        }
        return "";
    }
    public static String analiseSemanticaToken(String palavra) {
        //{"inicio", "float", "int", "+", "-", "*", "/", "(", ")", ";", "=", "$"}
        for (int i = 0; i < palavrasReservadas.length;i++){
            String x = palavrasReservadas[i];
            if (palavra.equals(x)) {
                if (i == 0){
                    return "inicio";
                }
                if (i == 1){
                    return "id";
                }
                if (i == 2){
                    return "id";
                }
                if (i == 3){
                    return "operad";
                }
                if (i == 4){
                    return "operad";
                }
                if (i == 5){
                    return "operad";
                }
                if (i == 6){
                    return "operad";
                }
                if (i == 7){
                    return "kw";
                }
                if (i == 8){
                    return "kw";
                }
                if (i == 9){
                    return "kw";
                }
                if (i == 10){
                    return "operad";
                }
                if (i == 11){
                    return "kw";
                }                
                return "";
            }
        }
        if (palavra.matches("[0-9][0-9]*[.]{0,1}[0-9][0-9]*")) {
            return "id";
        }
        if(palavra.matches("[0-9]")){
            return "id";
        }
        if (palavra.matches("[0-9][A-z]*")) {
            return "";
        }
        if (palavra.matches("[A-z]{1,1}[A-z0-9]*")) {
            return "id";
        }
        if (palavra.matches("[/]{1,1}[*]{1,1}.*[*]{1,1}[/]{1,1}")) {
            return "id";
        }
        return "";
    }
    public static String analiseSemanticaCategoria(String palavra) {
        //{"inicio", "float", "int", "+", "-", "*", "/", "(", ")", ";", "=", "$"}
        for (int i = 0; i < palavrasReservadas.length;i++){
            String x = palavrasReservadas[i];
            if (palavra.equals(x)) {
                if (i == 0){
                    return "func";
                }
                if (i == 1){
                    return "-";
                }
                if (i == 2){
                    return "-";
                }
                if (i == 3){
                    return "operad";
                }
                if (i == 4){
                    return "operad";
                }
                if (i == 5){
                    return "operad";
                }
                if (i == 6){
                    return "operad";
                }
                if (i == 7){
                    return "simbol";
                }
                if (i == 8){
                    return "simbol";
                }
                if (i == 9){
                    return "simbol";
                }
                if (i == 10){
                    return "operad";
                }
                if (i == 11){
                    return "simbol";
                }                
                return "";
            }
        }
        if (palavra.matches("[0-9][0-9]*[.]{0,1}[0-9][0-9]*")) {
            return "num";
        }
        if(palavra.matches("[0-9]")){
            return "num";
        }
        if (palavra.matches("[0-9][A-z]*")) {
            return "-";
        }
        if (palavra.matches("[A-z]{1,1}[A-z0-9]*")) {
            return "var";
        }
        if (palavra.matches("[/]{1,1}[*]{1,1}.*[*]{1,1}[/]{1,1}")) {
            return "coment";
        }
        return "";
    }
    public static String analiseSemanticaValor(String palavra) {
        //{"inicio", "float", "int", "+", "-", "*", "/", "(", ")", ";", "=", "$"}
        for (int i = 0; i < palavrasReservadas.length;i++){
            String x = palavrasReservadas[i];
            if (palavra.equals(x)) {
                if (i == 0){
                    return "-";
                }
                if (i == 1){
                    return "-";
                }
                if (i == 2){
                    return "-";
                }
                if (i == 3){
                    return "-";
                }
                if (i == 4){
                    return "-";
                }
                if (i == 5){
                    return "-";
                }
                if (i == 6){
                    return "-";
                }
                if (i == 7){
                    return "-";
                }
                if (i == 8){
                    return "-";
                }
                if (i == 9){
                    return "-";
                }
                if (i == 10){
                    return "-";
                }
                if (i == 11){
                    return "-";
                }                
                return "";
            }
        }
        if (palavra.matches("[0-9][0-9]*[.]{0,1}[0-9][0-9]*")) {
            return palavra;
        }
        if(palavra.matches("[0-9]")){
            return palavra;
        }
        if (palavra.matches("[0-9][A-z]*")) {
            return "";
        }
        if (palavra.matches("[A-z]{1,1}[A-z0-9]*")) {
            return "-";
        }
        if (palavra.matches("[/]{1,1}[*]{1,1}.*[*]{1,1}[/]{1,1}")) {
            return "-";
        }
        return "";
    }
    
    public static void main(String[] args){
        Scanner scanner1 = new Scanner(System.in);
        String aux;
        aux = scanner1.nextLine();
        //inicio int id ; id = id * id / id ; $
        String codigoPraCompilar[] = aux.split(" ");
        ArrayList<String> reduzir = new ArrayList<>();
        for(int i = 0; i < codigoPraCompilar.length;i++){
           reduzir.add(codigoPraCompilar[i]);
        }
        int j = 0;
        for (int i = 0; i < reduzir.size();i++){
            if(reduzir.get(i).startsWith("/*")){
                String test = reduzir.get(i);
               j = i;
                while(j != reduzir.size()){
                    test += " " + reduzir.get(j+1);
                    reduzir.remove(i);
                    reduzir.remove(i);
                    reduzir.add(i, test);
                    if(reduzir.get(j+1).endsWith("*/")){
                        test += " " + reduzir.get(j+1);
                        reduzir.remove((j+1));
                        reduzir.remove(i);
                        reduzir.add(i, test);
                        j = reduzir.size();
                        test = null;
                    }
               }
            }
        }
        for(int i =0; i <reduzir.size();i++)
            codigoPraCompilar[i] = reduzir.get(i);
        System.out.println("========================================");
        String aux2 = "";
        for (int i = 0; i < reduzir.size();i++){
            String x = codigoPraCompilar[i];
            //System.out.print(x + "\t -> ");
            if ("".equals(analiseLexica(x))) {
                System.out.print("Palavra Rejeitada");
            }else{
                aux2 = aux2 + analiseLexica(x);
            }
        }
        System.out.println(aux2);
        //for (int i = 0; i < reduzir.size();i++){
        //    System.out.print(reduzir.get(i)+"\n");
        //}
        String gramaticaAumentada[] = {"S", "PROGRAMA", "DECLARACAO", "DEC_VARIAVEL", "TIPO", "COMANDO", "EXP", "T", "F"};
        Stack pilha = new Stack();
        String token;
        Scanner scanner = new Scanner(aux2).useDelimiter(" ");
        token = scanner.next();
        for (int i = 0; i < 1000; i++) {
            pilha.push("NULL");
        }
        pilha.set(0, 0);
        int saida = 1;
        int linha = 0;
        int indice = 1;
        while (saida != 0) {
            switch (linha) {
                case 0:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                        }
                    System.out.println("");
                    //s2
                    if ("<KW_INICIO>".equals(token)) {
                        linha = 2;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    if ("PROGRAMA".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 1;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 1:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    if ("<KW_CIFRAO>".equals(token)) {
                        System.out.println("OK!");
                        System.out.println("");
                        saida = 0;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 2:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s6
                    if ("<KW_INT>".equals(token)) {
                        linha = 6;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s7
                    if ("<KW_FLOAT>".equals(token)) {
                        linha = 7;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    if ("DECLARACAO".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 3;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }
                    if ("DEC_VARIAVEL".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 4;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }
                    if ("TIPO".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 5;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 3:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //r1
                    if ("<KW_CIFRAO>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[1]);
                        int reduz = 4;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 4, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 5);
                        indice = indice - 3;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 4:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s10
                    if ("<IDENT>".equals(token)) {
                        linha = 10;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s6
                    if ("<KW_INT>".equals(token)) {
                        linha = 6;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s7
                    if ("<KW_FLOAT>".equals(token)) {
                        linha = 7;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    if ("TIPO".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 9;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }
                    if ("COMANDO".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 8;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 5:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s11
                    if ("<IDENT>".equals(token)) {
                        linha = 11;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 6:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                        System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //r5
                    if ("<IDENT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[4]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 7:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //r6
                    if ("<IDENT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 8:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s12
                    if ("<IDENT>".equals(token)) {
                        linha = 12;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //r2
                    if ("<KW_CIFRAO>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[2]);
                        int reduz = 4;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 4, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 5);
                        indice = indice - 3;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 9:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");                   
                    //s13
                    if ("<IDENT>".equals(token)) {
                        linha = 13;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 10:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s14
                    if ("<OP_IGUAL>".equals(token)) {
                        linha = 14;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 11:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                            System.out.println("");
                    //s15
                    if ("<KW_PV>".equals(token)) {
                        linha = 15;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 12:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s16
                    if ("<OP_IGUAL>".equals(token)) {
                        linha = 16;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 13:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s17
                    if ("<KW_PV>".equals(token)) {
                        linha = 17;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 14:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s22
                    if ("<IDENT>".equals(token)) {
                        linha = 22;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s21
                    if ("<KW_PARENT_E>".equals(token)) {
                        linha = 21;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s23
                    if ("<NUM>".equals(token)) {
                        linha = 23;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }                  
                    if ("T".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 19;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }
                    if ("EXP".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 18;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }
                    if ("F".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 20;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 15:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //r3
                    if ("<IDENT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[3]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r3
                    if ("<KW_INT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[3]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r3
                    if ("<KW_FLOAT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[3]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 16:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");;
                    //s22
                    if ("<IDENT>".equals(token)) {
                        linha = 22;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s21
                    if ("<KW_PARENT_E>".equals(token)) {
                        linha = 21;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s23
                    if ("<NUM>".equals(token)) {
                        linha = 23;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }                  
                    if ("T".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 19;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }
                    if ("EXP".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 24;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }
                    if ("F".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 20;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 17:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //r4
                    if ("<IDENT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[3]);
                        int reduz = 8;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 8, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 9);
                        indice = indice - 7;
                        break;
                    }
                    //r4
                    if ("<KW_INT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[3]);
                        int reduz = 8;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 8, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 9);
                        indice = indice - 7;
                        break;
                    }
                    //r4
                    if ("<KW_FLOAT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[3]);
                        int reduz = 8;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 8, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 9);
                        indice = indice - 7;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 18:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s25
                    if ("<KW_PV>".equals(token)) {
                        linha = 25;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s26
                    if ("<OP_SOMA>".equals(token)) {
                        linha = 26;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s27
                    if ("<OP_SUB>".equals(token)) {
                        linha = 27;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 19:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+ " ");
                    }
                    System.out.println("");
                    //s28
                    if ("<OP_MULT>".equals(token)) {
                        linha = 28;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s29
                    if ("<OP_DIV>".equals(token)) {
                        linha = 29;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //r11
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r11
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r11
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r11
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 20:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");
                    //r14
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r14
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r14
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r14
                    if ("<OP_MULT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r14
                    if ("<OP_DIV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r14
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 21:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //s22
                    if ("<IDENT>".equals(token)) {
                        linha = 22;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s23
                    if ("<NUM>".equals(token)) {
                        linha = 23;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    if ("T".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 19;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }
                    if ("EXP".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 30;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }                    
                    if ("F".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 20;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 22:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                      
                    //r16
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r16
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r16
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r16
                    if ("<OP_MULT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r16
                    if ("<OP_DIV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r16
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 23:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");
                    //r17
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r17
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r17
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r17
                    if ("<OP_MULT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r17
                    if ("<OP_DIV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }
                    //r17
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 2;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 2, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 3);
                        indice = indice - 1;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 24:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");
                    //s31
                    if ("<KW_PV>".equals(token)) {
                        linha = 31;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s26
                    if ("<OP_SOMA>".equals(token)) {
                        linha = 26;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s27
                    if ("<OP_SUB>".equals(token)) {
                        linha = 27;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 25:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");
                    //r7
                    if ("<IDENT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[5]);
                        int reduz = 8;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 8, CompiladoresCalculadora.gettransicao());
                        linha = Integer.parseInt(pilha.get(indice - 9).toString());
                        indice = indice - 7;
                        break;
                    }
                    //r7
                    if ("<KW_CIFRAO>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[5]);
                        int reduz = 8;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 8, CompiladoresCalculadora.gettransicao());
                        linha = Integer.parseInt(pilha.get(indice - 9).toString());
                        indice = indice - 7;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 26:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");
                    //s22
                    if ("<IDENT>".equals(token)) {
                        linha = 22;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s21
                    if ("<KW_PARENT_E>".equals(token)) {
                        linha = 21;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s23
                    if ("<NUM>".equals(token)) {
                        linha = 23;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }                    
                    if ("T".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 32;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }                    
                    if ("F".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 20;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 27:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");
                    //s22
                    if ("<IDENT>".equals(token)) {
                        linha = 22;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s21
                    if ("<KW_PARENT_E>".equals(token)) {
                        linha = 21;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s23
                    if ("<NUM>".equals(token)) {
                        linha = 23;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }                    
                    if ("T".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 33;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }                    
                    if ("F".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 20;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 28:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //s22
                    if ("<IDENT>".equals(token)) {
                        linha = 22;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s21
                    if ("<KW_PARENT_E>".equals(token)) {
                        linha = 21;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s23
                    if ("<NUM>".equals(token)) {
                        linha = 23;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }                   
                    if ("F".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 34;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 29:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //s22
                    if ("<IDENT>".equals(token)) {
                        linha = 22;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s21
                    if ("<KW_PARENT_E>".equals(token)) {
                        linha = 21;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s23
                    if ("<NUM>".equals(token)) {
                        linha = 23;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }                    
                    if ("F".equals(CompiladoresCalculadora.gettransicao())) {
                        linha = 35;
                        pilha.set(indice, Integer.toString(linha));
                        indice++;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 30:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //s36
                    if ("<KW_PARENT_D>".equals(token)) {
                        linha = 36;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s26
                    if ("<OP_SOMA>".equals(token)) {
                        linha = 26;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s27
                    if ("<OP_SUB>".equals(token)) {
                        linha = 27;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 31:
                    for (int i = 0; i < 50; i++) {
                    if(pilha.get(i) != "NULL")
                        System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //r8
                    if ("<IDENT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 10;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 10, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 11);
                        indice = indice - 9;
                        break;
                    }
                    //r8
                    if ("<KW_CIFRAO>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 10;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 10, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 11);
                        indice = indice - 9;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 32:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //s28
                    if ("<OP_MULT>".equals(token)) {
                        linha = 28;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s29
                    if ("<OP_DIV>".equals(token)) {
                        linha = 29;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //r9
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r9
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r9
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r9
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        System.out.println(pilha.get(indice - 7));
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 33:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //s28
                    if ("<OP_MULT>".equals(token)) {
                        linha = 28;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //s29
                    if ("<OP_DIV>".equals(token)) {
                        linha = 29;
                        pilha.set(indice, token);
                        pilha.set(indice + 1, linha);
                        token = scanner.next();
                        indice = indice + 2;
                        break;
                    }
                    //r10
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r10
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r10
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r10
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[6]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 34:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //r12
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r12
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r12
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r12
                    if ("<OP_MULT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r12
                    if ("<OP_DIV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r12
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 35:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");                    
                    //r13
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r13
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r13
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r13
                    if ("<OP_MULT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r13
                    if ("<OP_DIV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r13
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[7]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
                case 36:
                    for (int i = 0; i < 50; i++) {
                        if(pilha.get(i) != "NULL")
                            System.out.print(pilha.get(i)+" ");
                    }
                    System.out.println("");
                    //r15
                    if ("<KW_PV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r15
                    if ("<OP_SOMA>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r15
                    if ("<OP_SUB>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r15
                    if ("<OP_MULT>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r15
                    if ("<OP_DIV>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }
                    //r15
                    if ("<KW_PARENT_D>".equals(token)) {
                        CompiladoresCalculadora.settransicao(gramaticaAumentada[8]);
                        int reduz = 6;
                        while (reduz != 0) {
                            pilha.set(indice - reduz, "NULL");
                            reduz--;
                        }
                        pilha.set(indice - 6, CompiladoresCalculadora.gettransicao());
                        linha = (int) pilha.get(indice - 7);
                        indice = indice - 5;
                        break;
                    }else{
                        System.out.println("Erro");
                        System.out.println("");
                        saida = 0;
                        break;
                    }
            }
        }
        /*for (int i = 0; i < 50; i++) {
            System.out.println(pilha.get(i));
        }*/
        //inicio int id ; id = ( id * id ) + ( 2 / id ) ; $
        System.out.println("========================================");
        System.out.println("CADEIA \tTOKEN \tCATEG \tTIPO \tVALOR");
        
        String co1 = "";
        String co2 = "";
        String co3 = "";
        String co4 = "";
        String co5 = "";
        /*String tabela[][] = null;
        
        for (int i = 0; i < reduzir.size() ; i++){
            String x = codigoPraCompilar[i];
            
            if ("".equals(analiseSemanticaTipo(x))) {
                System.out.print("Palavra Rejeitada");
            }
            if (tabela[i][0] == null) tabela[i][0] = x;
            if (tabela[i][1] == null) tabela[i][1] = analiseSemanticaToken(x);
            if (tabela[i][2] == null) tabela[i][2] = analiseSemanticaCategoria(x);
            if (tabela[i][3] == null) tabela[i][3] = analiseSemanticaTipo(x);
            if (tabela[i][4] == null) tabela[i][4] = analiseSemanticaValor(x);
            
            for(int k = 0; k<5; k++){
                if ("int".equals(tabela[i][k])) tabela[i+1][3] = "int";
                if ("float".equals(tabela[i][k])) tabela[i+1][3] = "float";
                if ("void".equals(tabela[i][k])) tabela[i+1][3] = "void";
            }
        }
        for(int i = 0; i < reduzir.size(); i++){
            
                System.out.print(tabela[i][0] + "\t" + tabela[i][1] + "\t" + tabela[i][2] + "\t" + tabela[i][3] + "\t" + tabela[i][4] + "\n");
        
        }*/
        
        
        for (int i = 0; i < reduzir.size();i++){
            String x = codigoPraCompilar[i];
            
            //System.out.print(x + "\t -> ");
            if ("".equals(analiseSemanticaTipo(x))) {
                System.out.print("Palavra Rejeitada");
            }else{
                co1 = x;
                co2 = analiseSemanticaToken(x);
                co3 = analiseSemanticaCategoria(x);
                co4 = analiseSemanticaTipo(x);
                co5 = analiseSemanticaValor(x);
                //aux3 = aux3 + analiseSemanticaTipo(x);
            }
            System.out.print(co1 + "\t" + co2 + "\t" + co3 + "\t" + co4 + "\t" + co5 + "\n");
        }
       
        //percorrer o array [inicio int id ; id = id * id / id ; $]
        //se já tiver sido usado.. ignorar
        //passar em todas as palavras (for de 0 até tamanho)
        //chamar vetor de 4 posições, cada posição chama uma função e recebe o que ela retorna
        //
        
        
        
    }

    /**
     * @return the transicao
     */
    public static String gettransicao() {
        return transicao;
    }

    /**
     * @param atransicao the transicao to set
     */
    public static void settransicao(String atransicao) {
        transicao = atransicao;
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.NotaFiscalDAO;
import Modelo.NotaFiscal;
import java.util.ArrayList;

/**
 *
 * @author Junim Roberti
 */
public class NotaFiscalControle {
    public int buscar(NotaFiscal notaFiscal){
        NotaFiscalDAO notaFiscalDAO = new NotaFiscalDAO();
        return notaFiscalDAO.buscar(notaFiscal);
    }
    public void cadastrar(NotaFiscal notaFiscal){
        NotaFiscalDAO notaFiscalDAO = new NotaFiscalDAO();
        notaFiscalDAO.adiciona(notaFiscal);
    }
    public ArrayList<NotaFiscal> buscarData(String dataCompra){
        NotaFiscalDAO notaFiscalDAO = new NotaFiscalDAO();
        return notaFiscalDAO.buscarData(dataCompra);
    }
    public ArrayList<NotaFiscal> popular(){
        NotaFiscalDAO notaFiscalDAO = new NotaFiscalDAO();
        return notaFiscalDAO.buscar(); 
    }
    public void remover(Object codigo){
        NotaFiscalDAO notaFiscalDAO = new NotaFiscalDAO();
        notaFiscalDAO.excluir(codigo);
    }
}

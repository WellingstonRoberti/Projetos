/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.VendaDAO;
import Modelo.Estoque;
import Modelo.Produto;
import Modelo.Venda;
import java.util.ArrayList;

/**
 *
 * @author Junim Roberti
 */
public class VendaControle {
    public int adicionar(Venda venda){
        VendaDAO vendaDAO = new VendaDAO();
        return vendaDAO.adiciona(venda);
    }
    public void finalizarVenda(ArrayList<Produto> arrayProduto, ArrayList<Estoque> arrayEstoque, int codigoVenda){
        VendaDAO vendaDAO = new VendaDAO();
        vendaDAO.realizaVenda(arrayProduto, arrayEstoque, codigoVenda);
    }
    public ArrayList<Venda> buscar(){
        VendaDAO vendaDAO = new VendaDAO();
        return vendaDAO.buscar();
    } 
    public ArrayList<Produto> buscarItem(){
        VendaDAO vendaDAO = new VendaDAO();
        return vendaDAO.buscaItem();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.EstoqueDAO;
import Modelo.Estoque;

/**
 *
 * @author Junim Roberti
 */
public class EstoqueControle {
    public int salvar(Estoque estoque){
        EstoqueDAO estoqueDAO = new EstoqueDAO();
        return estoqueDAO.adicionar(estoque);
    }
}

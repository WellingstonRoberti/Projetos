/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.LancamentoDAO;
import Modelo.Lancamento;
import Modelo.Microbacia;
import java.util.ArrayList;

/**
 *
 * @author junim
 */
public class LancamentoControle {
    public void cadastrarLancamento(Object obj, int codigo){
        LancamentoDAO lancamentoDAO = new LancamentoDAO();
        lancamentoDAO.Adicionar(obj, codigo);
    }
    public ArrayList<Lancamento> Buscar(){
        LancamentoDAO lancamentoDAO = new LancamentoDAO();        
        return lancamentoDAO.buscar();    
    }
    public ArrayList<Lancamento> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        LancamentoDAO lancamentoDAO = new LancamentoDAO();
        return lancamentoDAO.buscarPeloCodigo(micro);
    }
        public ArrayList<Lancamento> BuscarJtxt(String text) {
        LancamentoDAO lancamentoDAO = new LancamentoDAO();
        return lancamentoDAO.buscarJtxt(text);
    }
}

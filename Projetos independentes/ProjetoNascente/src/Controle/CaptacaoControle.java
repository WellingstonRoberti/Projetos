/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.CaptacaoDAO;
import Modelo.Captacao;
import Modelo.Microbacia;
import java.util.ArrayList;

/**
 *
 * @author junim
 */
public class CaptacaoControle {
    public void cadastrarCaptacao(Object obj, int codigo){
        CaptacaoDAO captacaoDAO = new CaptacaoDAO();
        captacaoDAO.Adicionar(obj, codigo);
    }
    public ArrayList<Captacao> Buscar(){
        CaptacaoDAO captacaoDAO = new CaptacaoDAO();
        return captacaoDAO.buscar();    
    }
    public ArrayList<Captacao> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        CaptacaoDAO captacaoDAO = new CaptacaoDAO();
        return captacaoDAO.buscarPeloCodigo(micro);
    }
        public ArrayList<Captacao> BuscarJtxt(String text) {
        CaptacaoDAO captacaoDAO = new CaptacaoDAO();
        return captacaoDAO.buscarJtxt(text);
    }
}

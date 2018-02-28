/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.MicrobaciaDAO;
import Modelo.Captacao;
import Modelo.Curral;
import Modelo.Lancamento;
import Modelo.Microbacia;
import Modelo.Nascentes;
import Modelo.ReservaLegal;
import Modelo.UsoDiferenciado;
import java.util.ArrayList;

/**
 *
 * @author junim
 */
public class MicrobaciaControle {
    public int CadastroMicro(Object obj){
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();
        return microbaciaDAO.adicionar(obj);
    }
    public Microbacia Buscar(int idMicro){
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();
        return microbaciaDAO.Buscar(idMicro);
    }
    public ArrayList<Microbacia> BuscarJtxt(String text){
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();
        return microbaciaDAO.buscarJtxt(text);
    }
    public void delete(Object obj) {
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();        
        microbaciaDAO.delete(obj);
    }
    public ArrayList<Microbacia> buscarPeloCodigo(ArrayList<Nascentes> micro) {
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();        
        return microbaciaDAO.buscarPeloCodigo(micro);
    }
    public ArrayList<Microbacia> buscarPeloCodigo1(ArrayList<Captacao> micro) {
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();        
        return microbaciaDAO.buscarPeloCodigo1(micro);
    }
    public ArrayList<Microbacia> buscarPeloCodigo2(ArrayList<Curral> micro) {
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();        
        return microbaciaDAO.buscarPeloCodigo2(micro);
    }
    public ArrayList<Microbacia> buscarPeloCodigo3(ArrayList<Lancamento> micro) {
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();        
        return microbaciaDAO.buscarPeloCodigo3(micro);
    }
    public ArrayList<Microbacia> buscarPeloCodigo4(ArrayList<ReservaLegal> micro) {
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();        
        return microbaciaDAO.buscarPeloCodigo4(micro);
    }
    public ArrayList<Microbacia> buscarPeloCodigo5(ArrayList<UsoDiferenciado> micro) {
        MicrobaciaDAO microbaciaDAO = new MicrobaciaDAO();        
        return microbaciaDAO.buscarPeloCodigo5(micro);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.ReservaLegalDAO;
import Modelo.Microbacia;
import Modelo.ReservaLegal;
import java.util.ArrayList;

/**
 *
 * @author junim
 */
public class ReservaLegalControle {
    public void cadastrarReservaLegal(Object obj, int codigo){
        ReservaLegalDAO reservaLegalDAO = new ReservaLegalDAO();
        reservaLegalDAO.Adicionar(obj, codigo);
    }
    public ArrayList<ReservaLegal> Buscar(){
        ReservaLegalDAO reservaLegalDAO = new ReservaLegalDAO();        
        return reservaLegalDAO.buscar();    
    }
    public ArrayList<ReservaLegal> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        ReservaLegalDAO reservaLegalDAO = new ReservaLegalDAO();
        return reservaLegalDAO.buscarPeloCodigo(micro);
    }
        public ArrayList<ReservaLegal> BuscarJtxt(String text) {
        ReservaLegalDAO reservaLegalDAO = new ReservaLegalDAO();
        return reservaLegalDAO.buscarJtxt(text);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.UsoDiferenciadoDAO;
import Modelo.Microbacia;
import Modelo.UsoDiferenciado;
import java.util.ArrayList;

/**
 *
 * @author junim
 */
public class UsoDiferenciadoControle {
    public void cadastrarUsoDiferenciado(Object obj, int codigo){
        UsoDiferenciadoDAO usoDiferenciadoDAO = new UsoDiferenciadoDAO();
        usoDiferenciadoDAO.Adicionar(obj, codigo);
    }
        public ArrayList<UsoDiferenciado> Buscar(){
        UsoDiferenciadoDAO usoDiferenciadoDAO = new UsoDiferenciadoDAO();        
        return usoDiferenciadoDAO.buscar();    
    }
    public ArrayList<UsoDiferenciado> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        UsoDiferenciadoDAO usoDiferenciadoDAO = new UsoDiferenciadoDAO();
        return usoDiferenciadoDAO.buscarPeloCodigo(micro);
    }    
        public ArrayList<UsoDiferenciado> BuscarJtxt(String text) {
        UsoDiferenciadoDAO usoDiferenciadoDAO = new UsoDiferenciadoDAO();
        return usoDiferenciadoDAO.buscarJtxt(text);
    }
}

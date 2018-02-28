/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.NascenteDAO;
import Modelo.Microbacia;
import Modelo.Nascentes;
import java.util.ArrayList;

/**
 *
 * @author junim
 */
public class NascenteControle {
    public void cadastrarNascente(Object obj, int codigo){
        NascenteDAO nascenteDAO = new NascenteDAO();
        nascenteDAO.Adicionar(obj, codigo);
    }
    public ArrayList<Nascentes> Buscar(){
        NascenteDAO nascenteDAO = new NascenteDAO();        
        return nascenteDAO.buscar();    
    }
    public ArrayList<Nascentes> BuscarJtxt(String text) {
        NascenteDAO nascenteDAO = new NascenteDAO();
        return nascenteDAO.buscarJtxt(text);
    }
    public ArrayList<Nascentes> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        NascenteDAO nascenteDAO = new NascenteDAO();
        return nascenteDAO.buscarPeloCodigo(micro);
    }
}

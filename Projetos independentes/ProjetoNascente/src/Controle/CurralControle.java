/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import DAO.CurralDAO;
import Modelo.Curral;
import Modelo.Microbacia;
import java.util.ArrayList;

/**
 *
 * @author junim
 */
public class CurralControle {
    public void cadastrarCurral(Object obj, int codigo){
        CurralDAO curralDAO = new CurralDAO();
        curralDAO.Adicionar(obj, codigo);
    }
    public ArrayList<Curral> Buscar(){
        CurralDAO curralDAO = new CurralDAO();        
        return curralDAO.buscar();    
    }    
    public ArrayList<Curral> buscarPeloCodigo(ArrayList<Microbacia> micro) {
        CurralDAO curralDAO = new CurralDAO();
        return curralDAO.buscarPeloCodigo(micro);
    }
        public ArrayList<Curral> BuscarJtxt(String text) {
        CurralDAO curralDAO = new CurralDAO();
        return curralDAO.buscarJtxt(text);
    }
}

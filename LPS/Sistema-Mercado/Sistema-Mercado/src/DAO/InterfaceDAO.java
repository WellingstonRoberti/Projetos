/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;

/**
 *
 * @author Junim Roberti
 */
public interface InterfaceDAO {
    public void adiciona(Object obj);
    public void excluir(Object obj);
    public void alterar(Object obj);
    public Object buscar();
}

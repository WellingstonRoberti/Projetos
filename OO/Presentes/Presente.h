/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Presente.h
 * Author: junimRoberti
 *
 * Created on 19 de Dezembro de 2015, 17:34
 */
#ifndef PRESENTE_H
#define	PRESENTE_H
#include <iostream>

class Presente {
private:
    int id;
    double preco;
    double Tamanho;
    
public:
    
    Presente();
    Presente(const Presente &outro);
    
    void imprimirPresente() const;
    void preencherPresente();
    void copiarPresente(const Presente& outro);
    
    ///metodo Getters e Setters
    void SetCusto(double Tamanho);
    double GetCusto() const;
    void SetPreco(double preco);
    double GetPreco() const;
    void SetId(int id);
    int GetId() const;
    
 

};

#endif	/* PRESENTE_H */


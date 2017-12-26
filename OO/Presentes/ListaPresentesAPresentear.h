/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ListaPresentesAPresentear.h
 * Author: junimRoberti
 *
 * Created on 20 de Dezembro de 2015, 16:42
 */

#ifndef LISTAPRESENTESAPRESENTEAR_H
#define LISTAPRESENTESAPRESENTEAR_H

#include "Presente.h"
#include "Nodo.h"

class ListaPresentesAPresentear {
private:
    int quant;
    Nodo *head;

public:
    ListaPresentesAPresentear();
    ListaPresentesAPresentear(const ListaPresentesAPresentear& outra);    
    virtual ~ListaPresentesAPresentear();
    
    void insert();    
    void remove();    
    Nodo* buscar(int idPresente);   
    Nodo* getElemento(int posicao);
    
    void insert(int posicao);
    void remove(int posicao);
    void preencherListaToda();        
    int buscarIndice(int idPresente);//retorna a posição na lista
    Presente* buscar(double preco);
    
    bool isEmpty ();        
    void imprimir();
    
    //GETTERS E SETTERS
    void setQuant(int quant);
    int getQuant() const;
};


#endif /* LISTAPRESENTESAPRESENTEAR_H */


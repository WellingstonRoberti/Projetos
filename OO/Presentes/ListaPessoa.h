/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ListaPessoa.h
 * Author: junimRoberti
 *
 * Created on 19 de Dezembro de 2015, 18:08
 */

#ifndef LISTAPESSOA_H
#define	LISTAPESSOA_H

#include "Pessoa.h"

class ListaPessoa {
private:
    int tam, quant;
    Pessoa *lista;

public:
    ListaPessoa();
    ListaPessoa(int tamanho);
    ListaPessoa(const ListaPessoa& outra);
    ListaPessoa(const ListaPessoa& outra, int novoTamanho);
    virtual ~ListaPessoa();
    
    bool temEspaco(); 
    bool isEmpty ();
    bool indiceValido(int i);
    void shiftFront(int aPartir);
    void shiftEnd(int ate);
    
    void imprimir();
    void insert();
    void insert(int posicao);
    void remove();
    void remove(int posicao);
    void updateId(int id, int novoId);
    
    void preencherListaToda();    
    Pessoa buscar(int idPessoa);    
    int buscarIndice(int idPessoa);//retorna a posição na lista
    
    
    //GETTERS E SETTERS
    void setLista(Pessoa* lista);
    Pessoa* getLista() const;
    void setQuant(int quant);
    int getQuant() const;
    void setTam(int tam);
    int getTam() const;
    


};

#endif	/* LISTAPESSOA_H */


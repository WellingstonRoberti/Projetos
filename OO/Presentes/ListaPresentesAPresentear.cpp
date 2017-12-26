/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ListaPresentesAPresentear.cpp
 * Author: junimRoberti
 * 
 * Created on 20 de Dezembro de 2015, 16:42
 */

#include "ListaPresentesAPresentear.h"
#include<iostream>

using namespace std;

ListaPresentesAPresentear::ListaPresentesAPresentear() {
    quant = 0;
    head = NULL;
}

ListaPresentesAPresentear::ListaPresentesAPresentear(const ListaPresentesAPresentear& outra) {
    
}

ListaPresentesAPresentear::~ListaPresentesAPresentear() {
    //será chamado quando o objeto for destruido
}

int ListaPresentesAPresentear::buscarIndice(int idPresente) {
   
}

/**
 * Retorna o endereco do elemento da posiçao: n
 * @param posicao
 * @return 
 */
Nodo* ListaPresentesAPresentear::getElemento(int n){
    Nodo* p = head;
    int j = 1;   
    
    while (j <= n-1 && p->GetProx() != NULL) {  
        p = p->GetProx();
        j++;
    }
    
    if (j == n) 
	    return p;
    else          
        return NULL; // posicao invalida

}

Nodo* ListaPresentesAPresentear::buscar(int idPresente) {
    for(Nodo*p = head; p != NULL; p = p->GetProx()){
        if(p->GetItem().GetId() == idPresente)
            return p;
    }
    
    return NULL;
}


Presente* ListaPresentesAPresentear::buscar(double preco) {
   
}

void ListaPresentesAPresentear::preencherListaToda() {
   
}

void ListaPresentesAPresentear::insert() {
    Presente p;
    p.preencherPresente();
    Nodo *novo;
    novo = new Nodo(p);
    novo->SetProx(head);
    head = novo;
    quant++;
}

void ListaPresentesAPresentear::insert(int posicao) {
    
}

void ListaPresentesAPresentear::remove() {
    head = head->GetProx();
    quant--;
}

void ListaPresentesAPresentear::remove(int posicao) {
    
}

bool ListaPresentesAPresentear::isEmpty() {
    if(quant == 0)
        return true;
    else
        return false;
    
}

void ListaPresentesAPresentear::imprimir() {
    cout << ">>>>>>>>>>>>>> Dados da Lista <<<<<<<<<<<<<<<<<<<<\n";
    if (isEmpty()) {
        cout << "Lista vazia\n";
    } else {
        Nodo* p = head;
        while(p!=NULL){
            p->GetItem().imprimirPresente();
            p = p->GetProx();
        }
        
    }
    cout << "\n>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<\n";
}


/**
 *  GETTERS E SETTERS 
 */
void ListaPresentesAPresentear::setQuant(int quant) {
    this->quant = quant;
}

int ListaPresentesAPresentear::getQuant() const {
    return quant;
}

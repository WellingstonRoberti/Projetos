/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Nodo.cpp
 * Author: junimRoberti
 * 
 * Created on 20 de Dezembro de 2015, 16:45
 */

#include "Nodo.h"

Nodo::Nodo() {
    prox = NULL;    
}

Nodo::Nodo(Presente& p){
    item.copiarPresente(p);
    prox = NULL;
}


Nodo::Nodo(const Nodo& outro) {
    item.copiarPresente(outro.GetItem());
}

Nodo::~Nodo() {
}

/**
 * GETTERS e SETTERS
 */

void Nodo::SetProx(Nodo* prox) {
    this->prox = prox;
}

Nodo* Nodo::GetProx() const {
    return prox;
}

void Nodo::SetItem(Presente item) {
    this->item = item;
}

Presente Nodo::GetItem() const {
    return item;
}


}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Nodo.h
 * Author: junimRoberti
 *
 * Created on 20 de Dezembro de 2015, 16:45
 */

#ifndef NODO_H
#define	NODO_H

#include "Presente.h"

class Nodo {
private:
    Presente item;
    Nodo* prox;

public:
    Nodo();
    Nodo(Presente &p);
    Nodo(const Nodo& orig);
    virtual ~Nodo();
    
    
    
    
    //GETTERS e SETTERS
    void SetProx(Nodo* prox);
    Nodo* GetProx() const;
    void SetItem(Presente item);
    Presente GetItem() const;

    

};

#endif	/* NODO_H */


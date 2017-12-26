/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   ListaPessoa.cpp
 * Author: junimRoberti
 * 
 * Created on 19 de Dezembro de 2015, 18:08
 */

#include "ListaPessoa.h"
#include<iostream>

using namespace std;

ListaPessoa::ListaPessoa() {
    quant = 0;
    cout << "Informe o tamanho desejado:";
    cin >> tam;
    lista = new Pessoa[tam];
}

ListaPessoa::ListaPessoa(int tamanho) {
    quant = 0;
    tam = tamanho;
    lista = new Pessoa[tam];
}

ListaPessoa::ListaPessoa(const ListaPessoa& outra) {
    quant = outra.getQuant();
    tam = outra.getTam();
    lista = outra.getLista();
}
ListaPessoa::ListaPessoa(const ListaPessoa& outra, int novoTamanho) {
    quant = outra.getQuant();
    tam = novoTamanho;
    lista = new Pessoa[tam];
    
    for(int i=0; i<=quant-1; i++){
        lista[i].copiarPessoa(outra.getLista()[i]);
    }    
}

ListaPessoa::~ListaPessoa() {
    //será chamado quando o objeto for destruido
}

void ListaPessoa::updateId(int id, int novoId){
    int i = buscarIndice(id);
    lista[i].SetId(novoId);
}


int ListaPessoa::buscarIndice(int idPessoa) {
    for (int i = 0; i <= tam - 1; i++) {
        if (lista[i].GetId() == idPessoa)
            return i;
    }
    
    return -1;
}

Pessoa ListaPessoa::buscar(int idPessoa) {
    for (int i = 0; i <= tam - 1; i++) {
        if (lista[i].GetId() == idPessoa)
            return lista[i];
    }
    Pessoa p;
    return p;
}
void ListaPessoa::preencherListaToda() {
    for (int i = 0; i <= tam; i++) {
        insert();
    }
}

void ListaPessoa::insert() {
    if (temEspaco()) {
        shiftEnd(0);
        lista[0].preencherPessoa();
        quant++;
    }
}

void ListaPessoa::insert(int posicao) {
    if (temEspaco()) {
        shiftEnd(posicao);
        lista[posicao].preencherPessoa();
        quant++;
    }
}

void ListaPessoa::remove() {
    shiftFront(0);
    quant--;
}

void ListaPessoa::remove(int posicao) {
    shiftFront(posicao);
    quant--;
}

void ListaPessoa::shiftFront(int aPartir) {
    if (indiceValido(aPartir)) {
        if (!isEmpty()) {
            for (int i = aPartir; i < quant; i++) {
                //lista[i] = lista[i+1];
                lista[i].copiarPessoa(lista[i + 1]);
            }
        }
    }
}

void ListaPessoa::shiftEnd(int ate) {
    if (temEspaco() && !isEmpty()) {
        for (int i = quant; i > ate; i--) {
            //lista[i] = lista[i-1];
            lista[i].copiarPessoa(lista[i - 1]);
        }
    }
}

bool ListaPessoa::indiceValido(int i) {
    if (i >= 0 && i <= tam)
        return true;
    else
        return false;
}

bool ListaPessoa::temEspaco() {
    if (quant < tam)
        return true;
    else
        return false;
}

bool ListaPessoa::isEmpty() {
    if (quant == 0)
        return true;
    else
        return false;
}

void ListaPessoa::imprimir() {
    cout << ">>>>>>>>>>>>>> Dados da Lista <<<<<<<<<<<<<<<<<<<<\n";
    if (isEmpty()) {
        cout << "Lista vazia\n";
    } else {
        for (int i = 0; i <= quant - 1; i++) {
            lista[i].imprimirPessoa();
        }
    }
    cout << ">>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<\n";

}


/**
 *  GETTERS E SETTERS 
 */
void ListaPessoa::setLista(Pessoa* lista) {
    this->lista = lista;
}

Pessoa* ListaPessoa::getLista() const {
    return lista;
}

void ListaPessoa::setQuant(int quant) {
    this->quant = quant;
}

int ListaPessoa::getQuant() const {
    return quant;
}

void ListaPessoa::setTam(int tam) {
    this->tam = tam;
}

int ListaPessoa::getTam() const {
    return tam;
}
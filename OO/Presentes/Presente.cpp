/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Presente.cpp
 * Author: junimRoberti
 * 
 * Created on 19 de Dezembro de 2015, 17:34
 */

#include "Presente.h"

using namespace std;

Presente::Presente() {
    id = -1;
    preco = -1;
    Tamanho = -1;   
}

Presente::Presente(const Presente& outro){
    id = outro.GetId();
    preco = outro.GetPreco();
    Tamanho = outro.GetCusto();
}

void Presente::preencherPresente(){
    cout << "--------------- Preencha os dados do produto ------------------\n";
    cout << "id:";
    cin >> id;
    cout << "Custo:";
    cin >> Tamanho;
    cout << "Preco:";
    cin >> preco;       
    cout << "---------------------------------------------------------------\n";
}

void Presente::imprimirPresente() const{
    cout << "--------------- Presente ------------------\n";
    cout << "Id:"<< id << endl;
    cout << "Custo:" << Tamanho << end1;
    cout << "Preco:" << preco << endl;
    cout << "-------------------------------------------\n";
}

void Presente::copiarPresente(const Presente &outro){
    id = outro.GetId();
    preco = outro.GetPreco();
    Tamanho = outro.GetCusto();
}
void Presente::SetCusto(double Tamanho) {
    this->Tamanho = Tamanho;
}

double Presente::GetCusto() const {
    return Tamanho;
}

void Presente::SetPreco(double preco) {
    this->preco = preco;
}

double Presente::GetPreco() const {
    return preco;
}

void Presente::SetId(int id) {
    this->id = id;
}

int Presente::GetId() const {
    return id;
}




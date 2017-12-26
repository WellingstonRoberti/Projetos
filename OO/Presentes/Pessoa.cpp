/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pessoa.cpp
 * Author: junimRoberti
 * 
 * Created on 19 de Dezembro de 2015, 17:42
 */

#include "Pessoa.h"
#include <iostream>

using namespace std;

Pessoa::Pessoa() {
    id = -1;
    idade = -1;
    sexo = '';
    CPF = -1;
    tipo = - 1;
    ListaPres = NULL;
    ListaReceb = NULL;
       
}

Pessoa::Pessoa(const Pessoa& outro){
    id = outro.GetId();
    idade = outro.GetIdade();
    CPF = outro.GetCPF();
    sexo = outro.GetSexo();
    tipo = outro.GetTipo();
}

void Pessoa::preencherPessoa(){
    cout << "--------------- Preencha os dados do produto ------------------\n";
    cout << "id:";
    cin >> id;
    cout << "CPF:";
    cin >> CPF;
    cout << "Idade:";
    cin >> idade;
    cout <<"Sexo:";
    cin >> sexo;  
    cout <<"Tipo:";
    cin >> tipo;  
    cout << "---------------------------------------------------------------\n";
}

void Pessoa::imprimirPessoa() const{
    cout << "--------------- Pessoa ------------------\n";
    cout << "Id:"<< id << endl;
    cout << "CPF:" << CPF << endl;
    cout << "Idade:" << idade << endl;
    cout << "Sexo:" << sexo << endl;
    cout << "Tipo:" << tipo << endl;
    cout << "-------------------------------------------\n";
}

void Pessoa::copiarPessoa(const Pessoa &outro){
    id = outro.GetId();
    idade = outro.GetIdade();
    CPF = outro.GetCPF();
    sexo = outro.GetSexo();
    tipo = outro.GetTipo();
}
int Pessoa::AlunoProfessor(const Pessoa& p){
    if(p.GetTipo() == 1){
        cout << "Esta pessoa é um professor";
    }else{
        cout << "Esta pessoa é um Aluno"
    }
}

void Pessoa::SetSexo(char sexo) {
    this->sexo = sexo;
}

char Pessoa::GetSexo() const {
    return sexo;
}

void Pessoa::SetCPF(int CPF) {
    this->CPF = CPF;
}

int Pessoa::GetCPF() const {
    return CPF;
}

void Pessoa::SetIdade(int idade) {
    this->idade = idade;
}

int Pessoa::GetIdade() const {
    return idade;
}

void Pessoa::SetId(int id) {
    this->id = id;
}

int Pessoa::GetId() const {
    return id;
}
void Pessoa::SetTipo(int tipo) {
    this->tipo = tipo;
}

int Pessoa::GetTipo() const {
    return tipo;
}
void Pessoa::SetListaPres(ListaPresentesAPresentear ListaPres) {
    this->ListaPres = ListaPres;
}

 ListaPresentesAPresentear Pessoa::GetListaPres() const {
    return ListaPres;
}
void Pessoa::SetListaReceb(ListaPresentesRecebidos ListaReceb) {
    this->ListaReceb = ListaReceb;
}

ListaPresentesRecebidos Pessoa::GetListaReceb() const {
    return ListaReceb;
}

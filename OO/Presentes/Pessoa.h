/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Pessoa.h
 * Author: junimRoberti
 *
 * Created on 19 de Dezembro de 2015, 17:42
 */

#ifndef PESSOA_H
#define PESSOA_H

#include <iostream>
#include "ListaPresentesAPresentear.h"
#include "ListaPresentesRecebidos.h"

class Pessoa {
private:
    int id;
    int idade;
    char sexo;
    int CPF;
    int tipo;
    ListaPresentesAPresentear ListaPres;
    ListaPresentesRecebidos ListaReceb;
    
public:
    
    Pessoa();
    Pessoa(const Pessoa &outro);
    
    void imprimirPessoa() const;
    void preencherPessoa();
    void copiarPessoa(const Pessoa& outro);
    int AlunoProfessor(const Pessoa& p);
    
    ///metodo Getters e Setters
    void SetCPF(int CPF);
    int GetCPF() const;
    void SetIdade(int idade);
    int GetIdade() const;
    void SetSexo(char sexo);
    char GetSexo() const;
    void SetId(int id);
    int GetId() const;
    void SetTipo(int tipo);
    int GetTipo() const;
    void SetListaPres(ListaPresentesAPresentear ListaPres);
    ListaPresentesAPresentear GetListaPres() const;
    void SetListaReceb(ListaPresentesRecebidos ListaReceb);
    ListaPresentesRecebidos GetListaReceb() const;
 

};
#endif /* PESSOA_H */


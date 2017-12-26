/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: junimRoberti
 *
 * Created on 10 de Agosto de 2016, 18:35
 */

#include <cstdlib>
#include <iostream>
using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    int vetor[5];
    int tam = 5, aux = 0, i = 0, j = 0;
    vetor[0] = 43;
    vetor[1] = 8;
    vetor[2] = 4;
    vetor[3] = 123;
    vetor[4] = 6;
    for(j = 0;j < tam;j++) {
        aux = vetor[j];
        i = j - 1;
        while (i >= 0 && vetor[i] < aux) {
            vetor[i + 1] = vetor[i];
            i = i - 1;
            vetor[i + 1] = aux;
        }
    }
    for(int x = 0;x < 5;x++){
        cout << vetor[x];
        cout << " "; 
    }
    return 0;
}


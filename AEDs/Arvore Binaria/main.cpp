/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: junimRoberti
 *
 * Created on 29 de Junho de 2016, 22:35
 */

#include <cstdlib>
#include <stdio.h>
#include <stdlib.h>

using namespace std;
/*
 * 
 */
struct no{
	int el;
	no *direita;
	no *esquerda;
};
typedef struct no n;

void insereNo(int el, no **raiz){
    if (*raiz == NULL) {
        no *aux = (no *)malloc(sizeof(no));
        if (!aux){ 
            perror(NULL); 
            exit(EXIT_FAILURE); 
        }
        aux->el = el;
        aux->direita = aux->esquerda = NULL;
        *raiz = aux; // copia o endereco do novo espaco de memoria no nó passado por parametro
        return ;
    }
    //caso a arvore ja tenha algum elemento, decidir onde colocar 
    //o novo elemento, se esse elemento é maior ou menor
    if (el < (*raiz)->el) 
    {
        insereNo(el, &(*raiz)->esquerda);
    }
    if (el >(*raiz)->el) 
    {
        insereNo(el, &(*raiz)->direita);
    }
}
int arvore(int *vet, int inicio, int fim, no **raiz){
    //para vetores de tamanho par
    if (inicio > fim)
    {
      return NULL;
    }
    int mid = inicio + (fim - inicio) / 2;
    insereNo(vet[mid], &(*raiz));
    arvore(vet, inicio, mid- 1, &(*raiz)); //chama parte da esquerda da arvore
    arvore(vet, mid+1, fim, &(*raiz));    //chama parte da direita da arvore
}
void imprimirArvore(no * no){
	if (no == NULL) return;
        imprimirArvore(no->esquerda);
	printf("%d \n", no->el);
	imprimirArvore(no->direita);
}
int main(int argc, char** argv) {
        no *raiz = NULL;
	int vetor[15] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14}; //2m-1
	arvore(vetor, 0, 14, &raiz);
	imprimirArvore(raiz);
	system("pause");
    return 0;
}

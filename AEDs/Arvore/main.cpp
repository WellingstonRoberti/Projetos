/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: junimRoberti
 *
 * Created on 28 de Junho de 2016, 23:19
 */
#include<stdio.h>
#include <cstdlib>


struct no
{
    int numero_arvore;
    char cor;
    struct no *pai;
    struct no *esquerda;
    struct no *direita;
};

typedef struct no noRN;

// Prototipo das funções
noRN* criaNovono();
void rotacaoEsquerda(noRN **Arvore_PV, noRN *no);
void rotacaoDireita(noRN **Arvore_PV, noRN *no);
noRN* inserir_Novo_no_PV(noRN **Arvore_PV, noRN *no);
void inserirCorRN(noRN **Arvore_PV, noRN *no);
void removerCorRN(noRN **Arvore_PV, noRN *no);
noRN* sucessorRN(noRN *no);
noRN* maximoRN(noRN *no);
noRN* minimoRN(noRN *no);
void visitarEmOrdem(noRN* Arvore_PV);
void mostraDadosno(noRN* no);
int menu();
int calcularAlturaPreta(noRN *no);
noRN* localizar_no_Arvore(noRN* no, int numero_arvore);
noRN* rotacaoDireitaEsquerda(noRN* arvore);
noRN* rotacaoEsquerdaDireita(noRN*arvore);
noRN *removerRN(noRN **Arvore_PV, noRN *no);

noRN *vazio = NULL;



int main()
{
    noRN *Arvore_PV = NULL;
    noRN *aux;
    int valor, altura, opc;

    vazio = (noRN*)malloc(sizeof(noRN));
    vazio->pai = Arvore_PV;
    vazio->direita = vazio->esquerda = vazio;

    do
    {
        opc = menu();
        switch (opc)
        {

        case 1:
            inserir_Novo_no_PV(&Arvore_PV, criaNovono());
            break;
        case 2:
            printf("nós da Arvore \n\n");
            if(Arvore_PV != NULL)
            {
                visitarEmOrdem(Arvore_PV);
            }
            else
            {
                printf("Sem Elementos na Arvore \n");
            }
            break;
        case 3:
            if(Arvore_PV != NULL)
            {
                printf("Digite o numero da Arvore para Remoção ?   \n");
                scanf("%d", &valor);
                aux = localizar_no_Arvore(Arvore_PV, valor);
                if (aux->numero_arvore == valor)
                {
                    mostraDadosno(aux);
                    removerRN(&Arvore_PV, aux);
                }
                else
                {
                    printf("\nO numero %d nao encontrada!\n\n", valor);
                }
                if(Arvore_PV == vazio)
                {
                    vazio = (noRN*)malloc(sizeof(noRN));
                    vazio->pai = Arvore_PV = NULL;
                    vazio->direita = vazio->esquerda = vazio;
                }
            }
            else
            {
                printf("Sem Elementos na Arvore \n");
            }
            break;
        case 4:
            if(Arvore_PV != NULL)
            {
                printf("Qual no deseja alterar\n ");
                scanf("%d", &valor);
                aux = localizar_no_Arvore(Arvore_PV, valor);
                if (aux->numero_arvore == valor)
                {
                    mostraDadosno(aux);
                    inserir_Novo_no_PV(&(Arvore_PV),criaNovono());
                    removerRN(&Arvore_PV, aux);

                }
                else
                {
                    printf("O numero %d nao encontrada!\n\n", valor);
                }
            }
            else
            {
                printf("Sem Elementos na Arvore \n");
            }

            break;
        }
    }
    while (opc != 0);

    return 0;
}
// Rotação a Esquerda do no

void rotacaoEsquerda(noRN **Arvore_PV, noRN *no)
{
    noRN *y;

    if(((*Arvore_PV)->pai == vazio) && (no->direita != vazio))
    {
        y = no->direita;
        no->direita = y->esquerda;
        y->esquerda->pai = no;
        y->pai = no->pai;

        if(no->pai == vazio)
        {
            *Arvore_PV = y;
        }
        else if(no == no->pai->esquerda)
        {
            no->pai->esquerda = y;
        }
        else
        {
            no->pai->direita = y;
        }
    }
    y->esquerda = no;
    no->pai = y;
    (*Arvore_PV)->pai = vazio;
}

//Rotação a Direita do no
void rotacaoDireita(noRN **Arvore_PV, noRN *no)
{
    noRN *y;

    if(((*Arvore_PV)->pai == vazio) && (no->esquerda != vazio))
    {
        y = no->esquerda;
        no->esquerda = y->direita;
        y->direita->pai = no;
        y->pai = no->pai;

        if(no->pai == vazio)
        {
            *Arvore_PV = y;
        }
        else if(no == no->pai->direita)
        {
            no->pai->direita = y;
        }
        else
        {
            no->pai->esquerda = y;
        }
    }
    y->direita = no;
    no->pai = y;
    (*Arvore_PV)->pai = vazio;
}


noRN* inserir_Novo_no_PV(noRN **Arvore_PV, noRN *no)// Insere na arvore
{
    noRN *y = vazio;
    noRN *x = *Arvore_PV;

    if((*Arvore_PV)== NULL)// Verifica se a arvore é NULL
    {
        *Arvore_PV = no;
        (*Arvore_PV)->pai = vazio;
        vazio->pai = *Arvore_PV;
        (*Arvore_PV)->cor = 'P';
        return 0;
    }

    if((*Arvore_PV)->numero_arvore == no->numero_arvore)
    {
        printf(" Numero duplicado, Coloque outro numero !!\n\n");
        return 0;
    }

    while(x != vazio)
    {
        y = x;

        if(no->numero_arvore < x->numero_arvore)
        {
            x = x->esquerda;
        }
        else
        {
            x = x->direita;
        }
    }

    no->pai = y;

    if(no->numero_arvore < y->numero_arvore)
    {
        y->esquerda = no;
    }
    else if(no->numero_arvore > y->numero_arvore)
    {
        y->direita = no;
    }
    else if(no->numero_arvore == y->numero_arvore)
    {
        printf("mesmos numeros, tente novamente !!\n\n");
    }

    no->esquerda = vazio;
    no->direita = vazio;
    no->cor = 'V';

    inserirCorRN(&(*Arvore_PV), no);
    return no;
}
// Insere a Cor do nó e faz o balaceamento caso precisar
void inserirCorRN(noRN **Arvore_PV, noRN *no)//
{
    noRN *y;

    while(no->pai->cor == 'V')
    {
        if(no->pai == no->pai->pai->esquerda)
        {
            y = no->pai->pai->direita;

            if(y->cor == 'V')
            {
                no->pai->cor = 'P';
                y->cor = 'P';
                no->pai->pai->cor = 'V';
                no = no->pai->pai;
            }
            else
            {
                if(no == no->pai->direita)
                {
                    no = no->pai;
                    rotacaoEsquerda(&(*Arvore_PV), no);
                }

                no->pai->cor = 'P';
                no->pai->pai->cor = 'V';
                rotacaoDireita(&(*Arvore_PV), no->pai->pai);
            }
        }
        else
        {
            y = no->pai->pai->esquerda;

            if(y->cor == 'V')
            {
                no->pai->cor = 'P';
                y->cor = 'P';
                no->pai->pai->cor = 'V';
                no = no->pai->pai;
            }
            else
            {
                if(no == no->pai->esquerda)
                {
                    no = no->pai;
                    rotacaoDireita(&(*Arvore_PV), no);
                }

                no->pai->cor = 'P';
                no->pai->pai->cor = 'V';
                rotacaoEsquerda(&(*Arvore_PV), no->pai->pai);
            }
        }
    }

    (*Arvore_PV)->cor = 'P';
}

// Remove o no da Arvore

noRN *removerRN(noRN **Arvore_PV, noRN *no)
{
    noRN *y, *x;

    if((no->esquerda == vazio) || (no->direita == vazio))
    {
        y = no;
    }
    else
    {
        y = sucessorRN(no);
    }

    if(y->esquerda != vazio)
    {
        x = y->esquerda;
    }
    else
    {
        x = y->direita;
    }

    x->pai = y->pai;


    if(y->pai == vazio)
    {
        *Arvore_PV = x;
    }
    else if(y == y->pai->esquerda)
    {
        y->pai->esquerda = x;
    }
    else
    {
        y->pai->direita = x;
    }

    if(y != no)
    {
        no->numero_arvore = y->numero_arvore;        //Aqui os dados são transferidos
    }

    if(y->cor == 'P')
    {


        if((*Arvore_PV)->direita == vazio && (*Arvore_PV)->esquerda->direita != vazio)
        {

            rotacaoEsquerda(&(*Arvore_PV), (*Arvore_PV)->esquerda);
            removerCorRN(&(*Arvore_PV), (*Arvore_PV)->esquerda);
            rotacaoDireita(&(*Arvore_PV), (*Arvore_PV));
        }
        else
        {

            if((*Arvore_PV)->esquerda == vazio && (*Arvore_PV)->direita->esquerda != vazio)
            {

                rotacaoDireita(&(*Arvore_PV), (*Arvore_PV)->direita);
                removerCorRN(&(*Arvore_PV), (*Arvore_PV)->direita);
                rotacaoEsquerda(&(*Arvore_PV), (*Arvore_PV));
            }
        }
        removerCorRN(&(*Arvore_PV), x);
    }
    return y;
    free(y);
    free(x);

}
// Faz o balaceamento da cor caso tenha alguma incosistencia

void removerCorRN(noRN **Arvore_PV, noRN *no)
{
    noRN *aux;

    while(((*Arvore_PV) != no) && (no->cor == 'P'))
    {
        if(no == no->pai->esquerda)
        {
            aux = no->pai->direita;

            if(aux->cor == 'V')
            {
                aux->cor = 'P';
                no->pai->cor = 'V';
                rotacaoEsquerda(&(*Arvore_PV), no->pai);
                aux = no->pai->direita;
            }

            if((aux->esquerda->cor == 'P') && (aux->direita->cor == 'P'))
            {
                aux->cor = 'V';
                no = no->pai;
            }
            else if(aux->direita->cor == 'P')
            {
                aux->esquerda->cor = 'P';
                aux->cor = 'V';
                rotacaoDireita(&(*Arvore_PV), aux);
                aux = no->pai->direita;
                aux->cor = no->pai->cor;
                no->pai->cor = 'P';
                aux->direita->cor = 'P';
                rotacaoEsquerda(&(*Arvore_PV), no->pai);
                no = *Arvore_PV;
            }
        }
        else
        {
            aux = no->pai->esquerda;

            if(aux->cor == 'V')
            {
                aux->cor = 'P';
                no->pai->cor = 'V';
                rotacaoDireita(&(*Arvore_PV), no->pai);
                aux = no->pai->esquerda;
            }

            if((aux->esquerda->cor == 'P') && (aux->direita->cor == 'P'))
            {
                aux->cor = 'V';
                no = no->pai;
            }
            else if(aux->esquerda->cor == 'P')
            {
                aux->direita->cor = 'P';
                aux->cor = 'V';
                rotacaoEsquerda(&(*Arvore_PV), aux);
                aux = no->pai->esquerda;
                aux->cor = no->pai->cor;
                no->pai->cor = 'P';
                aux->esquerda->cor = 'P';
                rotacaoDireita(&(*Arvore_PV), no->pai);
                no = *Arvore_PV;
            }
        }
    }
    no->cor = 'P';
}
// Sucessor do no para o balaceamento

noRN* sucessorRN(noRN *no)
{
    noRN *aux;

    if(no->direita != vazio)
    {
        return minimoRN(no->direita);
    }

    aux = no->pai;

    while((aux != vazio) && (no == aux->direita))
    {
        no = aux;
        aux = aux->pai;
    }

    return aux;
}
// Maximo da Arvore

noRN* maximoRN(noRN *no)
{
    while(no->direita != vazio)
    {
        no = no->direita;
    }
    return no;
}
// Minimo da Arvore
noRN* minimoRN(noRN *no)
{
    while(no->esquerda != vazio)
    {
        no = no->esquerda;
    }
    return no;
}
// Cria o no para a Arvore
noRN* criaNovono()
{
    noRN *novo;
    novo = (noRN*)malloc(sizeof(noRN));
    printf("Informe um numero para a Arvore...: ");
    scanf("%d", &novo->numero_arvore);
    if(novo->numero_arvore < 0)
    {
        printf("Numero Invalido! Tente Novamente !!!\n");
        return criaNovono();
    }
    novo->cor = 'V'; // todo novo no é vermelho
    novo->pai = vazio;
    novo->direita = vazio;
    novo->esquerda = vazio;

    return novo;
}
// Função de Listagem dos dados
void visitarEmOrdem(noRN* Arvore_PV)
{
    if (Arvore_PV != vazio)
    {
        mostraDadosno(Arvore_PV);
        visitarEmOrdem(Arvore_PV->esquerda);
        visitarEmOrdem(Arvore_PV->direita);
    }
}
// Mostra os dados da Arvore
void mostraDadosno(noRN* no)
{
    printf("Endereco do no: %p\n", no);
    printf("Valor do no: %d\n", no->numero_arvore);
    printf("Cor do no: %c\n\n", no->cor);
    printf("Pai do no: %p\n", no->pai);
    printf("Filho da esquerda: %p\n", no->esquerda);
    printf("Filho da direita: %p\n\n", no->direita);
    printf("\n\n");
}
//Menu do Usuario
int menu()
{
    int opcao;

    printf("1.Inserir no na arvore:\n");
    printf("2.Mostrar arvore (RED):\n");
    printf("3.Remover no da arvore:\n");
    printf("4.Alterar no da arvore:\n");
    printf("0.Sair:\n");
    scanf("%d", &opcao);
    return opcao;
}
// Calculo do balaceamento

noRN* localizar_no_Arvore(noRN* no, int numero_arvore)
{
    if ((no == vazio) || (no->numero_arvore == numero_arvore))
    {
        return no;
    }

    if (numero_arvore < no->numero_arvore)
    {
        return localizar_no_Arvore(no->esquerda, numero_arvore);
    }
    else
    {
        return localizar_no_Arvore(no->direita, numero_arvore);
    }
}

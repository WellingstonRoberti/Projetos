#include <iostream>
#include <stdio.h>
#include <conio.h>
#include <fstream>
#include <stdlib.h>
using namespace std;

float ** matAd;
float ** matIn;
int nLinhas = 0;
int nColunas = 0;
bool verificad = false;
bool verificador = false;

void criarMatrizAdjacencia(){
    matAd = new float*[nLinhas];
    for(int i = 0;i < nLinhas; ++i){
        matAd[i] = new float[nColunas];
    }

}
void criarMatrizIncidecia(){
    matIn = new float*[nLinhas];
    for(int i = 0;i < nLinhas; ++i){
        matIn[i] = new float[nColunas];
    }
}

void zerarMatrixAdjacencia(){
    for(int i=0; i<nLinhas; i++){
        for(int j=0; j<nColunas; j++){
            matAd[i][j] = 0;
        }
    }
}
void zerarMatrixIncidencia(){
   for(int i=0; i<nLinhas; i++){
        for(int j=0; j<nColunas; j++){
            matIn[i][j] = 0;
        }
    }
}
void imprimirAdjacencia(){
    for(int i=0; i<nLinhas; i++){
        for(int j=0; j<nColunas; j++){
            cout << matAd[i][j];
        }
        cout <<endl;
    }
}
void imprimirIncidencia(){
    for(int i=0; i<nLinhas; i++){
        for(int j=0; j<nColunas; j++){
            cout << matIn[i][j];
        }
        cout <<endl;
    }
}

void matrizAdjacencia(){
    char ch;
    ifstream fin("arquivo.txt");
    int aux1=0;
    int aux2=0;
    int cont1=0;
    int cont2=0;
    while(fin.get(ch)){
        if(ch != '\n'){
            aux1++;
            aux2++;
        }
        if(aux1 == 1){
            cont1 = ch -48;
        }
        if(aux2 == 2){
            cont2 = ch -48;
            aux1 = 0;
            aux2 = 0;
            matAd[cont1-1][cont2-1] = 1;
            matAd[cont2-1][cont1-1] = 1;
        }

    }
}

void matrizIncidencia(){
    char ch;
    ifstream fin("arquivo.txt");
    int aux= 0;
    int coluna= 0;
    int linha= 0;
    while(fin.get(ch)){
        if(ch != '\n'){
            aux++;
            linha= ch-48;
            matIn[linha-1][coluna] = 1;
        }
        if(aux == 2){
            coluna++;
            aux= 0;
        }
    }
}

void lerArquivoTamanhoMatriz(bool tipo){
    char ch;
    ifstream fin("arquivo.txt");
    int aux = 0;
    //adjacencia
    if(tipo == 1){
        while(fin.get(ch)){
            if(ch - 48 > nLinhas){
                nLinhas = ch-48;
            }
        }
        nColunas = nLinhas;
    }else{
        while(fin.get(ch)){
            if(ch != '\n'){
                aux ++;
            }
            if(aux == 2){
                nColunas ++;
                aux = 0;
            }
            if(ch - 48 > nLinhas){
                nLinhas = ch-48;
            }
        }
    }
}
void Multigrafos(){
    for(int i = 0; i < nLinhas; i++){
        for(int j = 0; j < nColunas; j++){
            if(matAd[i][j] != 1 && matAd[i][j] != 0)
                verificador = true;
        }
    }
    if(verificador){
        cout << "e um multigrafo!\n";
    }else{
        cout << "nao e um multigrafo!\n";
    }

}
void Grau(){
    int contador = 0;
    for(int i = 0; i < nLinhas; i++){
        cout << "grau do vertice ";
        cout << i + 1;
        cout << ": ";
        for(int j = 0; j < nColunas; j++){
                if(matAd[i][j] == 1)
                    contador++;
        }
        cout << contador;
        cout << "\n";
        contador = 0;
    }

}
void quantidadeVert(){
    cout << nLinhas;
    cout << "\n";
}
void pseudografo(){
    for(int i = 0; i < nLinhas; i++){
        if(matAd[i][i] != 0){
            verificad = true;
        }
    }
if(verificad){
        cout << "e um pseudografo!\n";
    }else{
        cout << "nao e um pseudografo!\n";
    }
}
void grafosSimples(){
    for(int i = 0; i < nLinhas; i++){
        if(matAd[i][i] != 0){
            verificad = true;
        }
    }
     for(int i = 0; i < nLinhas; i++){
        for(int j = 0; j < nColunas; j++){
            if(matAd[i][j] != 1 && matAd[i][j] != 0)
                verificador = true;
        }
    }
    if(verificad == false && verificador == false){
        cout << "e um grafo simples!\n";
    }else{
        cout << "nao e um grafo simples!\n";

    }
}
void grafoCompleto(){
    bool verifica = true;
    for(int i = 0; i < nLinhas; i++){
        for(int j = 0; j < nColunas; j++){
            if(i != j){
                if(matAd[i][j] != 1){
                    verifica = false;
                }
            }else if(i == j){
                if(matAd[i][j] != 0){
                    verifica = false;
                }
            }
        }
    }
    if(verifica){
        cout << "e um grafo completo!\n";
    }else{
        cout << "nao e um grafo completo!\n";
    }

}
void grafoRegular(){
    int contador = 0, contaux = 0, i = 0;
    bool verif = true;
        for(int j = 0; j < nLinhas; j++){
                if(matAd[i][j] == 1)
                    contador++;
        }
    contaux = contador;
    contador =0;
    for(int i = 0; i < nLinhas; i++){
        for(int j = 0; j < nColunas; j++){
                if(matAd[i][j] == 1)
                    contador++;
        }
        if(contaux != contador)
            verif = false;
        contador = 0;
    }
    if(verif){
        cout << "e um grafo regular\n";
    }else{
        cout << "nao e um grafo regular\n";
    }

}
void verticesAdjacentes(){
    for(int i = 0; i < nLinhas; i++){
        for(int j = 0; j < nColunas; j++){
            if(matAd[i][j] == 1){
                cout << "vertice: ";
                cout << i + 1;
                cout << " adjacente ao ";
                cout << j + 1;
                cout << "\n";
            }
        }
    }
}
void menu(){
    cout << "0 - Matriz de Adjacência\n";
    cout << "1 - Matriz de incidência\n";
    cout << "2 - Grau do vertice\n";
    cout << "3 - Quantidade de vertices\n";
    cout << "4 - Multigrafo\n";
    cout << "5 - Grafo completo\n";
    cout << "6 - Pseudografo\n";
    cout << "7 - Grafo regular\n";
    cout << "8 - Grafo simples\n";
    cout << "9 - vertices adjacentes\n";
    cout << "12 - Sair\n";
}
int main()
{
    int op;
    while (op != 12){
        menu();
        cin >> op;
        system("cls");
        switch(op){
            case 0:
                lerArquivoTamanhoMatriz(1);
                criarMatrizAdjacencia();
                zerarMatrixAdjacencia();
                matrizAdjacencia();
                imprimirAdjacencia();
            break;
            case 1:
                lerArquivoTamanhoMatriz(0);
                criarMatrizIncidecia();
                zerarMatrixIncidencia();
                matrizIncidencia();
                imprimirIncidencia();
            break;
            case 2:
                Grau();
            break;
            case 3:
                quantidadeVert();
            break;
            case 4:
                Multigrafos();
            break;
            case 5:
                grafoCompleto();
            break;
            case 6:
                pseudografo();
            break;
            case 7:
                grafoRegular();
            break;
            case 8:
                grafosSimples();
            break;
            case 9:
                verticesAdjacentes();
            break;
            default:
                cout << "numero errado!!";
    }
    }
    system("pause");
    return 0;
}

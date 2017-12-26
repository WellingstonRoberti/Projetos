/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: junimRoberti
 *
 * Created on 12 de Outubro de 2016, 17:16
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int combinacao(int a, int b){
    
    if(b>a){
        swap(a,b);
    }
    int i = 0, r= 1, auxa = a, auxb = b, q1 = 0, q2 = 0, total = 0;
    while(r>0){
        if(i==0){
            q1 = a/b;
        }else if(i == 1){
            q2 = a/b;
        }
        r = a%b;
        a = b;
        b = r;
        total = 1 + q1*q2;
        i++;
    }
    cout << a;
    cout << " = ";
    cout << auxa;
    cout << ".(";
    cout << q2*-1;
    cout << ") + ";
    cout << auxb;
    cout << ".(";
    cout << total;
    cout << ")\n\n";
}
int euclides(int a, int b){
    int y;
    cout << "mdc(";
    cout << a;
    cout << ", ";
    cout << b;
    cout << ")\n";
    if(b == 0){
        cout << "mdc é :";
        cout << a;
        cout << "\n\n";
        return 0;
    }
    if(b>a){
        swap(a,b);
    }
    y = a % b;
   
   
    euclides(b, y);
    
}
int main(int argc, char** argv) {
    int c, d;
    cout <<"informe os valores para encontrar o mdc:\n";
    cin >> c;
    cout << "\n";
    cin >> d;
    euclides(c,d);
    combinacao(c,d);
}


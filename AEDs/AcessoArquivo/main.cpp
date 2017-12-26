/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: junimRoberti
 *
 * Created on 18 de Junho de 2016, 15:46
 */

#include <cstdlib>
#include <iostream>
#include <fstream>
#include <string>
using namespace std;

int main () {
  string line;
  ifstream myfile ("example.txt"); // ifstream = padrão ios:in
  if (myfile.is_open())
  {
    while (! myfile.eof() ) //enquanto end of file for false continua
    {
      getline (myfile,line); // como foi aberto em modo texto(padrão)
                             //e não binário(ios::bin) pega cada linha
      cout << line << endl;
    }
    myfile.close();
  }

  else cout << "Unable to open file"; 

  return 0;
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApplication2
{

	class Program
	{
		public static bool VerificaAutomato(string palavra, int i){
			bool aux = true;
			char[] Vetor = palavra.ToArray<char>();
			if (Vetor [i] == 'b' && Vetor [i + 1] == 'c') {
				if (Vetor [i + 2] == 'c')
					VerificaAutomato (palavra, i + 3);
				if (Vetor [i + 2] == 'a') {
					if (Vetor [i + 3] == 'a') {
						if (Vetor [i + 4] == 'c') {
							if (Vetor [i + 5] == 'c')
								VerificaAutomato (palavra, i + 6);
						}
					}
					if (Vetor [i + 3] == 'b') {
						if(Vetor [i + 4] == 'a'){
							if(Vetor [i + 5] == 'c'){
								aux = true;
								for (int o = i; o < palavra.Length - 1; o++){
									if (Vetor [o + 6] == 'b' || Vetor [o + 7] == 'c') {
										aux = true;
									} else {
										aux = false;
									}
								}
							}
						}
						if(Vetor [i + 4] == 'c'){
							aux = true;
							for (int o = i; o < palavra.Length - 1; o++){
								if (Vetor [o + 6] == 'b' || Vetor [o + 7] == 'c') {
									aux = true;
								} else {
									aux = false;
								}
							}
						}
					}
				}
			}
			else
			{
				aux = false;
			}
			return aux;
		}
		public static void Main(string[] args)
		{
			string palavra;
			Console.WriteLine("digite a palavra a ser aceita:");
			palavra = Console.ReadLine();
			if(VerificaAutomato(palavra, 0) == true)
			{
				Console.WriteLine("palavra aceita!");
			}else
			{
				Console.WriteLine("palavra nao aceita!");
			}
			Console.ReadKey();
		}
	}
}

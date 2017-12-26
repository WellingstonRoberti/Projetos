#include <cstdlib>
#include <stdio.h>
#include <stdlib.h>

void mergeSort(int *vetor, int posicaoInicio, int posicaoFim) {
    int i, j, k, metadeTamanho, *vetorTemp;

    if(posicaoInicio == posicaoFim) return;

    // ordenacao recursiva das duas metades
    metadeTamanho = (posicaoInicio + posicaoFim ) / 2;
    mergeSort(vetor, posicaoInicio, metadeTamanho);
    mergeSort(vetor, metadeTamanho + 1, posicaoFim);

    // intercalacao no vetor temporario t
    i = posicaoInicio;
    j = metadeTamanho + 1;
    k = 0;
    vetorTemp = (int *) malloc(sizeof(int) * (posicaoFim - posicaoInicio + 1));

    while(i < metadeTamanho + 1 || j  < posicaoFim + 1) {
        if (i == metadeTamanho + 1 ) { // i passou do final da primeira metade, pegar v[j]
            vetorTemp[k] = vetor[j];
            j++;
            k++;
        } 
        else {
            if (j == posicaoFim + 1) { // j passou do final da segunda metade, pegar v[i]
                vetorTemp[k] = vetor[i];
                i++;
                k++;
            } 
            else {
                if (vetor[i] < vetor[j]) { 
                    vetorTemp[k] = vetor[i];
                    i++;
                    k++;
                } 
                else { 
                    vetorTemp[k] = vetor[j];
                    j++;
                    k++;
                }
            }
        }

    }
    // copia vetor intercalado para o vetor original
    for(i = posicaoInicio; i <= posicaoFim; i++) {
        vetor[i] = vetorTemp[i - posicaoInicio];
    }
    free(vetorTemp);
}
int main ()
{
    int *vetorTempo;
    vetorTempo = (int*)malloc(sizeof(int)*20);
    int aux, i = 0, j = 1;
    FILE *arq;

	arq = fopen("arquivo.txt", "r+");
	if(arq == NULL)
			printf("Erro, nao foi possivel abrir o arquivo\n");
	else{
		while( (fscanf(arq,"%d", &aux))!=EOF )
		{
			vetorTempo[i]=aux;
			i++;
		}
        mergeSort(vetorTempo, 0, i);
        }
        freopen("arquivo.txt", "r+", arq);
         while( j != (i+1) )
		{
		    fprintf(arq,"%d ", vetorTempo[j]);
			j++;
		}
        fclose(arq);
        free(vetorTempo);
return 0;
}



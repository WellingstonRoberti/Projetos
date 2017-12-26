import numpy as np
import cv2


#--------------------------------------------------------------------------------------------------------------------------------
# FUNÇÃO PRINCIPAL
#--------------------------------------------------------------------------------------------------------------------------------

def Main():
#carregar uma imagem
    imagemMario = cv2.imread('imagem.png', cv2.IMREAD_GRAYSCALE)


    equal = cv2.equalizeHist(imagemMario)
    cv2.imshow('Imagem Original', imagemMario)


    height, width = imagemMario.shape
    numeroDePixels = float(height*width)


    vetorQuantidadeDePixelsPorCor = []
    vetorFrequenciaDePixelsPorCor = []
    vetorFrequenciaAcumulada      = []
    vetorNovoTom                  = []


    InicializaVetoresBase(vetorQuantidadeDePixelsPorCor, vetorFrequenciaDePixelsPorCor, vetorFrequenciaAcumulada, vetorNovoTom)
           
    
    vetorQuantidadeDePixelsPorCor = EncontraNumeroDePixelsDeCadaTom(imagemMario, height, width, vetorQuantidadeDePixelsPorCor )
    vetorFrequenciaDePixelsPorCor = EncontraAProbabilidadeDeCadaTom(vetorQuantidadeDePixelsPorCor, numeroDePixels, vetorFrequenciaDePixelsPorCor)
    vetorFrequenciaAcumulada = EncontraFrequenciaAcumulada(vetorFrequenciaDePixelsPorCor, vetorFrequenciaAcumulada)
    vetorNovoTom = EncontraNovoTom(vetorFrequenciaAcumulada, vetorNovoTom)
    imagemMario = TrocaTonsAntigosPelosNovos(imagemMario, vetorNovoTom, height, width)


    #Exibe uma imagem na tela
    cv2.imshow('Imagem retocada', imagemMario)
    cv2.imshow('Imagem utilizando a função equal do opencv', equal)
    cv2.waitKey(0)
    cv2.destroyAllWindows()


#--------------------------------------------------------------------------------------------------------------------------------
# FUNÇÕES GERAIS
#--------------------------------------------------------------------------------------------------------------------------------

    
def InicializaVetoresBase(vetorQuantidadeDePixelsPorCor, vetorFrequenciaDePixelsPorCor, vetorFrequenciaAcumulada, vetorNovoTom):
    for i in range (256):
        vetorQuantidadeDePixelsPorCor.append(0)
        vetorFrequenciaDePixelsPorCor.append(0.0)
        vetorFrequenciaAcumulada.append(0.0)
        vetorNovoTom.append(0)
      

 
def EncontraNumeroDePixelsDeCadaTom(imagemMario, height, width, vetorQuantidadeDePixelsPorCor):
    for k in range(0,height):
        for l in range(0,width):
            indice = imagemMario[k][l]
            vetorQuantidadeDePixelsPorCor[indice] = vetorQuantidadeDePixelsPorCor[indice]+1
    return vetorQuantidadeDePixelsPorCor



def EncontraAProbabilidadeDeCadaTom(vetorQuantidadeDePixelsPorCor, numeroDePixels, vetorFrequenciaDePixelsPorCor):
    for i in range(256):
        vetorFrequenciaDePixelsPorCor[i] = float(vetorQuantidadeDePixelsPorCor[i]/numeroDePixels)
    return vetorFrequenciaDePixelsPorCor



def EncontraFrequenciaAcumulada(vetorFrequenciaDePixelsPorCor, vetorFrequenciaAcumulada):
    vetorFrequenciaAcumulada[0] =  vetorFrequenciaDePixelsPorCor[0]

    for i in range(1, 256):
        vetorFrequenciaAcumulada[i] = (vetorFrequenciaAcumulada[i-1]+vetorFrequenciaDePixelsPorCor[i])
    return vetorFrequenciaAcumulada



def EncontraNovoTom(vetorFrequenciaAcumulada, vetorNovoTom):
    for i in range(256):
        a = float(255)
        vetorNovoTom[i] = vetorFrequenciaAcumulada[i]*a
    return vetorNovoTom



def TrocaTonsAntigosPelosNovos(imagemMario, vetorNovoTom, height, width):
    for k in range(0,height):
        for l in range(0,width):
            indice = imagemMario[k][l]
            imagemMario[k][l] = vetorNovoTom[indice]
    return imagemMario


    
if __name__ == "__main__":
    Main()



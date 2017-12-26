import numpy as np
import cv2
   
Imagem = cv2.imread('Bart.png', cv2.IMREAD_GRAYSCALE)

cv2.imshow('Original', Imagem)

Pixelporcor = []
Freqdepix = []
Freqacumulada = []
tomnovo = []
    
height, width = Imagem.shape
NumDPix = float(height*width)

for i in range (256):
    Pixelporcor.append(0)
    Freqdepix.append(0.0)
    Freqacumulada.append(0.0)
    tomnovo.append(0)           
    
for i in range(0,height):
    for j in range(0,width):
        x = Imagem[i][j]
        Pixelporcor[x] = Pixelporcor[x]+1
           
for i in range(256):
    Freqdepix[i] = float(Pixelporcor[i]/NumDPix)        
    Freqacumulada[0] =  Freqdepix[0]
  
for i in range(1, 256):
    Freqacumulada[i] = (Freqacumulada[i-1]+Freqdepix[i])
      
for i in range(256):
    y = float(255)
    tomnovo[i] = Freqacumulada[i]*y
        
for i in range(0,height):
    for j in range(0,width):
        z = Imagem[i][j]
        Imagem[i][j] = tomnovo[z]

cv2.imshow('Equalizada', Imagem)
cv2.waitKey(0)
cv2.destroyAllWindows()


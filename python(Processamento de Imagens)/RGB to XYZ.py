import numpy as np
import cv2


RED = 2
GREEN = 1
BLUE = 0

imagem = cv2.imread('messi.png')
for i in imagem:
    for j in imagem:
        B = imagem[i, j, BLUE]
        G = imagem[i, j, GREEN]
        R = imagem[i, j, RED]
        
        X=((R*0.490)+(G*0.310)+(B*0.200))
        Y=((R*0.177)+(G*0.813)+(B*0.011))
        Z=((R*0.000)+(G*0.010)+(B*0.990))
        imagem[i, j, BLUE] = Z
        imagem[i, j, GREEN] = Y
        imagem[i, j, RED] = X
        
cv2.waitKey(0)
cv2.destroyAllWindows()

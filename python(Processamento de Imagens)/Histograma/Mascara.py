import numpy as np
import cv2

i = 0
j = 0
x = 2
y = 2
c = 1
l = 1

Imagem = cv2.imread('Bart.png', cv2.IMREAD_GRAYSCALE)
cv2.imshow('Imagem Original', Imagem)




A = [[ 1,  1,  1],
    [ 0,  0,  0],
    [ 1,  1,  1]]

height, width = Imagem.shape

#centro
while(c != (height -1) and l != (width -1)): 
    for i in range(x):
        for j in range(y):
            P = Imagem[c, l]        
            Palt = P * A[i][j]
            Perm += Palt
    Imagem[c,l] = Perm
    l+=1
    if(l == (width-1)):
        c+=1
        l = 1
        
    x+=1
    i = x - 2
    if(x  == height):
        y+=1
        j = x - 2

#pontas
Imagem[0,0] = (A[1,1]*Imagem[0,0])+ (A[1,2]*Imagem[0,1])+(A[2,1]*Imagem[1,0])+(A[2,2]*Imagem[1,1])
Imagem[height,0] = (A[1,0]*Imagem[(height-1),0])+ (A[2,0]*Imagem[(height-1),1])+(A[1,1]*Imagem[height,0])+(A[0,2]*Imagem[height,1])
Imagem[0,width] = (A[0,1]*Imagem[0,(width-1)])+ (A[0,2]*Imagem[1,(widht-1)])+(A[1,1]*Imagem[0,width])+(A[1,2]*Imagem[1,widht])
Imagem[height,width] = (A[0,0]*Imagem[(height-1),(width-1)])+ (A[1,0]*Imagem[height,(width-1)])+(A[0,1]*Imagem[(height-1),width])+(A[1,1]*Imagem[height,width])

#laterais
a=0
Alt=1
b=0
h=1
z=0
while(a != height):
    for z in range(2):
        for h in range(2):
            pix = Imagem[a,h]
            pixAlt = pix * A[z][h]
            PixPerm+= pixAlt
        a+=1
        h=1
    Imagem[Alt,0] = PixPerm
    Alt+=1
    z=0
    h=0
    
a=0
Alt=1
b=0
h=1
z=0
while(a != height):
    for z in range(2):
        for h in range(1):
            pix = Imagem[a,width - h]
            pixAlt = pix * A[z][h]
            PixPerm+= pixAlt
        a+=1
        h=0
    Imagem[Alt,0] = PixPerm
    Alt+=1
    z=0
    h=0
    
Alt=1
b=0
h=1
z=0
while(b != width):
    for z in range(2):
        for h in range(2):
            pix = Imagem[z,b]
            pixAlt = pix * A[z][h]
            PixPerm+= pixAlt
        b+=1
        h=0
    Imagem[Alt,0] = PixPerm
    Alt+=1
    z=0
    
Alt=1
b=0
h=1
z=0
while(b != width):
    for z in range(2):
        for h in range(1):
            pix = Imagem[b,heigth - h]
            pixAlt = pix * A[z][h]
            PixPerm+= pixAlt
        b+=1
        h=0
    Imagem[Alt,0] = PixPerm
    Alt+=1
    z=0
    
cv2.imshow('Imagem com filtro', Imagem)
cv2.imshow('Imagem Original', img)

cv2.waitKey(0)
cv2.destroyAllWindows()

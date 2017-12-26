import numpy as np
import cv2

imagem = cv2.imread("imagem.jpg")
esc = cv2.imread("imagem.jpg")

height, width, channels = imagem.shape

for x in range(0, width):
	for y in range(0, height):
		(r, g, b) = imagem[y,x]
		esc[y,x] = (0.498*r + 0.387*g + 0.115*b)

#cv2.imwrite("imagem2.jpg", esc)
cv2.imshow("Imagem Normal", imagem)
cv2.imshow("Imagem Preto e Branco", esc)

cv2.waitKey(0)
cv2.destroyAllWindows()

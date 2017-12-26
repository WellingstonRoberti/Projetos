import numpy as np
import cv2

img1 = cv2.imread('Imagem1.png')
img2 = cv2.imread('Imagem2.png')

[y, x, c] = img2.shape
img1 = cv2.resize(img1, (x, y))

imgDst = cv2.addWeighted(img1, 0.7, img2, 0.3, 0)

cv2.imshow('dst', imgDst)
cv2.waitKey(0)
cv2.destroyAllWindows()

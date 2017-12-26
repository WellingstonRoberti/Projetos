import cv2
import numpy as np
from matplotlib import pyplot as plt

RED = 2
GREEN = 1
BLUE = 0

img = cv2.imread('julienewmar.jpg')

px = img[100, 100]
print 'Pixel value at 100, 100: ', px

# acessando apenas o pixel azul
blue = img[100, 100, BLUE]
print 'Blue value at 100, 100: ', blue

# modificando os valores do pixel
img[100, 100] = [255, 255, 255]
print 'Pixel value at 100, 100: ', img[100, 100]

# acessando valor VERMELHO
print 'Old red value at 10, 10: ', img.item(10, 10, RED)

# modificando valor VERMELHO
img.itemset((10, 10, RED), 100)
print 'New red value at 10, 10: ', img.item(10, 10, RED)

print 'Rows, Columns, Channels: ', img.shape

print img.size, ' pixels'

print 'Image datatype: ', img.dtype

#circle = img[280:340, 330:390]
#img[273:333, 100:160] = circle

# separando os canais de cores
b, g, r = cv2.split(img)

# juntando os canais de cores
img = cv2.merge((b, g, r))

laplacian = cv2.Laplacian(img, cv2.CV_64F)
sobelx = cv2.Sobel(img, cv2.CV_64F, 1, 0, ksize=5)
sobely = cv2.Sobel(img, cv2.CV_64F, 0, 1, ksize=5)
sobelx64f = cv2.Sobel(img, cv2.CV_64F, 1, 0, ksize=5)
abs_sobel64f = np.absolute(sobelx64f)
sobel_8u = np.uint8(abs_sobel64f)
edges = cv2.Canny(img, 100, 200)

# subplot LCI Lines, Columns, Image
plt.subplot(331), plt.imshow(cv2.cvtColor(img, cv2.COLOR_BGR2RGB)), plt.title('ORIGINAL')
plt.subplot(332), plt.imshow(img, 'gray'), plt.title('GRAYSCALE')
plt.subplot(333), plt.imshow(laplacian, cmap = 'gray'), plt.title('LAPLACIAN')
plt.subplot(334), plt.imshow(sobelx, cmap = 'gray'), plt.title('SOBELX')
plt.subplot(335), plt.imshow(sobely, cmap = 'gray'), plt.title('SOBELY')
plt.subplot(336), plt.imshow(sobel_8u, cmap = 'gray'), plt.title('Sobel abs(CV_64F)')
plt.subplot(337), plt.imshow(edges, cmap = 'gray'), plt.title('Canny Edge')
plt.axis("off")
plt.show()

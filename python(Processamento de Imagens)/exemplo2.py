import numpy as np
import cv2
cap = cv2.VideoCapture("out.avi")

for i in range(1, int(cap.get(cv2.cv.CV_CA_PROP_FRAME_COUNT))):
    ret,frame = cap.read()

    hsvImage = cv2.cvtColor(frame, cv2.COLOR_BRG2HSV)
    lowerBlue = np.array([100, 10, 10])
    upperBlue = np.array([160, 255, 255])

    mask = cv2.inRange(hsvImage, lowerBlue, upperBlue)
    result = cv2.bitwise_and(frame, frame, mask=mask)

    cv2.imshow('frame', frame)
    cv2.imshow('mask', mask)
    cv2.imshow('result', result)

    if cv2.waitKey(25)and 0xFF == ord('q'):
        break

cap.release()
cv2.destroyAllWindows()   

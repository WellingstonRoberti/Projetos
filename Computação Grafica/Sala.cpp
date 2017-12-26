#include <windows.h>
#include <stdlib.h>
#include<GL/glut.h>

#include <GL/glut.h>
#include <stdlib.h>

GLfloat X = 0.0f; //  movimentação ma tela, setas esq, dir, p/ cima, p/ baixo
GLfloat Y = 0.0f;

void desenha(void)
{
    glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
    glLoadIdentity();

    glTranslatef(X, Y, 0.0f);    //para movimentação da tela
    glutPostRedisplay();
     glColor3f(1,1,1);
     glBegin(GL_LINES);//referencia
        glVertex3f(5, 5, 0.0);
        glVertex3f(-5, -5, 0.0);
        glVertex3f(-5, 5, 0.0);
        glVertex3f(5, -5, 0.0);
     glEnd();
    glColor3f(1,0.4,0.1);
    glBegin(GL_POLYGON);//porta
        glVertex3f(1, 0.9, 0.0);
        glVertex3f(0.7, 0.6, 0.0);
        glVertex3f(0.7, -0.7, 0.0);
        glVertex3f(1, -1, 0.0);
    glEnd();
    glColor3f(1,1,1);
    glBegin(GL_POLYGON);//porta
        glVertex3f(0.93, -0.01, 0.0);
        glVertex3f(0.93, -0.05, 0.0);
        glVertex3f(0.95, -0.05, 0.0);
        glVertex3f(0.95, -0.01, 0);
    glEnd();
    glBegin(GL_LINES);//porta
        glVertex3f(0.72, 0.58, 0.0);
        glVertex3f(0.72,-0.72, 0.0);
        glVertex3f(0.98, 0.84, 0.0);
        glVertex3f(0.98, -0.98, 0.0);
        glVertex3f(0.98, 0.84, 0.0);
        glVertex3f(0.72, 0.58, 0.0);
    glEnd();
    glColor3f(0.3,0.3,0.3);
    glBegin(GL_POLYGON);//sofa
        glVertex3f(0.6, -0.6, 0);
        glVertex3f(0.6, -0.15, 0);
        glVertex3f(0.3, 0, 0);
        glVertex3f(0.15, 0, 0);
        glVertex3f(0.15, -0.15, 0);
        glVertex3f(0.07, -0.15, 0);
        glVertex3f(0.07, -0.25, 0);
        glVertex3f(0.3, -0.6, 0);
    glEnd();
    glColor3f(1,1,1);
    glBegin(GL_LINES);//sofa
        glVertex3f(0.6, -0.6, 0);
        glVertex3f(0.6, -0.15, 0);
        glVertex3f(0.6, -0.15, 0);
        glVertex3f(0.3, 0, 0);
        glVertex3f(0.3, 0, 0);
        glVertex3f(0.15, 0, 0);
        glVertex3f(0.15, 0, 0);
        glVertex3f(0.15, -0.15, 0);
        glVertex3f(0.15, -0.15, 0);
        glVertex3f(0.07, -0.15, 0);
        glVertex3f(0.07, -0.15, 0);
        glVertex3f(0.07, -0.25, 0);
        glVertex3f(0.07, -0.25, 0);
        glVertex3f(0.3, -0.6, 0);
        glVertex3f(0.3, -0.6, 0);
        glVertex3f(0.6, -0.6, 0);
        glVertex3f(0.3, -0.6, 0);
        glVertex3f(0.3, -0.4, 0);
        glVertex3f(0.26, -0.6, 0);
        glVertex3f(0.26, -0.35, 0);
        glVertex3f(0.26, -0.35, 0);
        glVertex3f(0.3, -0.4, 0);
        glVertex3f(0.3, -0.4, 0);
        glVertex3f(0.4, -0.4, 0);
        glVertex3f(0.26, -0.35, 0);
        glVertex3f(0.35, -0.35, 0);
        glVertex3f(0.35, -0.35, 0);
        glVertex3f(0.4, -0.4, 0);
        glVertex3f(0.4, -0.4, 0);
        glVertex3f(0.4, -0.15, 0);
        glVertex3f(0.35, -0.35, 0);
        glVertex3f(0.35, -0.13, 0);
        glVertex3f(0.4, -0.15, 0);
        glVertex3f(0.6, -0.15, 0);
        glVertex3f(0.35, -0.13, 0);
        glVertex3f(0.5, -0.13, 0);
        glVertex3f(0.5, -0.13, 0);
        glVertex3f(0.28, -0.02, 0);
        glVertex3f(0.28, -0.02, 0);
        glVertex3f(0.19, -0.02, 0);
        glVertex3f(0.19, -0.02, 0);
        glVertex3f(0.19, -0.19, 0);
        glVertex3f(0.19, -0.19, 0);
        glVertex3f(0.1, -0.19, 0);
        glVertex3f(0.1, -0.19, 0);
        glVertex3f(0.1, -0.35, 0);
        glVertex3f(0.28, -0.02, 0);
        glVertex3f(0.28, -0.235, 0);
        glVertex3f(0.28, -0.235, 0);
        glVertex3f(0.12, -0.235, 0);
        glVertex3f(0.12, -0.235, 0);
        glVertex3f(0.12, -0.35, 0);
        glVertex3f(0.12, -0.235, 0);
        glVertex3f(0.26, -0.4, 0);
        glVertex3f(0.28, -0.235, 0);
        glVertex3f(0.35, -0.3, 0);
        glVertex3f(0.4, -0.15, 0);
        glVertex3f(0.35, -0.13, 0);
        glVertex3f(0.19, -0.19, 0);
        glVertex3f(0.1, -0.1, 0);
        glVertex3f(0.15, 0, 0);
        glVertex3f(0.19, -0.02, 0);
        glVertex3f(0.1, -0.19, 0);
        glVertex3f(0.07, -0.15, 0);


    glEnd();
    glColor3f(1,1,1);
    glBegin(GL_POLYGON);//tapete
        glVertex3f(0.3, -0.6, 0);
        glVertex3f(0.07, -0.25, 0);
        glVertex3f(-0.07, -0.25, 0);
        glVertex3f(-0.3, -0.6, 0);
    glEnd();
    glColor3f(1,0.4,0.1);
    glBegin(GL_POLYGON);//comoda
        glVertex3f(-0.11, -0.25, 0);
        glVertex3f(-0.11, -0.19, 0);
        glVertex3f(-0.25, -0.19, 0);
        glVertex3f(-0.5, -0.4, 0);
        glVertex3f(-0.5, -0.5, 0);
        glVertex3f(-0.3, -0.5, 0);
    glEnd();
    glColor3f(1,1,1);
    glBegin(GL_LINES);//comoda
        glVertex3f(-0.11, -0.25, 0);
        glVertex3f(-0.11, -0.19, 0);
        glVertex3f(-0.11, -0.19, 0);
        glVertex3f(-0.25, -0.19, 0);
        glVertex3f(-0.25, -0.19, 0);
        glVertex3f(-0.5, -0.4, 0);
        glVertex3f(-0.5, -0.4, 0);
        glVertex3f(-0.5, -0.5, 0);
        glVertex3f(-0.5, -0.5, 0);
        glVertex3f(-0.3, -0.5, 0);
        glVertex3f(-0.3, -0.5, 0);
        glVertex3f(-0.11, -0.25, 0);
        glVertex3f(-0.5, -0.4, 0);
        glVertex3f(-0.3, -0.4, 0);
        glVertex3f(-0.3, -0.4, 0);
        glVertex3f(-0.3, -0.5, 0);
        glVertex3f(-0.3, -0.4, 0);
        glVertex3f(-0.11, -0.19, 0);
    glEnd();
    glColor3f(0,0,0);
    glBegin(GL_POLYGON);//tv
        glVertex3f(-0.35, -0.37, 0);
        glVertex3f(-0.4, -0.37, 0);
        glVertex3f(-0.4, -0.35, 0);
        glVertex3f(-0.35, -0.3, 0);
        glVertex3f(-0.35, -0.27, 0);
        glVertex3f(-0.3, -0.23, 0);
        glVertex3f(-0.3, -0.25, 0);
        glVertex3f(-0.25, -0.25, 0);
        glVertex3f(-0.25, -0.27, 0);
    glEnd();
    glColor3f(0.7,0.7,0.7);
    glBegin(GL_POLYGON);//tv
        glVertex3f(-0.41, -0.09, 0);
        glVertex3f(-0.41, -0.3, 0);
        glVertex3f(-0.27, -0.19, 0);
        glVertex3f(-0.27, -0.06, 0);
    glEnd();
    glColor3f(1,1,1);
    glBegin(GL_LINES);//tv
        glVertex3f(-0.35, -0.37, 0);
        glVertex3f(-0.4, -0.37, 0);
        glVertex3f(-0.4, -0.37, 0);
        glVertex3f(-0.4, -0.35, 0);
        glVertex3f(-0.4, -0.35, 0);
        glVertex3f(-0.35, -0.3, 0);
        glVertex3f(-0.35, -0.3, 0);
        glVertex3f(-0.35, -0.27, 0);
        glVertex3f(-0.35, -0.27, 0);
        glVertex3f(-0.3, -0.23, 0);
        glVertex3f(-0.3, -0.23, 0);
        glVertex3f(-0.3, -0.25, 0);
        glVertex3f(-0.3, -0.25, 0);
        glVertex3f(-0.25, -0.25, 0);
        glVertex3f(-0.25, -0.25, 0);
        glVertex3f(-0.25, -0.27, 0);
        glVertex3f(-0.25, -0.27, 0);
        glVertex3f(-0.35, -0.37, 0);
        glVertex3f(-0.4, -0.35, 0);
        glVertex3f(-0.35, -0.35, 0);
        glVertex3f(-0.35, -0.35, 0);
        glVertex3f(-0.35, -0.37, 0);
        glVertex3f(-0.35, -0.35, 0);
        glVertex3f(-0.25, -0.25, 0);
        glVertex3f(-0.35, -0.3, 0);
        glVertex3f(-0.32, -0.3, 0);
        glVertex3f(-0.32, -0.3, 0);
        glVertex3f(-0.3, -0.28, 0);
        glVertex3f(-0.3, -0.28, 0);
        glVertex3f(-0.3, -0.23, 0);
        glVertex3f(-0.32, -0.3, 0);
        glVertex3f(-0.32, -0.24, 0);
        glVertex3f(-0.35, -0.27, 0);
        glVertex3f(-0.26, -0.2, 0);
        glVertex3f(-0.26, -0.2, 0);
        glVertex3f(-0.26, -0.04, 0);
        glVertex3f(-0.26, -0.04, 0);
        glVertex3f(-0.42, -0.08, 0);
        glVertex3f(-0.42, -0.08, 0);
        glVertex3f(-0.42, -0.33, 0);
        glVertex3f(-0.42, -0.33, 0);
        glVertex3f(-0.44, -0.33, 0);
        glVertex3f(-0.44, -0.33, 0);
        glVertex3f(-0.44, -0.08, 0);
        glVertex3f(-0.42, -0.08, 0);
        glVertex3f(-0.44, -0.08, 0);
        glVertex3f(-0.44, -0.08, 0);
        glVertex3f(-0.28, -0.04, 0);
        glVertex3f(-0.28, -0.04, 0);
        glVertex3f(-0.26, -0.04, 0);//começo da janela V
        glVertex3f(-0.55, -0.1, 0);
        glVertex3f(-0.55, 0.1, 0);
        glVertex3f(-0.55, 0.1, 0);
        glVertex3f(-0.8, 0.15, 0);
        glVertex3f(-0.8, 0.15, 0);
        glVertex3f(-0.8, -0.25, 0);
        glVertex3f(-0.8, -0.25, 0);
        glVertex3f(-0.55, -0.1, 0);//fim de fora
        glVertex3f(-0.57, -0.09, 0);
        glVertex3f(-0.57, 0.08, 0);
        glVertex3f(-0.57, 0.08, 0);
        glVertex3f(-0.78, 0.12, 0);
        glVertex3f(-0.78, 0.12, 0);
        glVertex3f(-0.78, -0.21, 0);
        glVertex3f(-0.78, -0.21, 0);
        glVertex3f(-0.57, -0.09, 0);
        glVertex3f(-0.67, -0.15, 0);
        glVertex3f(-0.67, 0.1, 0);
    glEnd();
    glColor3f(1,1,1);
    glBegin(GL_POLYGON);
        glVertex3f(-0.64, -0.01, 0.0);
        glVertex3f(-0.64, 0.01, 0.0);
        glVertex3f(-0.65, 0.01, 0.0);
        glVertex3f(-0.65, -0.01, 0);
    glEnd();

    glFlush();
}

void key(unsigned char key, int x, int y)
{
    if( key == 'q' || key == 'Q')
        exit(0);
}


// movimentar a tela
void specialKey(int key, int x, int y) {
    switch(key) {
        case GLUT_KEY_LEFT :
            X -= 0.1f;
          break;
        case GLUT_KEY_RIGHT :
            X +=  0.1f;
          break;
        case GLUT_KEY_UP :
            Y += 0.1f;
          break;
        case GLUT_KEY_DOWN :
            Y -= 0.1f;
          break;
    }
}

void resize(int w, int h)
{
    glViewport(0, 0, (GLsizei)w, (GLsizei)h);
    glMatrixMode(GL_PROJECTION);
    glLoadIdentity();
    gluOrtho2D (-1.1, 1.1 , -1.1 , 1.1);
    glMatrixMode(GL_MODELVIEW);
    glLoadIdentity();
}

int main(int argc, char** argv)
{
    glutInit(&argc, argv);
    glutInitDisplayMode(GLUT_SINGLE | GLUT_RGB);
    glutInitWindowSize(500,500);
    glutInitWindowPosition(100, 100);
    glutCreateWindow("Introdução a OPENGL - Computação Gráfica - março/2013");
    glutDisplayFunc(desenha);
    glutSpecialFunc(specialKey);
    glutReshapeFunc(resize);
    glutKeyboardFunc(key);
    glutMainLoop();

    return 0;
}


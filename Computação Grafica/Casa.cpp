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
        glVertex3f(0, 1.1, 0.0);
        glVertex3f(1.1, -1.1, 0.0);
        glVertex3f(1.1, 1.1, 0.0);
        glVertex3f(0, -1.1, 0.0);
        glVertex3f(-1.1, 1.1, 0.0);
        glVertex3f(0, -1.1, 0.0);
        glVertex3f(-1.1, -1.1, 0.0);
        glVertex3f(0, 1.1, 0.0);
    glEnd();
    glColor3f(0.5,0.5,0.5);
    glBegin(GL_POLYGON);
        glVertex3f(-0.2, 0.7, 0.0);
        glVertex3f(0.1, 0.9, 0.0);
        glVertex3f(0.36, 0.38, 0.0);
        glVertex3f(0.36, -0.3, 0.0);
        glVertex3f(0, -1, 0.0);
        glVertex3f(-0.36, -0.31, 0.0);
        glVertex3f(-0.35, 0.4, 0.0);
     glEnd();
     glColor3f(1,0.5,0);
     glBegin(GL_POLYGON);
       glVertex3f(0.1, 0.9, 0.0);
        glVertex3f(-0.2, 0.7, 0.0);
        glVertex3f(-0.35, 0.4, 0.0);
        glVertex3f(0, 0.6, 0.0);
        glVertex3f(0.36, 0.38, 0.0);
     glEnd();
    glColor3f(1,1,1);
     glBegin(GL_LINES);
        glVertex3f(0.1, 0.9, 0.0);
        glVertex3f(0.36, 0.38, 0.0);
        glVertex3f(0.36, 0.38, 0.0);
        glVertex3f(0.36, -0.3, 0.0);
        glVertex3f(0.36, -0.3, 0.0);
        glVertex3f(0, -1, 0.0);
        glVertex3f(0, -1, 0.0);
        glVertex3f(-0.36, -0.31, 0.0);
        glVertex3f(-0.36, -0.31, 0.0);
        glVertex3f(-0.35, 0.4, 0.0);
        glVertex3f(-0.35, 0.4, 0.0);
        glVertex3f(-0.15, 0.8, 0.0);
        glVertex3f(0, 0.6, 0.0);
        glVertex3f(0, -1, 0.0);
        glVertex3f(0, 0.6, 0.0);
        glVertex3f(-0.35, 0.4, 0.0);
        glVertex3f(0, 0.6, 0.0);
        glVertex3f(0.36, 0.38, 0.0);
        glVertex3f(0.1, 0.9, 0.0);
        glVertex3f(0, 0.6, 0.0);
        glVertex3f(0.1, 0.9, 0.0);
        glVertex3f(-0.2, 0.7, 0.0);
     glEnd();
    glBegin(GL_POLYGON);
        glVertex3f(-0.3, 0.15, 0.0);
        glVertex3f(-0.3, -0.22, 0.0);
        glVertex3f(-0.22, -0.32, 0.0);
        glVertex3f(-0.22, 0.2, 0.0);
     glEnd();
    glBegin(GL_POLYGON);
       glVertex3f(-0.18, 0.22, 0.0);
       glVertex3f(-0.18, -0.35, 0.0);
       glVertex3f(-0.07, -0.48, 0.0);
       glVertex3f(-0.07, 0.29, 0.0);
     glEnd();
    glBegin(GL_POLYGON);
       glVertex3f(0.07, -0.48, 0.0);
       glVertex3f(0.07, 0.29, 0.0);
       glVertex3f(0.18, 0.22, 0.0);
       glVertex3f(0.18, -0.35, 0.0);
    glEnd();
    glBegin(GL_POLYGON);
       glVertex3f(0.25, -0.51, 0.0);
       glVertex3f(0.25, 0.18, 0.0);
       glVertex3f(0.32, 0.13, 0.0);
       glVertex3f(0.32, -0.38, 0.0);
    glEnd();
    glColor3f(0,0,0);
    glBegin(GL_LINES);// 1 janela
        glVertex3f(-0.3, 0.15, 0.0);
        glVertex3f(-0.3, -0.22, 0.0);
        glVertex3f(-0.3, -0.22, 0.0);
        glVertex3f(-0.22, -0.32, 0.0);
        glVertex3f(-0.22, -0.32, 0.0);
        glVertex3f(-0.22, 0.2, 0.0);
        glVertex3f(-0.22, 0.2, 0.0);
        glVertex3f(-0.3, 0.15, 0.0);
        glVertex3f(-0.3, -0.05, 0.0);
        glVertex3f(-0.22, -0.07, 0.0);
        glVertex3f(-0.26, -0.27, 0.0);
        glVertex3f(-0.26, 0.18, 0.0);
     glEnd();
      glBegin(GL_LINES);//2 janela
       glVertex3f(-0.18, 0.22, 0.0);
       glVertex3f(-0.18, -0.35, 0.0);
       glVertex3f(-0.18, -0.35, 0.0);
       glVertex3f(-0.07, -0.48, 0.0);
       glVertex3f(-0.07, -0.48, 0.0);
       glVertex3f(-0.07, 0.29, 0.0);
       glVertex3f(-0.07, 0.29, 0.0);
       glVertex3f(-0.18, 0.22, 0.0);
       glVertex3f(-0.13, 0.25, 0.0);
       glVertex3f(-0.13, -0.41, 0.0);
       glVertex3f(-0.18, -0.08, 0.0);
       glVertex3f(-0.07, -0.11, 0.0);
     glEnd();
      glBegin(GL_LINES);//3 janela
       glVertex3f(0.07, -0.48, 0.0);
       glVertex3f(0.07, 0.29, 0.0);
       glVertex3f(0.07, 0.29, 0.0);
       glVertex3f(0.18, 0.22, 0.0);
       glVertex3f(0.18, 0.22, 0.0);
       glVertex3f(0.18, -0.35, 0.0);
       glVertex3f(0.18, -0.35, 0.0);
       glVertex3f(0.07, -0.48, 0.0);
       glVertex3f(0.07, -0.11, 0.0);
       glVertex3f(0.18, -0.08, 0.0);
       glVertex3f(0.13, -0.41, 0.0);
       glVertex3f(0.13, 0.255, 0.0);
    glEnd();
     glBegin(GL_LINES);
       glVertex3f(0.25, -0.51, 0.0);
       glVertex3f(0.25, 0.18, 0.0);
       glVertex3f(0.25, 0.18, 0.0);
       glVertex3f(0.32, 0.13, 0.0);
       glVertex3f(0.32, 0.13, 0.0);
       glVertex3f(0.32, -0.38, 0.0);
       glVertex3f(0.32, -0.38, 0.0);
       glVertex3f(0.25, -0.51, 0.0);//linhas de fora
       glVertex3f(0.26, -0.5, 0.0);
       glVertex3f(0.26, 0.15, 0.0);
       glVertex3f(0.26, 0.15, 0.0);
       glVertex3f(0.31, 0.12, 0.0);
       glVertex3f(0.31, 0.12, 0.0);
       glVertex3f(0.31, -0.4, 0.0);
       glVertex3f(0.31, -0.4, 0.0);
       glVertex3f(0.26, -0.5, 0.0);
    glEnd();
    glBegin(GL_POLYGON);
       glVertex3f(0.29, -0.13, 0.0);
       glVertex3f(0.29, -0.11, 0.0);
       glVertex3f(0.3, -0.11, 0.0);
       glVertex3f(0.3, -0.13, 0.0);
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


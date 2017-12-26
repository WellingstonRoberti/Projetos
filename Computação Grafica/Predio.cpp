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
    glColor3f(0.5,0.5,0.5);
    glBegin(GL_POLYGON);
        glVertex3f(-0.4,0.7,0.0);
        glVertex3f(0,0.783,0.0);
        glVertex3f(0.4,0.7,0.0);
        glVertex3f(0.182,-0.223,0.0);
        glVertex3f(0,-0.5,0);
        glVertex3f(-0.182,-0.223,0.0);
    glEnd();
     glColor3f(1,1,1);
     glBegin(GL_LINES);//referencia
        glVertex3f(1, 1, 0.0);
        glVertex3f(-0.4,0.7,0);
        glVertex3f(-1, 1, 0.0);
        glVertex3f(0.4,0.7,0);
        glVertex3f(1, 1, 0.0);
        glVertex3f(0,0.5,0);
        glVertex3f(-1, 1, 0.0);
        glVertex3f(0,0.5,0);
        glVertex3f(1, 1, 0.0);
        glVertex3f(0,-0.5,0);
        glVertex3f(-1, 1, 0.0);
        glVertex3f(0,-0.5,0);
        glVertex3f(1, 1, 0.0);
        glVertex3f(0,-1,0);
        glVertex3f(-1, 1, 0.0);
        glVertex3f(0,-1,0);
        glVertex3f(0,-1,0);
        glVertex3f(0,0.5,0);
        glVertex3f(0,-1,0);
        glVertex3f(0.4,0.7,0);
        glVertex3f(0,-1,0);
        glVertex3f(-0.4,0.7,0);
    glEnd();
    glColor3f(1,1,1);
     glBegin(GL_POLYGON);
     glVertex3f(0,0.55,0);
     glVertex3f(-0.28,0.685,0);
     glVertex3f(0,0.75,0);
     glVertex3f(0.28,0.685,0);
     glEnd();
     glColor3f(0,0.9,1);
    glBegin(GL_POLYGON);
     glVertex3f(-0.0265,-0.07,0);
     glVertex3f(-0.0207,-0.28,0);
     glVertex3f(-0.069,-0.22,0);
     glVertex3f(-0.085,-0.017,0);
    glEnd();
    glBegin(GL_POLYGON);
     glVertex3f(-0.243,0.15,0);
     glVertex3f(-0.202,-0.05,0);
     glVertex3f(-0.145,-0.12,0);
     glVertex3f(-0.178,0.08,0);
    glEnd();
    glBegin(GL_POLYGON);
     glVertex3f(0.243,0.15,0);
     glVertex3f(0.202,-0.05,0);
     glVertex3f(0.145,-0.12,0);
     glVertex3f(0.178,0.08,0);
    glEnd();
    glBegin(GL_POLYGON);
     glVertex3f(0.0265,-0.07,0);
     glVertex3f(0.0207,-0.28,0);
     glVertex3f(0.069,-0.22,0);
     glVertex3f(0.085,-0.017,0);
    glEnd();
    glBegin(GL_POLYGON);
     glVertex3f(-0.32,0.505,0);
     glVertex3f(-0.282,0.33,0);
     glVertex3f(-0.21,0.27,0);
     glVertex3f(-0.24,0.45,0);
    glEnd();
    glBegin(GL_POLYGON);
     glVertex3f(-0.04,0.33,0);
     glVertex3f(-0.034,0.13,0);
     glVertex3f(-0.104,0.188,0);
     glVertex3f(-0.12,0.38,0);
    glEnd();
    glBegin(GL_POLYGON);
     glVertex3f(0.24,0.45,0);
     glVertex3f(0.21,0.27,0);
     glVertex3f(0.282,0.33,0);
     glVertex3f(0.32,0.505,0);
    glEnd();
    glBegin(GL_POLYGON);
     glVertex3f(0.04,0.33,0);
     glVertex3f(0.034,0.13,0);
     glVertex3f(0.104,0.188,0);
     glVertex3f(0.12,0.38,0);
    glEnd();
    glColor3f(1,1,1);
    glBegin(GL_LINES);
     glVertex3f(-0.36,0.53,0);
     glVertex3f(0,0.3,0);
     glVertex3f(-0.32,0.355,0);
     glVertex3f(0,0.1,0);
     glVertex3f(-0.275,0.18,0);
     glVertex3f(0,-0.1,0);
     glVertex3f(-0.235,0,0);
     glVertex3f(0,-0.3,0);
     glVertex3f(0.36,0.53,0);
     glVertex3f(0,0.3,0);
     glVertex3f(0.32,0.355,0);
     glVertex3f(0,0.1,0);
     glVertex3f(0.275,0.18,0);
     glVertex3f(0,-0.1,0);
     glVertex3f(0.235,0,0);
     glVertex3f(0,-0.3,0);
    glEnd();
    glBegin(GL_LINES);
     glVertex3f(0.04,0.33,0);
     glVertex3f(0.034,0.13,0);
     glVertex3f(0.08,0.35,0);
     glVertex3f(0.069,0.155,0);
     glVertex3f(0.12,0.38,0);
     glVertex3f(0.104,0.188,0);
     glVertex3f(0.16,0.4,0);
     glVertex3f(0.14,0.218,0);
     glVertex3f(0.2,0.43,0);
     glVertex3f(0.174,0.245,0);
     glVertex3f(0.24,0.45,0);
     glVertex3f(0.21,0.27,0);
     glVertex3f(0.28,0.48,0);
     glVertex3f(0.247,0.3,0);
     glVertex3f(0.32,0.505,0);
     glVertex3f(0.282,0.33,0);//direita
     glVertex3f(-0.04,0.33,0);
     glVertex3f(-0.034,0.13,0);
     glVertex3f(-0.08,0.35,0);
     glVertex3f(-0.069,0.155,0);
     glVertex3f(-0.12,0.38,0);
     glVertex3f(-0.104,0.188,0);
     glVertex3f(-0.16,0.4,0);
     glVertex3f(-0.14,0.218,0);
     glVertex3f(-0.2,0.43,0);
     glVertex3f(-0.174,0.245,0);
     glVertex3f(-0.24,0.45,0);
     glVertex3f(-0.21,0.27,0);
     glVertex3f(-0.28,0.48,0);
     glVertex3f(-0.247,0.3,0);
     glVertex3f(-0.32,0.505,0);
     glVertex3f(-0.282,0.33,0);
    glEnd();
    glBegin(GL_LINES);
     glVertex3f(-0.0265,-0.07,0);
     glVertex3f(-0.0207,-0.28,0);
     glVertex3f(-0.057,-0.036,0);
     glVertex3f(-0.045,-0.24,0);
     glVertex3f(-0.085,-0.017,0);
     glVertex3f(-0.069,-0.22,0);
     glVertex3f(-0.115,0.01,0);
     glVertex3f(-0.093,-0.18,0);
     glVertex3f(-0.147,0.05,0);
     glVertex3f(-0.12,-0.15,0);
     glVertex3f(-0.178,0.08,0);
     glVertex3f(-0.145,-0.12,0);
     glVertex3f(-0.21,0.11,0);
     glVertex3f(-0.174,-0.08,0);
     glVertex3f(-0.243,0.15,0);
     glVertex3f(-0.202,-0.05,0);//esquerda
     glVertex3f(0.0265,-0.07,0);
     glVertex3f(0.0207,-0.28,0);
     glVertex3f(0.057,-0.036,0);
     glVertex3f(0.045,-0.24,0);
     glVertex3f(0.085,-0.017,0);
     glVertex3f(0.069,-0.22,0);
     glVertex3f(0.115,0.01,0);
     glVertex3f(0.093,-0.18,0);
     glVertex3f(0.147,0.05,0);
     glVertex3f(0.12,-0.15,0);
     glVertex3f(0.178,0.08,0);
     glVertex3f(0.145,-0.12,0);
     glVertex3f(0.21,0.11,0);
     glVertex3f(0.174,-0.08,0);
     glVertex3f(0.243,0.15,0);
     glVertex3f(0.202,-0.05,0);
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


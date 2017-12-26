/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientação.objeto.biblioteca;

/**
 *
 * @author junimRoberti
 */
public class Revista extends Exemplares{
        private int QtCopias;
        private int edicao;
        public Revista(int codigo, String nome, int TipoExemplar, int QtCopias,int edicao, int disponivel){
            super(codigo, nome, TipoExemplar, disponivel);
            this.QtCopias = QtCopias;
            this.edicao = edicao;
        }
        public void disponibilidade(){
            if(this.QtCopias == 0){
                this.setDisponvel(0);
            }else if(this.QtCopias > 0){
                this.setDisponvel(1);
            }
        }
        public int VerificaRev(String NomeDoUsuario){
            if(NomeDoUsuario.equals(this.Nome)){
               return 1;
            }
            return 0; 
        }
        public int QtCopiasRev(String NomeDoLivro, Revista Revista){
            if(NomeDoLivro.equals(Revista.getNome())){
               return QtCopias;
            }
            return 0;
        }
        /**
         * @return the QtCopiasRev
         */
        public int getQtCopias() {
            return QtCopias;
        }

        /**
         * @param QtCopiasRev the QtCopiasRev to set
         */
        public void setQtCopiasRev(int QtCopiasRev) {
            this.QtCopias = QtCopiasRev;
        }

        /**
         * @return the edicao
         */
        public int getEdicao() {
            return edicao;
        }

        /**
         * @param edicao the edicao to set
         */
        public void setEdicao(int edicao) {
            this.edicao = edicao;
        }
    }

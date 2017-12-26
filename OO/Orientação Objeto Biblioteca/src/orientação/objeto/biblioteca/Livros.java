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
public class Livros extends Exemplares {
        private String autor;
        private String editora;
        private int edicao;
        private int QtCopias;
        public Livros(int codigo, String Nome, int TipoExemplar, String autor,  String editora, int edicao, int QtCopias, int disponivel){
            super(codigo, Nome, TipoExemplar, disponivel);
            this.autor = autor;
            this.edicao = edicao;
            this.editora = editora;
            this.QtCopias = QtCopias;
        }
        public void disponibilidade(){
            if(this.QtCopias == 0){
                this.setDisponvel(0);
            }else if(this.QtCopias > 0){
                this.setDisponvel(1);
            }
        }
        public int VerificaLivros(String NomeDoUsuario){
            if(NomeDoUsuario.equals(this.Nome)){
               return 1;
            }
            return 0; 
        }
        public int QtCopiasLivro(String NomeDoLivro, Livros Livros){
            if(NomeDoLivro.equals(Livros.getNome())){
               return QtCopias;
            }
            return 0;
        }
        /**
         * @return the autor
         */
        public String getAutor() {
            return autor;
        }

        /**
         * @param autor the autor to set
         */
        public void setAutor(String autor) {
            this.autor = autor;
        }

        /**
         * @return the editora
         */
        public String getEditora() {
            return editora;
        }

        /**
         * @param editora the editora to set
         */
        public void setEditora(String editora) {
            this.editora = editora;
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

        /**
         * @return the QtCopias
         */
        public int getQtCopias() {
            return QtCopias;
        }

        /**
         * @param QtCopias the QtCopias to set
         */
        public void setQtCopias(int QtCopias) {
            this.QtCopias = QtCopias;
        }
}

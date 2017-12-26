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
public class Artigo extends Exemplares{
        private String autorDoArtigo;
        private int QtCopias;
        public Artigo(int QtCopias, int codigo, String nome, int TipoExemplar, String autorDoArtigo, int disponivel){
            super(codigo, nome, TipoExemplar, disponivel);
            this.autorDoArtigo = autorDoArtigo;
            this.QtCopias = QtCopias;
        }
        public void disponibilidade(){
            if(this.QtCopias == 0){
                this.setDisponvel(0);
            }else if(this.QtCopias > 0){
                this.setDisponvel(1);
            }
        }
        public int VerificaArtigos(String NomeDoUsuario){
            if(NomeDoUsuario.equals(this.Nome)){
               return 1;
            }
            return 0; 
        }
        public int QtCopiasArtigo(String NomeDoLivro, Livros Livros){
            if(NomeDoLivro.equals(Livros.getNome())){
               return QtCopias;
            }
            return 0;
        }
        /**
         * @return the autorDoArtigo
         */
        public String getAutorDoArtigo() {
            return autorDoArtigo;
        }

        /**
         * @param autorDoArtigo the autorDoArtigo to set
         */
        public void setAutorDoArtigo(String autorDoArtigo) {
            this.autorDoArtigo = autorDoArtigo;
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
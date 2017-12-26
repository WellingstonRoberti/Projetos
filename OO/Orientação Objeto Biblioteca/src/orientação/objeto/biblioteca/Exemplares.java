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
public class Exemplares {
        protected int codigo;
        protected String Nome;
        protected int disponvel;
        protected int TipoExemplar;
        public Exemplares(int codigo, String nome, int TipoExemplar, int disponivel){
            this.codigo = codigo;
            this.Nome = nome;
            this.TipoExemplar = TipoExemplar;
            this.disponvel = 1;
        }
        /**
         * @return the codigo
         */
        public int getCodigo() {
            return codigo;
        }

        /**
         * @param codigo the codigo to set
         */
        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        /**
         * @return the nome
         */
        public String getNome() {
            return Nome;
        }

        /**
         * @param nome the nome to set
         */
        public void setNome(String nome) {
            this.Nome = nome;
        }

        /**
         * @return the TipoExemplar
         */
        public int getTipoExemplar() {
            return TipoExemplar;
        }

        /**
         * @param TipoExemplar the TipoExemplar to set
         */
        public void setTipoExemplar(int TipoExemplar) {
            this.TipoExemplar = TipoExemplar;
        }

        /**
         * @return the disponvel
         */
        public int getDisponvel() {
            return disponvel;
        }

        /**
         * @param disponvel the disponvel to set
         */
        public void setDisponvel(int disponvel) {
            this.disponvel = disponvel;
        }
}

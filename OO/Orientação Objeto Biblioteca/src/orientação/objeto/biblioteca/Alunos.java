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
public class Alunos extends Clientes{
        private int numeroDeMatricula;
        public Alunos(int Codigo, String Nome,int idade, int telefone, String endereco, int TipoCliente, int numeroDeMatricula){
            super(Codigo, Nome, idade, telefone, endereco, TipoCliente);
            this.numeroDeMatricula = numeroDeMatricula;
        }
        /**
         * @return the Codigo
         */
        @Override
        public int getCodigo() {
            return Codigo;
        }

        /**
         * @param Codigo the Codigo to set
         */
        @Override
        public void setCodigo(int Codigo) {
            this.Codigo = Codigo;
        }

        /**
         * @return the Nome
         */
        @Override
        public String getNome() {
            return Nome;
        }

        /**
         * @param Nome the Nome to set
         */
        @Override
        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        /**
         * @return the idade
         */
        @Override
        public int getIdade() {
            return idade;
        }

        /**
         * @param idade the idade to set
         */
        @Override
        public void setIdade(int idade) {
            this.idade = idade;
        }

        /**
         * @return the telefone
         */
        @Override
        public int getTelefone() {
            return telefone;
        }

        /**
         * @param telefone the telefone to set
         */
        @Override
        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

        /**
         * @return the endereco
         */
        @Override
        public String getEndereco() {
            return endereco;
        }

        /**
         * @param endereco the endereco to set
         */
        @Override
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        /**
         * @return the TipoCliente
         */
        @Override
        public int getTipoCliente() {
            return TipoCliente;
        }

        /**
         * @param TipoCliente the TipoCliente to set
         */
        @Override
        public void setTipoCliente(int TipoCliente) {
            this.TipoCliente = TipoCliente;
        }

        /**
         * @return the numeroDeMatricula
         */
        public int getNumeroDeMatricula() {
            return numeroDeMatricula;
        }

        /**
         * @param numeroDeMatricula the numeroDeMatricula to set
         */
        public void setNumeroDeMatricula(int numeroDeMatricula) {
            this.numeroDeMatricula = numeroDeMatricula;
        }
    }


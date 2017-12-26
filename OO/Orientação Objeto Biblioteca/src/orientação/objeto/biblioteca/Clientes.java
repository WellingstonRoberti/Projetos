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
abstract class Clientes{
        protected int Codigo;
        protected String Nome;
        protected int idade;
        protected int telefone;
        protected String endereco;
        protected int TipoCliente;
        public Clientes(int Codigo, String Nome, int idade, int telefone, String endereco, int TipoCliente){
            this.Codigo = Codigo;
            this.Nome = Nome;
            this.idade = idade;
            this.telefone = telefone;
            this.endereco = endereco;
            this.TipoCliente = TipoCliente;
        }
        /**
         * @return the Codigo
         */
        public int getCodigo() {
            return Codigo;
        }

        /**
         * @param Codigo the Codigo to set
         */
        public void setCodigo(int Codigo) {
            this.Codigo = Codigo;
        }

        /**
         * @return the Nome
         */
        public String getNome() {
            return Nome;
        }

        /**
         * @param Nome the Nome to set
         */
        public void setNome(String Nome) {
            this.Nome = Nome;
        }

        /**
         * @return the idade
         */
        public int getIdade() {
            return idade;
        }

        /**
         * @param idade the idade to set
         */
        public void setIdade(int idade) {
            this.idade = idade;
        }

        /**
         * @return the telefone
         */
        public int getTelefone() {
            return telefone;
        }

        /**
         * @param telefone the telefone to set
         */
        public void setTelefone(int telefone) {
            this.telefone = telefone;
        }

        /**
         * @return the endereco
         */
        public String getEndereco() {
            return endereco;
        }

        /**
         * @param endereco the endereco to set
         */
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }

        /**
         * @return the TipoCliente
         */
        public int getTipoCliente() {
            return TipoCliente;
        }

        /**
         * @param TipoCliente the TipoCliente to set
         */
        public void setTipoCliente(int TipoCliente) {
            this.TipoCliente = TipoCliente;
        }
        
    }
    
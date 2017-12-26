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
 public class Emprestimo{
        private int dataDeDevolucaoDia;
        private int dataDeDevolucaoMes;
        private int dataDeDevolucaoAno;
        private int dataDeEmprestimoDia;
        private int dataDeEmprestimoMes;
        private int dataDeEmprestimoAno;
        private int MatriculaLivro;
        public Emprestimo(int MatriculaLivro,int dataDeDevolucaoDia, int dataDeDevolucaoMes, int dataDeDevolucaoAno, int dataDeEmprestimoDia, int dataDeEmprestimoMes, int dataDeEmprestimoAno){
            this.dataDeDevolucaoDia = dataDeDevolucaoDia;
            this.dataDeDevolucaoMes = dataDeDevolucaoMes;
            this.dataDeDevolucaoAno = dataDeDevolucaoAno;
            this.dataDeEmprestimoDia = dataDeEmprestimoDia;
            this.dataDeEmprestimoMes = dataDeEmprestimoMes;
            this.dataDeEmprestimoAno = dataDeEmprestimoAno;
            this.MatriculaLivro = MatriculaLivro;
        }
        public Emprestimo(){
            
        }
        
         public void realizaemprestimo(int numeroDeMatricula, int dataDeEmprestimoDia, int dataDeEmprestimoMes, int dataDeEmprestimoAno, String nomedolivro, Livros procurado){
            
            if(procurado.VerificaLivros(nomedolivro) == 1){
                if(procurado.getDisponvel() == 0 && procurado.getQtCopias() == 0){
                    System.out.print("Livro indisponivel\n");
                }else
                {
                    System.out.print("Livro disponivel\n");
                    this.dataDeEmprestimoDia = dataDeEmprestimoDia;
                    this.dataDeEmprestimoMes = dataDeEmprestimoMes;
                    this.dataDeEmprestimoAno = dataDeEmprestimoAno;
                    if(this.dataDeEmprestimoDia<= 23)
                    {
                        this.dataDeDevolucaoDia = dataDeEmprestimoDia + 7;
                        this.dataDeDevolucaoMes = dataDeEmprestimoMes;
                        this.dataDeDevolucaoAno = dataDeEmprestimoAno;
                    }else if( this.dataDeEmprestimoDia > 23){
                        this.dataDeDevolucaoMes = dataDeEmprestimoMes + 1;
                        this.dataDeDevolucaoDia = (dataDeEmprestimoDia + 7) - 30;
                        this.dataDeDevolucaoAno = dataDeEmprestimoAno;
                    }
                    procurado.setQtCopias(procurado.getQtCopias() - 1);
                    procurado.disponibilidade();
                    this.MatriculaLivro = numeroDeMatricula;
                    System.out.println("Emprestimo realizado");
                    System.out.print("Devolver ate dia: " +this.dataDeDevolucaoDia + "/" +this.dataDeDevolucaoMes +"/" + this.dataDeDevolucaoAno + "\n");
                }
            }
        }
        public void realizadevolucaoLivro(Livros livro){
            livro.setQtCopias(livro.getQtCopias() + 1);
            livro.disponibilidade();
            System.out.println("Devolução realizada!");
        }
         public void realizaemprestimo(int numeroDeMatricula, int dataDeEmprestimoDia, int dataDeEmprestimoMes, int dataDeEmprestimoAno, String nomedolivro, Artigo procurado){
            
            if(procurado.VerificaArtigos(nomedolivro) == 1){
                if(procurado.getDisponvel() == 0 && procurado.getQtCopias() == 0){
                    System.out.print("Artigo indisponivel");
                }else
                {
                    System.out.print("Artigo disponivel");
                    this.dataDeEmprestimoDia = dataDeEmprestimoDia;
                    this.dataDeEmprestimoMes = dataDeEmprestimoMes;
                    this.dataDeEmprestimoAno = dataDeEmprestimoAno;
                    if(this.dataDeEmprestimoDia<= 23)
                    {
                        this.dataDeDevolucaoDia = dataDeEmprestimoDia + 7;
                        this.dataDeDevolucaoMes = dataDeEmprestimoMes;
                        this.dataDeDevolucaoAno = dataDeEmprestimoAno;
                    }else if( this.dataDeEmprestimoDia > 23){
                        this.dataDeDevolucaoMes = dataDeEmprestimoMes + 1;
                        this.dataDeDevolucaoDia = (dataDeEmprestimoDia + 7) - 30;
                        this.dataDeDevolucaoAno = dataDeEmprestimoAno;
                    }
                    procurado.setQtCopias(procurado.getQtCopias() - 1);
                    procurado.disponibilidade();
                    this.MatriculaLivro = numeroDeMatricula;
                    System.out.println("Emprestimo realizado");
                    System.out.print("Devolver ate dia: " +this.dataDeDevolucaoDia + "/" +this.dataDeDevolucaoMes +"/" + this.dataDeDevolucaoAno + "\n");
                }
            }
        }
        public void realizadevolucaoArtigo(Artigo Artigo){
            Artigo.setQtCopias(Artigo.getQtCopias() + 1);
            Artigo.disponibilidade();
            System.out.println("Devolução realizada!");
        }
        public void realizaemprestimo(int numeroDeMatricula, int dataDeEmprestimoDia, int dataDeEmprestimoMes, int dataDeEmprestimoAno, String nomedolivro, Revista procurado){
            
            if(procurado.VerificaRev(nomedolivro) == 1){
                if(procurado.getDisponvel() == 0 && procurado.getQtCopias() == 0){
                    System.out.print("Revista indisponivel");
                }else
                {
                    System.out.print("Revista disponivel");
                    this.dataDeEmprestimoDia = dataDeEmprestimoDia;
                    this.dataDeEmprestimoMes = dataDeEmprestimoMes;
                    this.dataDeEmprestimoAno = dataDeEmprestimoAno;
                    if(this.dataDeEmprestimoDia<= 23)
                    {
                        this.dataDeDevolucaoDia = dataDeEmprestimoDia + 7;
                        this.dataDeDevolucaoMes = dataDeEmprestimoMes;
                        this.dataDeDevolucaoAno = dataDeEmprestimoAno;
                    }else if( this.dataDeEmprestimoDia > 23){
                        this.dataDeDevolucaoMes = dataDeEmprestimoMes + 1;
                        this.dataDeDevolucaoDia = (dataDeEmprestimoDia + 7) - 30;
                        this.dataDeDevolucaoAno = dataDeEmprestimoAno;
                    }
                    procurado.setQtCopiasRev(procurado.getQtCopias() - 1);
                    procurado.disponibilidade();
                    this.MatriculaLivro = numeroDeMatricula;
                    System.out.println("Emprestimo realizado");
                    System.out.print("Devolver ate dia: " +this.dataDeDevolucaoDia + "/" +this.dataDeDevolucaoMes +"/" + this.dataDeDevolucaoAno + "\n");
                }
            }
        }
        public void realizadevolucaoRev(Revista Revista){
            Revista.setQtCopiasRev(Revista.getQtCopias() + 1);
            Revista.disponibilidade();
            System.out.println("Devolução realizada!");
        }
        /**
         * @return the MatriculaLivro
         */
        public int getMatriculaLivro() {
            return MatriculaLivro;
        }

        /**
         * @param MatriculaLivro the MatriculaLivro to set
         */
        public void setMatriculaLivro(int MatriculaLivro) {
            this.MatriculaLivro = MatriculaLivro;
        }

        /**
         * @return the dataDeDevolucaoAno
         */
        public int getDataDeDevolucaoAno() {
            return dataDeDevolucaoAno;
        }

        /**
         * @param dataDeDevolucaoAno the dataDeDevolucaoAno to set
         */
        public void setDataDeDevolucaoAno(int dataDeDevolucaoAno) {
            this.dataDeDevolucaoAno = dataDeDevolucaoAno;
        }

        /**
         * @return the dataDeEmprestimoDia
         */
        public int getDataDeEmprestimoDia() {
            return dataDeEmprestimoDia;
        }

        /**
         * @param dataDeEmprestimoDia the dataDeEmprestimoDia to set
         */
        public void setDataDeEmprestimoDia(int dataDeEmprestimoDia) {
            this.dataDeEmprestimoDia = dataDeEmprestimoDia;
        }

        /**
         * @return the dataDeEmprestimoMes
         */
        public int getDataDeEmprestimoMes() {
            return dataDeEmprestimoMes;
        }

        /**
         * @param dataDeEmprestimoMes the dataDeEmprestimoMes to set
         */
        public void setDataDeEmprestimoMes(int dataDeEmprestimoMes) {
            this.dataDeEmprestimoMes = dataDeEmprestimoMes;
        }

        /**
         * @return the dataDeEmprestimoAno
         */
        public int getDataDeEmprestimoAno() {
            return dataDeEmprestimoAno;
        }

        /**
         * @param dataDeEmprestimoAno the dataDeEmprestimoAno to set
         */
        public void setDataDeEmprestimoAno(int dataDeEmprestimoAno) {
            this.dataDeEmprestimoAno = dataDeEmprestimoAno;
        }
        
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author junimRoberti
 */
public class Pessoa {
    
    protected String Nome;
    protected String Idade;
    protected String Sexo;
    
    public Pessoa( String Nome, String Idade, String Sexo) {
        this.Nome = Nome;
        this.Idade = Idade;
        this.Sexo = Sexo;
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
     * @return the Idade
     */
    public String getIdade() {
        return Idade;
    }

    /**
     * @param Idade the Idade to set
     */
    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    /**
     * @return the Sexo
     */
    public String getSexo() {
        return Sexo;
    }

    /**
     * @param Sexo the Sexo to set
     */
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    public String toString() {
        return String.format( "%s: %s %s\n%s: %s\n","Nome", Nome,"Idade:", Idade,"Sexo:", Sexo);
    }
 
 
public class empregado extends Pessoa{
    protected double salario;
    protected String matricula;
    public empregado( String Nome, String Idade, String Sexo, double salario, String matricula){
        super(Nome,Idade,Sexo);
        this.salario = salario;
        this.matricula = matricula;
    }
    public double ValorInss(){
        double Inss;
        if (getSalario() >= 880){
            Inss = getSalario()*20/100;
            return Inss;
        }else{
            return 0;
        }
    }

        /**
         * @return the salario
         */
        public double getSalario() {
            return salario;
        }

        /**
         * @param salario the salario to set
         */
        public void setSalario(double salario) {
            this.salario = salario;
        }

        /**
         * @return the matricula
         */
        public String getMatricula() {
            return matricula;
        }

        /**
         * @param matricula the matricula to set
         */
        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

}
public class Cliente extends Pessoa{
    
    protected double valorDivida;
    protected int anoNascim;
    public Cliente(double valorDivida, int anoNascim, String Nome, String Idade, String Sexo){
        super(Nome, Idade, Sexo);
        this.anoNascim = anoNascim;
        this.valorDivida = valorDivida;
    }

        /**
         * @return the valorDivida
         */
        public double getValorDivida() {
            return valorDivida;
        }

        /**
         * @param valorDivida the valorDivida to set
         */
        public void setValorDivida(double valorDivida) {
            this.valorDivida = valorDivida;
        }

        /**
         * @return the anoNascim
         */
        public int getAnoNascim() {
            return anoNascim;
        }

        /**
         * @param anoNascim the anoNascim to set
         */
        public void setAnoNascim(int anoNascim) {
            this.anoNascim = anoNascim;
        }
        public String toString(){ 
            return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
            "Nome", Nome,
            "Idade", Idade,
            "Sexo", Sexo, "Valor da divida", valorDivida,
            "ano de nascimento", anoNascim ); 
        }
        
}
public class Gerente extends empregado{
    protected String nomeGerencia;
    public Gerente( String Nome, String Idade, String Sexo, double salario, String matricula, String nomeGerencia){
        super(Nome,Idade,Sexo,salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

        /**
         * @return the nomeGerencia
         */
        public String getNomeGerencia() {
            return nomeGerencia;
        }

        /**
         * @param nomeGerencia the nomeGerencia to set
         */
        public void setNomeGerencia(String nomeGerencia) {
            this.nomeGerencia = nomeGerencia;
        }
        public String toString(){ 
            return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
            "Nome", Nome,
            "Idade", Idade,
            "salario", salario,"matricula", matricula,
            "Sexo", Sexo, "Nome da gerencia", nomeGerencia); 
        }
    
}
public class vendendor extends empregado{
    private double valorVendas;
    private int qntVendas;
    public vendendor(String Nome, String Idade, String Sexo, double salario, String matricula, String nomeGerencia, double valorVendas, int qntVendas){
        super(Nome,Idade,Sexo,salario, matricula);
        this.qntVendas = qntVendas;
        this.valorVendas = valorVendas;
    }

        /**
         * @return the valorVendas
         */
        public double getValorVendas() {
            return valorVendas;
        }

        /**
         * @param valorVendas the valorVendas to set
         */
        public void setValorVendas(double valorVendas) {
            this.valorVendas = valorVendas;
        }

        /**
         * @return the qntVendas
         */
        public int getQntVendas() {
            return qntVendas;
        }

        /**
         * @param qntVendas the qntVendas to set
         */
        public void setQntVendas(int qntVendas) {
            this.qntVendas = qntVendas;
        }
        public String toString(){ 
            return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
            "Nome", Nome,
            "Valor das vendas", valorVendas,
            "salario", salario,"quantdade de vendas",qntVendas); 
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

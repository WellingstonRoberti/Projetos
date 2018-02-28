/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author junim
 */
public class ReservaLegal {
    private boolean cercamento;
    private double area;
    private String situacao;
    private boolean erosao;
    private boolean animais;
    private double distancia;
    private boolean invasor;
    private String descricao;
    private int idMicrobacia;
    /**
     * @return the cercamento
     */
    public boolean getCercamento() {
        return cercamento;
    }

    /**
     * @param cercamento the cercamento to set
     */
    public void setCercamento(boolean cercamento) {
        this.cercamento = cercamento;
    }

    /**
     * @return the area
     */
    public double getArea() {
        return area;
    }

    /**
     * @param area the area to set
     */
    public void setArea(double area) {
        this.area = area;
    }

    /**
     * @return the situacao
     */
    public String getSituacao() {
        return situacao;
    }

    /**
     * @param situacao the situacao to set
     */
    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    /**
     * @return the erosao
     */
    public boolean getErosao() {
        return erosao;
    }

    /**
     * @param erosao the erosao to set
     */
    public void setErosao(boolean erosao) {
        this.erosao = erosao;
    }

    /**
     * @return the animais
     */
    public boolean getAnimais() {
        return animais;
    }

    /**
     * @param animais the animais to set
     */
    public void setAnimais(boolean animais) {
        this.animais = animais;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * @return the invasor
     */
    public boolean getInvasor() {
        return invasor;
    }

    /**
     * @param invasor the invasor to set
     */
    public void setInvasor(boolean invasor) {
        this.invasor = invasor;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the idMicrobacia
     */
    public int getIdMicrobacia() {
        return idMicrobacia;
    }

    /**
     * @param idMicrobacia the idMicrobacia to set
     */
    public void setIdMicrobacia(int idMicrobacia) {
        this.idMicrobacia = idMicrobacia;
    }
}

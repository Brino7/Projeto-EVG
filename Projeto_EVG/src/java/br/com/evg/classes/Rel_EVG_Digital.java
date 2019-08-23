package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 23/08/2019
 * @Hora: 11:58:56
 */
@Entity
public class Rel_EVG_Digital extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer quant_Fotos_EVG_Libras, quant_Fotos_Guardioes,
            quant_Fotos_Ponto_Oracao, quant_Fotos_EVG_Trilhos, quant_Fotos_EVG_APC,
            quant_Fotos_EVG_Rua, quant_fotos_Ag_Com, quant_Fotos_Nu_Lar, quant_Fotos_Anj_Mad,
            quant_Fotos_EVG_Night, quant_Fotos_Resg, quat_Fotos_Casa_Oracao,
            quant_Fotos_EVG_Cons;
    private Long cod_Rel_EVG_Dig;

    public Integer getQuant_Fotos_EVG_Libras() {
        return quant_Fotos_EVG_Libras;
    }

    public void setQuant_Fotos_EVG_Libras(Integer quant_Fotos_EVG_Libras) {
        this.quant_Fotos_EVG_Libras = quant_Fotos_EVG_Libras;
    }

    public Integer getQuant_Fotos_Guardioes() {
        return quant_Fotos_Guardioes;
    }

    public void setQuant_Fotos_Guardioes(Integer quant_Fotos_Guardioes) {
        this.quant_Fotos_Guardioes = quant_Fotos_Guardioes;
    }

    public Integer getQuant_Fotos_Ponto_Oracao() {
        return quant_Fotos_Ponto_Oracao;
    }

    public void setQuant_Fotos_Ponto_Oracao(Integer quant_Fotos_Ponto_Oracao) {
        this.quant_Fotos_Ponto_Oracao = quant_Fotos_Ponto_Oracao;
    }

    public Integer getQuant_Fotos_EVG_Trilhos() {
        return quant_Fotos_EVG_Trilhos;
    }

    public void setQuant_Fotos_EVG_Trilhos(Integer quant_Fotos_EVG_Trilhos) {
        this.quant_Fotos_EVG_Trilhos = quant_Fotos_EVG_Trilhos;
    }

    public Integer getQuant_Fotos_EVG_APC() {
        return quant_Fotos_EVG_APC;
    }

    public void setQuant_Fotos_EVG_APC(Integer quant_Fotos_EVG_APC) {
        this.quant_Fotos_EVG_APC = quant_Fotos_EVG_APC;
    }

    public Integer getQuant_Fotos_EVG_Rua() {
        return quant_Fotos_EVG_Rua;
    }

    public void setQuant_Fotos_EVG_Rua(Integer quant_Fotos_EVG_Rua) {
        this.quant_Fotos_EVG_Rua = quant_Fotos_EVG_Rua;
    }

    public Integer getQuant_fotos_Ag_Com() {
        return quant_fotos_Ag_Com;
    }

    public void setQuant_fotos_Ag_Com(Integer quant_fotos_Ag_Com) {
        this.quant_fotos_Ag_Com = quant_fotos_Ag_Com;
    }

    public Integer getQuant_Fotos_Nu_Lar() {
        return quant_Fotos_Nu_Lar;
    }

    public void setQuant_Fotos_Nu_Lar(Integer quant_Fotos_Nu_Lar) {
        this.quant_Fotos_Nu_Lar = quant_Fotos_Nu_Lar;
    }

    public Integer getQuant_Fotos_Anj_Mad() {
        return quant_Fotos_Anj_Mad;
    }

    public void setQuant_Fotos_Anj_Mad(Integer quant_Fotos_Anj_Mad) {
        this.quant_Fotos_Anj_Mad = quant_Fotos_Anj_Mad;
    }

    public Integer getQuant_Fotos_EVG_Night() {
        return quant_Fotos_EVG_Night;
    }

    public void setQuant_Fotos_EVG_Night(Integer quant_Fotos_EVG_Night) {
        this.quant_Fotos_EVG_Night = quant_Fotos_EVG_Night;
    }

    public Integer getQuant_Fotos_Resg() {
        return quant_Fotos_Resg;
    }

    public void setQuant_Fotos_Resg(Integer quant_Fotos_Resg) {
        this.quant_Fotos_Resg = quant_Fotos_Resg;
    }

    public Integer getQuat_Fotos_Casa_Oracao() {
        return quat_Fotos_Casa_Oracao;
    }

    public void setQuat_Fotos_Casa_Oracao(Integer quat_Fotos_Casa_Oracao) {
        this.quat_Fotos_Casa_Oracao = quat_Fotos_Casa_Oracao;
    }

    public Integer getQuant_Fotos_EVG_Cons() {
        return quant_Fotos_EVG_Cons;
    }

    public void setQuant_Fotos_EVG_Cons(Integer quant_Fotos_EVG_Cons) {
        this.quant_Fotos_EVG_Cons = quant_Fotos_EVG_Cons;
    }

    public Long getCod_Rel_EVG_Dig() {
        return cod_Rel_EVG_Dig;
    }

    public void setCod_Rel_EVG_Dig(Long cod_Rel_EVG_Dig) {
        this.cod_Rel_EVG_Dig = cod_Rel_EVG_Dig;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_EVG_Dig != null ? cod_Rel_EVG_Dig.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_EVG_Digital)) {
            return false;
        }
        Rel_EVG_Digital other = (Rel_EVG_Digital) object;
        if ((this.cod_Rel_EVG_Dig == null && other.cod_Rel_EVG_Dig != null) || (this.cod_Rel_EVG_Dig != null && !this.cod_Rel_EVG_Dig.equals(other.cod_Rel_EVG_Dig))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_EVG_Digital[ id= " + cod_Rel_EVG_Dig + " ]";
    }
    
}

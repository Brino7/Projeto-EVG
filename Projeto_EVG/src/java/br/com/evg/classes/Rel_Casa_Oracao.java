package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 21/08/2019
 * @Hora: 13:15:13
 */
@Entity
public class Rel_Casa_Oracao extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cod_Casa_Oracao, quant_Casas;

    public Integer getCod_Casa_Oracao() {
        return cod_Casa_Oracao;
    }

    public void setCod_Casa_Oracao(Integer cod_Casa_Oracao) {
        this.cod_Casa_Oracao = cod_Casa_Oracao;
    }

    public Integer getQuant_Casas() {
        return quant_Casas;
    }

    public void setQuant_Casas(Integer quant_Casas) {
        this.quant_Casas = quant_Casas;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Casa_Oracao != null ? cod_Casa_Oracao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_Casa_Oracao)) {
            return false;
        }
        Rel_Casa_Oracao other = (Rel_Casa_Oracao) object;
        if ((this.cod_Casa_Oracao == null && other.cod_Casa_Oracao != null) || (this.cod_Casa_Oracao != null && !this.cod_Casa_Oracao.equals(other.cod_Casa_Oracao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_Casa_Oracao[ id= " + cod_Casa_Oracao + " ]";
    }
}

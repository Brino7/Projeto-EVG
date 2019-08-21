package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 21/08/2019
 * @Hora: 14:24:50
 */
@Entity
public class Rel_EVG_Night extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cod_Rel_EVG_Night, num_Pontos_Prost, atend_Realizados;

    public Integer getCod_Rel_EVG_Night() {
        return cod_Rel_EVG_Night;
    }

    public void setCod_Rel_EVG_Night(Integer cod_Rel_EVG_Night) {
        this.cod_Rel_EVG_Night = cod_Rel_EVG_Night;
    }

    public Integer getNum_Pontos_Prost() {
        return num_Pontos_Prost;
    }

    public void setNum_Pontos_Prost(Integer num_Pontos_Prost) {
        this.num_Pontos_Prost = num_Pontos_Prost;
    }

    public Integer getAtend_Realizados() {
        return atend_Realizados;
    }

    public void setAtend_Realizados(Integer atend_Realizados) {
        this.atend_Realizados = atend_Realizados;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_EVG_Night != null ? cod_Rel_EVG_Night.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_EVG_Night)) {
            return false;
        }
        Rel_EVG_Night other = (Rel_EVG_Night) object;
        if ((this.cod_Rel_EVG_Night == null && other.cod_Rel_EVG_Night != null) || (this.cod_Rel_EVG_Night != null && !this.cod_Rel_EVG_Night.equals(other.cod_Rel_EVG_Night))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_EVG_Night[ id= " + cod_Rel_EVG_Night + " ]";
    }
}

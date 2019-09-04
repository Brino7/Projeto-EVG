package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 04/09/2019
 * @Hora: 09:53:59
 */
@Entity
public class Rel_EVG_APC extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Rel_EVG_APC;
    private Integer lev_Igreja_Oracao;

    public Long getCod_Rel_EVG_APC() {
        return cod_Rel_EVG_APC;
    }

    public void setCod_Rel_EVG_APC(Long cod_Rel_EVG_APC) {
        this.cod_Rel_EVG_APC = cod_Rel_EVG_APC;
    }

    public Integer getLev_Igreja_Oracao() {
        return lev_Igreja_Oracao;
    }

    public void setLev_Igreja_Oracao(Integer lev_Igreja_Oracao) {
        this.lev_Igreja_Oracao = lev_Igreja_Oracao;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_EVG_APC != null ? cod_Rel_EVG_APC.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_EVG_APC)) {
            return false;
        }
        Rel_EVG_APC other = (Rel_EVG_APC) object;
        if ((this.cod_Rel_EVG_APC == null && other.cod_Rel_EVG_APC != null) || (this.cod_Rel_EVG_APC != null && !this.cod_Rel_EVG_APC.equals(other.cod_Rel_EVG_APC))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_EVG_APC[ id= " + cod_Rel_EVG_APC + " ]";
    }
}

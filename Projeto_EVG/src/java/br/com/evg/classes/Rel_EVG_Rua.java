package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 04/09/2019
 * @Hora: 09:34:26
 */
@Entity
public class Rel_EVG_Rua extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Rel_EVG_Rua;

    public Long getCod_Rel_EVG_Rua() {
        return cod_Rel_EVG_Rua;
    }

    public void setCod_Rel_EVG_Rua(Long cod_Rel_EVG_Rua) {
        this.cod_Rel_EVG_Rua = cod_Rel_EVG_Rua;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_EVG_Rua != null ? cod_Rel_EVG_Rua.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_EVG_Rua)) {
            return false;
        }
        Rel_EVG_Rua other = (Rel_EVG_Rua) object;
        if ((this.cod_Rel_EVG_Rua == null && other.cod_Rel_EVG_Rua != null) || (this.cod_Rel_EVG_Rua != null && !this.cod_Rel_EVG_Rua.equals(other.cod_Rel_EVG_Rua))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_EVG_Rua[ id= " + cod_Rel_EVG_Rua + " ]";
    }
}

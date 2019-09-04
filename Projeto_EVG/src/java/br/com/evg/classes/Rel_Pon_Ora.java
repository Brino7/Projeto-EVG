package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 04/09/2019
 * @Hora: 10:24:13
 */
@Entity
public class Rel_Pon_Ora extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Rel_Pon_Ora;

    public Long getCod_Rel_Pon_Ora() {
        return cod_Rel_Pon_Ora;
    }

    public void setCod_Rel_Pon_Ora(Long cod_Rel_Pon_Ora) {
        this.cod_Rel_Pon_Ora = cod_Rel_Pon_Ora;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_Pon_Ora != null ? cod_Rel_Pon_Ora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_Pon_Ora)) {
            return false;
        }
        Rel_Pon_Ora other = (Rel_Pon_Ora) object;
        if ((this.cod_Rel_Pon_Ora == null && other.cod_Rel_Pon_Ora != null) || (this.cod_Rel_Pon_Ora != null && !this.cod_Rel_Pon_Ora.equals(other.cod_Rel_Pon_Ora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_Pon_Ora[ id= " + cod_Rel_Pon_Ora + " ]";
    }
}

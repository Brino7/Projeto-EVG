package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 04/09/2019
 * @Hora: 10:47:39
 */
@Entity
public class Rel_EVG_Lib extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Rel_EVG_Lib;

    public Long getCod_Rel_EVG_Lib() {
        return cod_Rel_EVG_Lib;
    }

    public void setCod_Rel_EVG_Lib(Long cod_Rel_EVG_Lib) {
        this.cod_Rel_EVG_Lib = cod_Rel_EVG_Lib;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_EVG_Lib != null ? cod_Rel_EVG_Lib.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_EVG_Lib)) {
            return false;
        }
        Rel_EVG_Lib other = (Rel_EVG_Lib) object;
        if ((this.cod_Rel_EVG_Lib == null && other.cod_Rel_EVG_Lib != null) || (this.cod_Rel_EVG_Lib != null && !this.cod_Rel_EVG_Lib.equals(other.cod_Rel_EVG_Lib))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_EVG_Lib[ id= " + cod_Rel_EVG_Lib + " ]";
    }
}

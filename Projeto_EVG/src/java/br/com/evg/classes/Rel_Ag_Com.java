package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 23/08/2019
 * @Hora: 11:31:37
 */
@Entity
public class Rel_Ag_Com  extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Rel_Ag_Com;

    public Long getCod_Rel_Ag_Com() {
        return cod_Rel_Ag_Com;
    }

    public void setCod_Rel_Ag_Com(Long cod_Rel_Ag_Com) {
        this.cod_Rel_Ag_Com = cod_Rel_Ag_Com;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_Ag_Com != null ? cod_Rel_Ag_Com.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_Ag_Com)) {
            return false;
        }
        Rel_Ag_Com other = (Rel_Ag_Com) object;
        if ((this.cod_Rel_Ag_Com == null && other.cod_Rel_Ag_Com != null) || (this.cod_Rel_Ag_Com != null && !this.cod_Rel_Ag_Com.equals(other.cod_Rel_Ag_Com))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_Ag_Com[ id= " + cod_Rel_Ag_Com + " ]";
    }
}

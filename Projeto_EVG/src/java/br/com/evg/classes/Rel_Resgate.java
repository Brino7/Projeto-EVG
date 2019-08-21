package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 21/08/2019
 * @Hora: 13:49:48
 */
@Entity
public class Rel_Resgate extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cod_Rel_Resg, pess_Resgatadas, casas_Visitadas;

    public Integer getCod_Rel_Resg() {
        return cod_Rel_Resg;
    }

    public void setCod_Rel_Resg(Integer cod_Rel_Resg) {
        this.cod_Rel_Resg = cod_Rel_Resg;
    }

    public Integer getPess_Resgatadas() {
        return pess_Resgatadas;
    }

    public void setPess_Resgatadas(Integer pess_Resgatadas) {
        this.pess_Resgatadas = pess_Resgatadas;
    }

    public Integer getCasas_Visitadas() {
        return casas_Visitadas;
    }

    public void setCasas_Visitadas(Integer casas_Visitadas) {
        this.casas_Visitadas = casas_Visitadas;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_Resg != null ? cod_Rel_Resg.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_Resgate)) {
            return false;
        }
        Rel_Resgate other = (Rel_Resgate) object;
        if ((this.cod_Rel_Resg == null && other.cod_Rel_Resg != null) || (this.cod_Rel_Resg != null && !this.cod_Rel_Resg.equals(other.cod_Rel_Resg))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_Resgate[ id= " + cod_Rel_Resg + " ]";
    }
}

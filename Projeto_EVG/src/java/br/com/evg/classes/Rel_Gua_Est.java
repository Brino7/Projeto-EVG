package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 04/09/2019
 * @Hora: 10:36:49
 */
@Entity
public class Rel_Gua_Est extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Rel_Gua_Est;

    public Long getCod_rel_Gua_Est() {
        return cod_Rel_Gua_Est;
    }

    public void setCod_rel_Gua_Est(Long cod_rel_Gua_Est) {
        this.cod_Rel_Gua_Est = cod_rel_Gua_Est;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_Gua_Est != null ? cod_Rel_Gua_Est.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_Gua_Est)) {
            return false;
        }
        Rel_Gua_Est other = (Rel_Gua_Est) object;
        if ((this.cod_Rel_Gua_Est == null && other.cod_Rel_Gua_Est != null) || (this.cod_Rel_Gua_Est != null && !this.cod_Rel_Gua_Est.equals(other.cod_Rel_Gua_Est))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_Gua_Est[ id= " + cod_Rel_Gua_Est + " ]";
    }
}

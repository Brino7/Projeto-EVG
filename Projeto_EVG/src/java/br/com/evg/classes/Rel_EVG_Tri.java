package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 04/09/2019
 * @Hora: 10:07:22
 */
@Entity
public class Rel_EVG_Tri extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Rel_EVG_Tri;

    public Long getCod_Rel_EVG_Tri() {
        return cod_Rel_EVG_Tri;
    }

    public void setCod_Rel_EVG_Tri(Long cod_Rel_EVG_Tri) {
        this.cod_Rel_EVG_Tri = cod_Rel_EVG_Tri;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_EVG_Tri != null ? cod_Rel_EVG_Tri.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_EVG_Tri)) {
            return false;
        }
        Rel_EVG_Tri other = (Rel_EVG_Tri) object;
        if ((this.cod_Rel_EVG_Tri == null && other.cod_Rel_EVG_Tri != null) || (this.cod_Rel_EVG_Tri != null && !this.cod_Rel_EVG_Tri.equals(other.cod_Rel_EVG_Tri))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_EVG_Tri[ id= " + cod_Rel_EVG_Tri + " ]";
    }
}

package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 21/08/2019
 * @Hora: 10:46:15
 */
@Entity
public class EVG_Consolador extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cod_Rel_EVG_Cons, cemi_Visitados;

    public Integer getCod_Rel_EVG_Cons() {
        return cod_Rel_EVG_Cons;
    }

    public void setCod_Rel_EVG_Cons(Integer cod_Rel_EVG_Cons) {
        this.cod_Rel_EVG_Cons = cod_Rel_EVG_Cons;
    }

    public Integer getCemi_Visitados() {
        return cemi_Visitados;
    }

    public void setCemi_Visitados(Integer cemi_Visitados) {
        this.cemi_Visitados = cemi_Visitados;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_EVG_Cons != null ? cod_Rel_EVG_Cons.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relatorio_Geral)) {
            return false;
        }
        EVG_Consolador other = (EVG_Consolador) object;
        if ((this.cod_Rel_EVG_Cons == null && other.cod_Rel_EVG_Cons != null) || (this.cod_Rel_EVG_Cons != null && !this.cod_Rel_EVG_Cons.equals(other.cod_Rel_EVG_Cons))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.EVG_Consolador[ id= " + cod_Rel_EVG_Cons+ " ]";
    }
}

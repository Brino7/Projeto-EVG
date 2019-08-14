package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 18:44:39
 */
@Entity
public class Projeto implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cod_Projeto;
    private String nome;

    public Integer getCod_Projeto() {
        return cod_Projeto;
    }

    public void setCod_Projeto(Integer cod_Projeto) {
        this.cod_Projeto = cod_Projeto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Projeto != null ? cod_Projeto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projeto)) {
            return false;
        }
        Projeto other = (Projeto) object;
        if ((this.cod_Projeto == null && other.cod_Projeto != null) || (this.cod_Projeto != null && !this.cod_Projeto.equals(other.cod_Projeto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.provas.classes.Projeto[ id= " + cod_Projeto + " ]";
    }
}

package br.com.evg.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 19:32:16
 */
@Entity
public class Sessao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cod_Sessao;
    private Usuario cod_Usuario;
    private Permissao cod_Permissao;
    private Date data;

    public Integer getCod_Sessao() {
        return cod_Sessao;
    }

    public void setCod_Sessao(Integer cod_Sessao) {
        this.cod_Sessao = cod_Sessao;
    }

    public Usuario getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(Usuario cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public Permissao getCod_Permissao() {
        return cod_Permissao;
    }

    public void setCod_Permissao(Permissao cod_Permissao) {
        this.cod_Permissao = cod_Permissao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Sessao != null ? cod_Sessao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sessao)) {
            return false;
        }
        Sessao other = (Sessao) object;
        if ((this.cod_Sessao == null && other.cod_Sessao != null) || (this.cod_Sessao != null && !this.cod_Sessao.equals(other.cod_Sessao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.provas.classes.Sessao[ id= " + cod_Sessao + " ]";
    }
}

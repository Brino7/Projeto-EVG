package br.com.evg.classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 18:43:54
 */
@Entity
public class Usuario extends Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Usuario;
    private String loguin, senha;
    private List tipo_Usuario;

    public Long getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(Long cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public String getLoguin() {
        return loguin;
    }

    public void setLoguin(String loguin) {
        this.loguin = loguin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(List tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }
    
   @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Usuario != null ? cod_Usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.cod_Usuario == null && other.cod_Usuario != null) || (this.cod_Usuario != null && !this.cod_Usuario.equals(other.cod_Usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Usuario[ id=" + cod_Usuario + " ]";
    } 
}

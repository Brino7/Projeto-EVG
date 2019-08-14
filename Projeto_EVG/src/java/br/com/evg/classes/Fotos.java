package br.com.evg.classes;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 17:23:32
 */
@Entity
public class Fotos implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cod_Foto;
    private Object foto;
    private Membro cod_Membro;
    private Evangelista cod_Evg;
    private Usuario cod_Usuario;
    private Projeto cod_Projeto;
    private Calendar data;

    public Integer getCod_Foto() {
        return cod_Foto;
    }

    public void setCod_Foto(Integer cod_Foto) {
        this.cod_Foto = cod_Foto;
    }

    public Object getFoto() {
        return foto;
    }

    public void setFoto(Object foto) {
        this.foto = foto;
    }

    public Membro getCod_Membro() {
        return cod_Membro;
    }

    public void setCod_Membro(Membro cod_Membro) {
        this.cod_Membro = cod_Membro;
    }

    public Evangelista getCod_Evg() {
        return cod_Evg;
    }

    public void setCod_Evg(Evangelista cod_Evg) {
        this.cod_Evg = cod_Evg;
    }

    public Usuario getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(Usuario cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public Projeto getCod_Projeto() {
        return cod_Projeto;
    }

    public void setCod_Projeto(Projeto cod_Projeto) {
        this.cod_Projeto = cod_Projeto;
    }    

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }
    
   @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Foto != null ? cod_Foto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fotos)) {
            return false;
        }
        Fotos other = (Fotos) object;
        if ((this.cod_Foto == null && other.cod_Foto != null) || (this.cod_Foto != null && !this.cod_Foto.equals(other.cod_Foto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.provas.classes.Fotos[ id= " + cod_Foto + " ]";
    }
}

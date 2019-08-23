package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 22/08/2019
 * @Hora: 18:11:16
 */
@Entity
public class Rel_Nuc_Lar extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer nucleo_Realizados, volt_Igreja, bat_Nucleo;
    private Long cod_Rel_Nu_Lar;

    public Long getCod_Rel_Nu_Lar() {
        return cod_Rel_Nu_Lar;
    }

    public void setCod_Rel_Nu_Lar(Long cod_Rel_Nu_Lar) {
        this.cod_Rel_Nu_Lar = cod_Rel_Nu_Lar;
    }

    public Integer getNucleo_Realizados() {
        return nucleo_Realizados;
    }

    public void setNucleo_Realizados(Integer nucleo_Realizados) {
        this.nucleo_Realizados = nucleo_Realizados;
    }

    public Integer getVolt_Igreja() {
        return volt_Igreja;
    }

    public void setVolt_Igreja(Integer volt_Igreja) {
        this.volt_Igreja = volt_Igreja;
    }

    public Integer getBat_Nucleo() {
        return bat_Nucleo;
    }

    public void setBat_Nucleo(Integer bat_Nucleo) {
        this.bat_Nucleo = bat_Nucleo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_Nu_Lar != null ? cod_Rel_Nu_Lar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_Nuc_Lar)) {
            return false;
        }
        Rel_Nuc_Lar other = (Rel_Nuc_Lar) object;
        if ((this.cod_Rel_Nu_Lar == null && other.cod_Rel_Nu_Lar != null) || (this.cod_Rel_Nu_Lar != null && !this.cod_Rel_Nu_Lar.equals(other.cod_Rel_Nu_Lar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_Nuc_Lar[ id= " + cod_Rel_Nu_Lar + " ]";
    }
}

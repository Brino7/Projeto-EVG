package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/**
 * @Author: Anderson Silva Brino 
 * @Data: 08/08/2019
 * @Hora: 12:17:49
 */
@Entity
public class Relatorio_Geral extends Relatorio implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int obreiros, evangelistas, nov_evg,
            total, evg_cpo, evg_pre_cpo, bat_esp_santo, hom_pre_iburd_ou_iburd,
            mulheres_cand_altar;
    private Long cod_Relatorio_Geral;

    public Long getCod_Relatorio_Geral() {
        return cod_Relatorio_Geral;
    }

    public void setCod_Relatorio_Geral(Long cod_Relatorio_Geral) {
        this.cod_Relatorio_Geral = cod_Relatorio_Geral;
    }

    public int getObreiros() {
        return obreiros;
    }

    public void setObreiros(int obreiros) {
        this.obreiros = obreiros;
    }

    public int getEvangelistas() {
        return evangelistas;
    }

    public void setEvangelistas(int evangelistas) {
        this.evangelistas = evangelistas;
    }

    public int getNov_evg() {
        return nov_evg;
    }

    public void setNov_evg(int nov_evg) {
        this.nov_evg = nov_evg;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getEvg_cpo() {
        return evg_cpo;
    }

    public void setEvg_cpo(int evg_cpo) {
        this.evg_cpo = evg_cpo;
    }

    public int getEvg_pre_cpo() {
        return evg_pre_cpo;
    }

    public void setEvg_pre_cpo(int evg_pre_cpo) {
        this.evg_pre_cpo = evg_pre_cpo;
    }

    public int getBat_esp_santo() {
        return bat_esp_santo;
    }

    public void setBat_esp_santo(int bat_esp_santo) {
        this.bat_esp_santo = bat_esp_santo;
    }

    public int getHom_pre_iburd_ou_iburd() {
        return hom_pre_iburd_ou_iburd;
    }

    public void setHom_pre_iburd_ou_iburd(int hom_pre_iburd_ou_iburd) {
        this.hom_pre_iburd_ou_iburd = hom_pre_iburd_ou_iburd;
    }

    public int getMulheres_cand_altar() {
        return mulheres_cand_altar;
    }

    public void setMulheres_cand_altar(int mulheres_cand_altar) {
        this.mulheres_cand_altar = mulheres_cand_altar;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Relatorio_Geral != null ? cod_Relatorio_Geral.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Relatorio_Geral)) {
            return false;
        }
        Relatorio_Geral other = (Relatorio_Geral) object;
        if ((this.cod_Relatorio_Geral == null && other.cod_Relatorio_Geral != null) || (this.cod_Relatorio_Geral != null && !this.cod_Relatorio_Geral.equals(other.cod_Relatorio_Geral))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Relatorio_Geral[ id= " + cod_Relatorio_Geral + " ]";
    }
}

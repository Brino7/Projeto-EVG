package br.com.evg.classes;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 22/08/2019
 * @Hora: 17:24:06
 */
@Entity
public class Rel_Anj_Mad extends Relatorio implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer ref_Servidas, quant_Cafe_Serv, quant_Suco_Serv,
            quant_roupas_Doadas, quant_Cob_Doado, quant_Agas_Distribuidos;
    private Long cod_Rel_Anj_Mad;

    public Long getCod_Rel_Anj_Mad() {
        return cod_Rel_Anj_Mad;
    }

    public void setCod_Rel_Anj_Mad(Long cod_Rel_Anj_Mad) {
        this.cod_Rel_Anj_Mad = cod_Rel_Anj_Mad;
    }

    public Integer getRef_Servidas() {
        return ref_Servidas;
    }

    public void setRef_Servidas(Integer ref_Servidas) {
        this.ref_Servidas = ref_Servidas;
    }

    public Integer getQuant_Cafe_Serv() {
        return quant_Cafe_Serv;
    }

    public void setQuant_Cafe_Serv(Integer quant_Cafe_Serv) {
        this.quant_Cafe_Serv = quant_Cafe_Serv;
    }

    public Integer getQuant_Suco_Serv() {
        return quant_Suco_Serv;
    }

    public void setQuant_Suco_Serv(Integer quant_Suco_Serv) {
        this.quant_Suco_Serv = quant_Suco_Serv;
    }

    public Integer getQuant_roupas_Doadas() {
        return quant_roupas_Doadas;
    }

    public void setQuant_roupas_Doadas(Integer quant_roupas_Doadas) {
        this.quant_roupas_Doadas = quant_roupas_Doadas;
    }

    public Integer getQuant_Cob_Doado() {
        return quant_Cob_Doado;
    }

    public void setQuant_Cob_Doado(Integer quant_Cob_Doado) {
        this.quant_Cob_Doado = quant_Cob_Doado;
    }

    public Integer getQuant_Agas_Distribuidos() {
        return quant_Agas_Distribuidos;
    }

    public void setQuant_Agas_Distribuidos(Integer quant_Agas_Distribuidos) {
        this.quant_Agas_Distribuidos = quant_Agas_Distribuidos;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Rel_Anj_Mad != null ? cod_Rel_Anj_Mad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rel_Anj_Mad)) {
            return false;
        }
        Rel_Anj_Mad other = (Rel_Anj_Mad) object;
        if ((this.cod_Rel_Anj_Mad == null && other.cod_Rel_Anj_Mad != null) || (this.cod_Rel_Anj_Mad != null && !this.cod_Rel_Anj_Mad.equals(other.cod_Rel_Anj_Mad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.evg.classes.Rel_Anj_Mad[ id= " + cod_Rel_Anj_Mad + " ]";
    }
}

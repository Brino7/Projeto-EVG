package br.com.evg.classes;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 18:42:57
 */
public class Evangelista extends Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_EVG;
    private String bloco, regiao, empresa, whatshapp, residencial, numero_casa,
            complemento, testemunho, nome_lider, nome_pastor;
    private Calendar data_entrou_evg, data_casamento, data_levantado;
    private Boolean evg_obreiro, estuda_atualmente, esta_trabalhando;
    private List titulo;

    public Long getCod_EVG() {
        return cod_EVG;
    }

    public void setCod_EVG(Long cod_EVG) {
        this.cod_EVG = cod_EVG;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getWhatshapp() {
        return whatshapp;
    }

    public void setWhatshapp(String whatshapp) {
        this.whatshapp = whatshapp;
    }

    public String getResidencial() {
        return residencial;
    }

    public void setResidencial(String residencial) {
        this.residencial = residencial;
    }

    public String getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(String numero_casa) {
        this.numero_casa = numero_casa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getTestemunho() {
        return testemunho;
    }

    public void setTestemunho(String testemunho) {
        this.testemunho = testemunho;
    }

    public String getNome_lider() {
        return nome_lider;
    }

    public void setNome_lider(String nome_lider) {
        this.nome_lider = nome_lider;
    }

    public String getNome_pastor() {
        return nome_pastor;
    }

    public void setNome_pastor(String nome_pastor) {
        this.nome_pastor = nome_pastor;
    }

    public Calendar getData_entrou_evg() {
        return data_entrou_evg;
    }

    public void setData_entrou_evg(Calendar data_entrou_evg) {
        this.data_entrou_evg = data_entrou_evg;
    }

    public Calendar getData_casamento() {
        return data_casamento;
    }

    public void setData_casamento(Calendar data_casamento) {
        this.data_casamento = data_casamento;
    }

    public Calendar getData_levantado() {
        return data_levantado;
    }

    public void setData_levantado(Calendar data_levantado) {
        this.data_levantado = data_levantado;
    }

    public Boolean getEvg_obreiro() {
        return evg_obreiro;
    }

    public void setEvg_obreiro(Boolean evg_obreiro) {
        this.evg_obreiro = evg_obreiro;
    }

    public Boolean getEstuda_atualmente() {
        return estuda_atualmente;
    }

    public void setEstuda_atualmente(Boolean estuda_atualmente) {
        this.estuda_atualmente = estuda_atualmente;
    }

    public Boolean getEsta_trabalhando() {
        return esta_trabalhando;
    }

    public void setEsta_trabalhando(Boolean esta_trabalhando) {
        this.esta_trabalhando = esta_trabalhando;
    }

    public List getTitulo() {
        return titulo;
    }

    public void setTitulo(List titulo) {
        this.titulo = titulo;
    }
    
     @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_EVG != null ? cod_EVG.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Evangelista)) {
            return false;
        }
        Evangelista other = (Evangelista) object;
        if ((this.cod_EVG == null && other.cod_EVG != null) || (this.cod_EVG != null && !this.cod_EVG.equals(other.cod_EVG))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.provas.classes.Evagelista[ id=" + cod_EVG + " ]";
    }
}

package br.com.evg.classes;

import java.io.Serializable;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 18:42:10
 */
public class Membro extends Pessoa implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cod_Membro; 
    private Integer zona, secao;
    private String cep, rg, cpf, titulo_eleitor, titulo_eleitor_cidade_uf, 
            nome_conjuge, assinatura, sede_igreja;
    private List recebido_por, funcao;

    public Long getCod_Membro() {
        return cod_Membro;
    }

    public void setCod_Membro(Long cod_Membro) {
        this.cod_Membro = cod_Membro;
    }

    public Integer getZona() {
        return zona;
    }

    public void setZona(Integer zona) {
        this.zona = zona;
    }

    public Integer getSecao() {
        return secao;
    }

    public void setSecao(Integer secao) {
        this.secao = secao;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTitulo_eleitor() {
        return titulo_eleitor;
    }

    public void setTitulo_eleitor(String titulo_eleitor) {
        this.titulo_eleitor = titulo_eleitor;
    }

    public String getTitulo_eleitor_cidade_uf() {
        return titulo_eleitor_cidade_uf;
    }

    public void setTitulo_eleitor_cidade_uf(String titulo_eleitor_cidade_uf) {
        this.titulo_eleitor_cidade_uf = titulo_eleitor_cidade_uf;
    }

    public String getNome_conjuge() {
        return nome_conjuge;
    }

    public void setNome_conjuge(String nome_conjuge) {
        this.nome_conjuge = nome_conjuge;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public String getSede_igreja() {
        return sede_igreja;
    }

    public void setSede_igreja(String sede_igreja) {
        this.sede_igreja = sede_igreja;
    }

    public List getRecebido_por() {
        return recebido_por;
    }

    public void setRecebido_por(List recebido_por) {
        this.recebido_por = recebido_por;
    }

    public List getFuncao() {
        return funcao;
    }

    public void setFuncao(List funcao) {
        this.funcao = funcao;
    }
    
   @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Membro != null ? cod_Membro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membro)) {
            return false;
        }
        Membro other = (Membro) object;
        if ((this.cod_Membro == null && other.cod_Membro != null) || (this.cod_Membro != null && !this.cod_Membro.equals(other.cod_Membro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.provas.classes.Membro[ id=" + cod_Membro + " ]";
    }  
}

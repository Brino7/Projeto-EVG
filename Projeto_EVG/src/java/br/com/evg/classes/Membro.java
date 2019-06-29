package br.com.evg.classes;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 18:42:10
 */
public class Membro extends Pessoa implements Serializable{
    private Integer cod_Membro, zona, secao;
    private String cep, rg, cpf, titulo_eleitor, titulo_eleitor_cidade_uf, 
            nome_conjuge, assinatura, sede_igreja;
    private List recebido_por, funcao;

    public Integer getCod_Membro() {
        return cod_Membro;
    }

    public void setCod_Membro(Integer cod_Membro) {
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
    protected void cadastrar(){
        
    }
    
    @Override
    protected void remover(){
        
    }
    
    @Override
    protected void buscar(){
        
    }
    
    @Override
    protected void editar(){
        
    }
    
    @Override
    protected void imprimir(){
        
    }
}

 package br.com.evg.classes;

import java.util.Calendar;
import java.util.List;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 18:45:12
 */
public abstract class Relatorio {
    protected Projeto cod_Projeto;
    protected Usuario cod_Usuario;
    protected List tipo;
    protected Calendar data;
    protected String descricao, observacao, ass_Cord_Evg, ass_Pastor;
    protected Integer quant_Obreiro, quant_Evangelista, quant_Pessoas_Alca;

    public Projeto getCod_Projeto() {
        return cod_Projeto;
    }

    public void setCod_Projeto(Projeto cod_Projeto) {
        this.cod_Projeto = cod_Projeto;
    }

    public Usuario getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(Usuario cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public List getTipo() {
        return tipo;
    }

    public void setTipo(List tipo) {
        this.tipo = tipo;
    }

    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getAss_Cord_Evg() {
        return ass_Cord_Evg;
    }

    public void setAss_Cord_Evg(String ass_Cord_Evg) {
        this.ass_Cord_Evg = ass_Cord_Evg;
    }

    public String getAss_Pastor() {
        return ass_Pastor;
    }

    public void setAss_Pastor(String ass_Pastor) {
        this.ass_Pastor = ass_Pastor;
    }

    public Integer getQuant_Obreiro() {
        return quant_Obreiro;
    }

    public void setQuant_Obreiro(Integer quant_Obreiro) {
        this.quant_Obreiro = quant_Obreiro;
    }

    public Integer getQuant_Evangelista() {
        return quant_Evangelista;
    }

    public void setQuant_Evangelista(Integer quant_Evangelista) {
        this.quant_Evangelista = quant_Evangelista;
    }

    public Integer getQuant_Pessoas_Alca() {
        return quant_Pessoas_Alca;
    }

    public void setQuant_Pessoas_Alca(Integer quant_Pessoas_Alca) {
        this.quant_Pessoas_Alca = quant_Pessoas_Alca;
    }
    
    protected void cadastrar_Relatorio(){
        
    }
    
    protected void buscar_Relatorio(){
        
    }
    
    protected void editar_Relatorio(){
        
    }
    
    protected void remover_Relatorio(){
        
    }
    
    protected void imprimir_Relatorio(){
        
    }
}

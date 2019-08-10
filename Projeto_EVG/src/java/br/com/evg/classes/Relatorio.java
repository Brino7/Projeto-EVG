 package br.com.evg.classes;

import java.util.Calendar;
import java.util.List;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 18:45:12
 */
public abstract class Relatorio {
    
    protected Usuario cod_Usuario;
    protected List tipo;
    protected Calendar data;
    protected String descricao, observacao, ass_Cord_Evg, ass_Pastor, bairro, ruas;
    protected Integer quant_Obreiro, quant_Evangelista, quant_Pessoas_Alca, 
            vieram_Igreja, livros_Biblias_Doados, cest_Basic_Doadas, kits_Higiene,
            event_Realizados;

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

    public Integer getVieram_Igreja() {
        return vieram_Igreja;
    }

    public void setVieram_Igreja(Integer vieram_Igreja) {
        this.vieram_Igreja = vieram_Igreja;
    }

    public Integer getLivros_Biblias_Doados() {
        return livros_Biblias_Doados;
    }

    public void setLivros_Biblias_Doados(Integer livros_Biblias_Doados) {
        this.livros_Biblias_Doados = livros_Biblias_Doados;
    }

    public Integer getCest_Basic_Doadas() {
        return cest_Basic_Doadas;
    }

    public void setCest_Basic_Doadas(Integer cest_Basic_Doadas) {
        this.cest_Basic_Doadas = cest_Basic_Doadas;
    }

    public Integer getKits_Higiene() {
        return kits_Higiene;
    }

    public void setKits_Higiene(Integer kits_Higiene) {
        this.kits_Higiene = kits_Higiene;
    }

    public Integer getEvent_Realizados() {
        return event_Realizados;
    }

    public void setEvent_Realizados(Integer event_Realizados) {
        this.event_Realizados = event_Realizados;
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

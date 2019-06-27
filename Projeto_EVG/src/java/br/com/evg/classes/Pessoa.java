package br.com.evg.classes;

import java.util.Calendar;
import java.util.List;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 16:38:06
 */
public abstract class Pessoa {
    protected String nome,endereco,bairro,cidade,estado,uf,celular,email,profissao,igreja,status;
    protected Calendar data_nasc,data_bat,data_bat_esp_sant;
    protected boolean bat_Esp;
    protected List estado_civil;
    protected Fotos foto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getIgreja() {
        return igreja;
    }

    public void setIgreja(String igreja) {
        this.igreja = igreja;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Calendar getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Calendar data_nasc) {
        this.data_nasc = data_nasc;
    }

    public Calendar getData_bat() {
        return data_bat;
    }

    public void setData_bat(Calendar data_bat) {
        this.data_bat = data_bat;
    }

    public Calendar getData_bat_esp_sant() {
        return data_bat_esp_sant;
    }

    public void setData_bat_esp_sant(Calendar data_bat_esp_sant) {
        this.data_bat_esp_sant = data_bat_esp_sant;
    }

    public boolean isBat_Esp() {
        return bat_Esp;
    }

    public void setBat_Esp(boolean bat_Esp) {
        this.bat_Esp = bat_Esp;
    }

    public List getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(List estado_civil) {
        this.estado_civil = estado_civil;
    }

    public Fotos getFoto() {
        return foto;
    }

    public void setFoto(Fotos foto) {
        this.foto = foto;
    }
    
    protected void cadastrar(){
        
    }
    
    protected void remover(){
        
    }
    
    protected void buscar(){
        
    }
    
    protected void editar(){
        
    }
    
    protected void imprimir(){
        
    }
}

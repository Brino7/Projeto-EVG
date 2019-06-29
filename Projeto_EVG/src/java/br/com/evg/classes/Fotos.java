package br.com.evg.classes;

import java.util.Calendar;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 17:23:32
 */
public class Fotos {
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
    
    public void cadastrar_Foto(){
        
    }
    
    public void remover_Foto(){
        
    }
    
    public void buscar_Foto(){
        
    }
}

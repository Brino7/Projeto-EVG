package br.com.evg.classes;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 18:43:54
 */
public class Usuario extends Pessoa implements Serializable{
    private Integer cod_Usuario;
    private String loguin, senha;
    private List tipo_Usuario;

    public Integer getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(Integer cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public String getLoguin() {
        return loguin;
    }

    public void setLoguin(String loguin) {
        this.loguin = loguin;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List getTipo_Usuario() {
        return tipo_Usuario;
    }

    public void setTipo_Usuario(List tipo_Usuario) {
        this.tipo_Usuario = tipo_Usuario;
    }
    
    
}

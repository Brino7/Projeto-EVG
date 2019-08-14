package br.com.evg.classes;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @Author: Anderson Silva Brino 
 * @Data: 14/06/2019
 * @Hora: 19:22:45
 */
@Entity
public class Permissao {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer cod_Perimissao;
    private Usuario cod_Usuario;
    private List permissao;
    private String cadastrar_Usuario, cadastrar_Membro, cadastrar_Evangelista, 
            cadastrar_Foto, cadastrar_Projeto, cadastrar_Permissao, cadastrar_Relatorio,
            efetuar_Loguin, efetuar_Logoff, recuperar_Senha, remover_Usuario, 
            remover_Membro, remover_Evangelista, remover_Projeto, remover_Foto, 
            remover_Permissao, remover_Relatorio, editar_Usuario, editar_Evangelista, 
            editar_Membro, editar_Projeto, editar_Relatorio, buscar_Usuario, 
            buscar_Membro, buscar_Evangelista, buscar_Projeto, buscar_Foto, 
            buscar_Permissao, buscar_Relatorio, pag_Usuario, pag_Membro, pag_Evangelista, 
            pag_Rel_EVG_Dig, pag_Rel_Pon_Ora, pag_Rel_EVG_Lib, pag_Rel_EVG_Tri, 
            pag_Rel_Gua_Est, pag_Rel_EVG_APC, pag_Rel_EVG_Rua, pag_Rel_EVG_Night,
            pag_Rel_Ag_Com, pag_Rel_Anj_Mad, pag_Rel_Nu_Lar, pag_Rel_EVG_Cons, 
            pag_Permissao, pag_Projeto, pag_Foto;

    public Integer getCod_Perimissao() {
        return cod_Perimissao;
    }

    public void setCod_Perimissao(Integer cod_Perimissao) {
        this.cod_Perimissao = cod_Perimissao;
    }

    public Usuario getCod_Usuario() {
        return cod_Usuario;
    }

    public void setCod_Usuario(Usuario cod_Usuario) {
        this.cod_Usuario = cod_Usuario;
    }

    public List getPermissao() {
        return permissao;
    }

    public void setPermissao(List permissao) {
        this.permissao = permissao;
    }

    public String getCadastrar_Usuario() {
        return cadastrar_Usuario;
    }

    public void setCadastrar_Usuario(String cadastrar_Usuario) {
        this.cadastrar_Usuario = cadastrar_Usuario;
    }

    public String getCadastrar_Membro() {
        return cadastrar_Membro;
    }

    public void setCadastrar_Membro(String cadastrar_Membro) {
        this.cadastrar_Membro = cadastrar_Membro;
    }

    public String getCadastrar_Evangelista() {
        return cadastrar_Evangelista;
    }

    public void setCadastrar_Evangelista(String cadastrar_Evangelista) {
        this.cadastrar_Evangelista = cadastrar_Evangelista;
    }

    public String getCadastrar_Foto() {
        return cadastrar_Foto;
    }

    public void setCadastrar_Foto(String cadastrar_Foto) {
        this.cadastrar_Foto = cadastrar_Foto;
    }

    public String getCadastrar_Projeto() {
        return cadastrar_Projeto;
    }

    public void setCadastrar_Projeto(String cadastrar_Projeto) {
        this.cadastrar_Projeto = cadastrar_Projeto;
    }

    public String getCadastrar_Permissao() {
        return cadastrar_Permissao;
    }

    public void setCadastrar_Permissao(String cadastrar_Permissao) {
        this.cadastrar_Permissao = cadastrar_Permissao;
    }

    public String getCadastrar_Relatorio() {
        return cadastrar_Relatorio;
    }

    public void setCadastrar_Relatorio(String cadastrar_Relatorio) {
        this.cadastrar_Relatorio = cadastrar_Relatorio;
    }

    public String getEfetuar_Loguin() {
        return efetuar_Loguin;
    }

    public void setEfetuar_Loguin(String efetuar_Loguin) {
        this.efetuar_Loguin = efetuar_Loguin;
    }

    public String getEfetuar_Logoff() {
        return efetuar_Logoff;
    }

    public void setEfetuar_Logoff(String efetuar_Logoff) {
        this.efetuar_Logoff = efetuar_Logoff;
    }

    public String getRecuperar_Senha() {
        return recuperar_Senha;
    }

    public void setRecuperar_Senha(String recuperar_Senha) {
        this.recuperar_Senha = recuperar_Senha;
    }

    public String getRemover_Usuario() {
        return remover_Usuario;
    }

    public void setRemover_Usuario(String remover_Usuario) {
        this.remover_Usuario = remover_Usuario;
    }

    public String getRemover_Membro() {
        return remover_Membro;
    }

    public void setRemover_Membro(String remover_Membro) {
        this.remover_Membro = remover_Membro;
    }

    public String getRemover_Evangelista() {
        return remover_Evangelista;
    }

    public void setRemover_Evangelista(String remover_Evangelista) {
        this.remover_Evangelista = remover_Evangelista;
    }

    public String getRemover_Projeto() {
        return remover_Projeto;
    }

    public void setRemover_Projeto(String remover_Projeto) {
        this.remover_Projeto = remover_Projeto;
    }

    public String getRemover_Foto() {
        return remover_Foto;
    }

    public void setRemover_Foto(String remover_Foto) {
        this.remover_Foto = remover_Foto;
    }

    public String getRemover_Permissao() {
        return remover_Permissao;
    }

    public void setRemover_Permissao(String remover_Permissao) {
        this.remover_Permissao = remover_Permissao;
    }

    public String getRemover_Relatorio() {
        return remover_Relatorio;
    }

    public void setRemover_Relatorio(String remover_Relatorio) {
        this.remover_Relatorio = remover_Relatorio;
    }

    public String getEditar_Usuario() {
        return editar_Usuario;
    }

    public void setEditar_Usuario(String editar_Usuario) {
        this.editar_Usuario = editar_Usuario;
    }

    public String getEditar_Evangelista() {
        return editar_Evangelista;
    }

    public void setEditar_Evangelista(String editar_Evangelista) {
        this.editar_Evangelista = editar_Evangelista;
    }

    public String getEditar_Membro() {
        return editar_Membro;
    }

    public void setEditar_Membro(String editar_Membro) {
        this.editar_Membro = editar_Membro;
    }

    public String getEditar_Projeto() {
        return editar_Projeto;
    }

    public void setEditar_Projeto(String editar_Projeto) {
        this.editar_Projeto = editar_Projeto;
    }

    public String getEditar_Relatorio() {
        return editar_Relatorio;
    }

    public void setEditar_Relatorio(String editar_Relatorio) {
        this.editar_Relatorio = editar_Relatorio;
    }

    public String getBuscar_Usuario() {
        return buscar_Usuario;
    }

    public void setBuscar_Usuario(String buscar_Usuario) {
        this.buscar_Usuario = buscar_Usuario;
    }

    public String getBuscar_Membro() {
        return buscar_Membro;
    }

    public void setBuscar_Membro(String buscar_Membro) {
        this.buscar_Membro = buscar_Membro;
    }

    public String getBuscar_Evangelista() {
        return buscar_Evangelista;
    }

    public void setBuscar_Evangelista(String buscar_Evangelista) {
        this.buscar_Evangelista = buscar_Evangelista;
    }

    public String getBuscar_Projeto() {
        return buscar_Projeto;
    }

    public void setBuscar_Projeto(String buscar_Projeto) {
        this.buscar_Projeto = buscar_Projeto;
    }

    public String getBuscar_Foto() {
        return buscar_Foto;
    }

    public void setBuscar_Foto(String buscar_Foto) {
        this.buscar_Foto = buscar_Foto;
    }

    public String getBuscar_Permissao() {
        return buscar_Permissao;
    }

    public void setBuscar_Permissao(String buscar_Permissao) {
        this.buscar_Permissao = buscar_Permissao;
    }

    public String getBuscar_Relatorio() {
        return buscar_Relatorio;
    }

    public void setBuscar_Relatorio(String buscar_Relatorio) {
        this.buscar_Relatorio = buscar_Relatorio;
    }

    public String getPag_Usuario() {
        return pag_Usuario;
    }

    public void setPag_Usuario(String pag_Usuario) {
        this.pag_Usuario = pag_Usuario;
    }

    public String getPag_Membro() {
        return pag_Membro;
    }

    public void setPag_Membro(String pag_Membro) {
        this.pag_Membro = pag_Membro;
    }

    public String getPag_Evangelista() {
        return pag_Evangelista;
    }

    public void setPag_Evangelista(String pag_Evangelista) {
        this.pag_Evangelista = pag_Evangelista;
    }

    public String getPag_Rel_EVG_Dig() {
        return pag_Rel_EVG_Dig;
    }

    public void setPag_Rel_EVG_Dig(String pag_Rel_EVG_Dig) {
        this.pag_Rel_EVG_Dig = pag_Rel_EVG_Dig;
    }

    public String getPag_Rel_Pon_Ora() {
        return pag_Rel_Pon_Ora;
    }

    public void setPag_Rel_Pon_Ora(String pag_Rel_Pon_Ora) {
        this.pag_Rel_Pon_Ora = pag_Rel_Pon_Ora;
    }

    public String getPag_Rel_EVG_Lib() {
        return pag_Rel_EVG_Lib;
    }

    public void setPag_Rel_EVG_Lib(String pag_Rel_EVG_Lib) {
        this.pag_Rel_EVG_Lib = pag_Rel_EVG_Lib;
    }

    public String getPaf_Rel_EVG_Tri() {
        return pag_Rel_EVG_Tri;
    }

    public void setPaf_Rel_EVG_Tri(String paf_Rel_EVG_Tri) {
        this.pag_Rel_EVG_Tri = paf_Rel_EVG_Tri;
    }

    public String getPag_Rel_Gua_Est() {
        return pag_Rel_Gua_Est;
    }

    public void setPag_Rel_Gua_Est(String pag_Rel_Gua_Est) {
        this.pag_Rel_Gua_Est = pag_Rel_Gua_Est;
    }

    public String getPag_Rel_EVG_APC() {
        return pag_Rel_EVG_APC;
    }

    public void setPag_Rel_EVG_APC(String pag_Rel_EVG_APC) {
        this.pag_Rel_EVG_APC = pag_Rel_EVG_APC;
    }

    public String getPag_Rel_EVG_Rua() {
        return pag_Rel_EVG_Rua;
    }

    public void setPag_Rel_EVG_Rua(String pag_Rel_EVG_Rua) {
        this.pag_Rel_EVG_Rua = pag_Rel_EVG_Rua;
    }

    public String getPag_Rel_EVG_Night() {
        return pag_Rel_EVG_Night;
    }

    public void setPag_Rel_EVG_Night(String pag_Rel_EVG_Night) {
        this.pag_Rel_EVG_Night = pag_Rel_EVG_Night;
    }

    public String getPag_Rel_Ag_Com() {
        return pag_Rel_Ag_Com;
    }

    public void setPag_Rel_Ag_Com(String pag_Rel_Ag_Com) {
        this.pag_Rel_Ag_Com = pag_Rel_Ag_Com;
    }

    public String getPag_Rel_Anj_Mad() {
        return pag_Rel_Anj_Mad;
    }

    public void setPag_Rel_Anj_Mad(String pag_Rel_Anj_Mad) {
        this.pag_Rel_Anj_Mad = pag_Rel_Anj_Mad;
    }

    public String getPag_Rel_Nu_Lar() {
        return pag_Rel_Nu_Lar;
    }

    public void setPag_Rel_Nu_Lar(String pag_Rel_Nu_Lar) {
        this.pag_Rel_Nu_Lar = pag_Rel_Nu_Lar;
    }

    public String getPag_Rel_EVG_Cons() {
        return pag_Rel_EVG_Cons;
    }

    public void setPag_Rel_EVG_Cons(String pag_Rel_EVG_Cons) {
        this.pag_Rel_EVG_Cons = pag_Rel_EVG_Cons;
    }

    public String getPag_Permissao() {
        return pag_Permissao;
    }

    public void setPag_Permissao(String pag_Permissao) {
        this.pag_Permissao = pag_Permissao;
    }

    public String getPag_Projeto() {
        return pag_Projeto;
    }

    public void setPag_Projeto(String pag_Projeto) {
        this.pag_Projeto = pag_Projeto;
    }

    public String getPag_Foto() {
        return pag_Foto;
    }

    public void setPag_Foto(String pag_Foto) {
        this.pag_Foto = pag_Foto;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cod_Perimissao != null ? cod_Perimissao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permissao)) {
            return false;
        }
        Permissao other = (Permissao) object;
        if ((this.cod_Perimissao == null && other.cod_Perimissao != null) || (this.cod_Perimissao != null && !this.cod_Perimissao.equals(other.cod_Perimissao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.provas.classis.Permissao[ id= " + cod_Perimissao + " ]";
    }
    
}

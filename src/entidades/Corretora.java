package entidades;

import java.math.BigInteger;

public class Corretora {
    private String nome;
    private String site;
    private String perfil;
    private String codigo;
    private BigInteger cnpj;
    private boolean ativo;
    
    public Corretora(String nome, String site, String perfil, String codigo, BigInteger cnpj, boolean ativo) {
        this.nome = nome;
        this.site = site;
        this.perfil = perfil;
        this.codigo = codigo;
        this.cnpj = cnpj;
        this.ativo = ativo;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSite() {
        return site;
    }
    public void setSite(String site) {
        this.site = site;
    }
    public String getPerfil() {
        return perfil;
    }
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public BigInteger getCnpj() {
        return cnpj;
    }
    public void setCnpj(BigInteger cnpj) {
        this.cnpj = cnpj;
    }
    public boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    
    
}

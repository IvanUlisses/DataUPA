package br.com.dataupa.bns;

public class Paciente {

    private String nome;
    private String sexo;
    private String dataNasc;
    private String rg;
    private String cpf;
    private Endereco endereco;

    public Paciente() {
    }

    public Paciente(String nome, String sexo, String dataNasc, String rg, String cpf, Endereco endereco) {
        this.nome = nome;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

}

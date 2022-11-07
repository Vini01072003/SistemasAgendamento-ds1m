/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.senai.sp.jandira.model;

/**
 *
 * @author 22282103
 */
public class Pessoa { 
    public String nome;
    public String telefone;
    public String email;
    public String dataNascimento;
    public String tipoSnguineo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTipoSnguineo() {
        return tipoSnguineo;
    }

    public void setTipoSnguineo(String tipoSnguineo) {
        this.tipoSnguineo = tipoSnguineo;
    }

    public String getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(String planoSaude) {
        this.planoSaude = planoSaude;
    }
    public String planoSaude;
    
}





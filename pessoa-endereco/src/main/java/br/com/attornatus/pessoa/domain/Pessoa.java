package br.com.attornatus.pessoa.domain;

import br.com.attornatus.endereco.domain.Endereco;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;


public class Pessoa {

    @NotBlank
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
    private Endereco endereco;


    public Pessoa(String nome, LocalDate dataNascimento, Endereco endereco) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }
}
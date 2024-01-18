package br.com.attornatus.pessoa.application.api;

import br.com.attornatus.pessoa.domain.Pessoa;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Getter
public class PessoaDetalhadaResponse {

    private String nome;
    private LocalDate dataNascimento;

    public PessoaDetalhadaResponse(Pessoa pessoa) {
    this.nome = pessoa.getNome();
    this.dataNascimento = pessoa.getDataNascimento();
    }
}
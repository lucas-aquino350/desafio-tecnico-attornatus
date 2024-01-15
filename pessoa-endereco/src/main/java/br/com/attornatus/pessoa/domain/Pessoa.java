package br.com.attornatus.pessoa.domain;

import br.com.attornatus.endereco.domain.Endereco;
import br.com.attornatus.pessoa.application.api.PessoaRequest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.UUID;


@Getter
@ToString
@Entity
@Table(name = "pessoa")
@NoArgsConstructor
public class Pessoa {

    @Id
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    private UUID idPessoa;
    @NotBlank
    private String nome;
    @NotNull
    private LocalDate dataNascimento;


    public Pessoa(PessoaRequest pessoaRequest) {
        this.idPessoa = UUID.randomUUID();
        this.nome = pessoaRequest.getNome();
        this.dataNascimento = pessoaRequest.getDataNascimento();
    }
}
package br.com.attornatus.endereco.application.api;

import br.com.attornatus.endereco.domain.TipoEndereco;
import br.com.attornatus.pessoa.domain.Pessoa;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

public class EnderecoRequest {

    @Id
    private UUID idEndereco;
    @NotBlank
    @Column(unique = true)
    private String logradouro;
    @NotBlank
    private String numero;
    @NotBlank
    private String cidade;
    @NotNull
    private String cep;
    @NotBlank
    private TipoEndereco tipoEndereco;

    public EnderecoRequest(UUID idEndereco, String logradouro, String numero, String cidade, String cep, TipoEndereco tipoEndereco) {
        this.idEndereco = idEndereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
        this.tipoEndereco = tipoEndereco;
    }
}

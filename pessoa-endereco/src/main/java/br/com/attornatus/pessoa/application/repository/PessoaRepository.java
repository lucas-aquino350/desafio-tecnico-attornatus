package br.com.attornatus.pessoa.application.repository;

import br.com.attornatus.pessoa.application.api.PessoaResponse;
import br.com.attornatus.pessoa.domain.Pessoa;

import java.util.UUID;

public interface PessoaRepository {
    Pessoa salva(Pessoa pessoa);
    Pessoa buscaPessoaPorId(UUID idPessoa);
}
package br.com.attornatus.pessoa.application.repository;

import br.com.attornatus.pessoa.application.api.PessoaResponse;
import br.com.attornatus.pessoa.domain.Pessoa;

public interface PessoaRepository {
    PessoaResponse salva(Pessoa pessoa);
}

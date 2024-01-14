package br.com.attornatus.pessoa.service;

import br.com.attornatus.pessoa.api.PessoaRequest;
import br.com.attornatus.pessoa.api.PessoaResponse;

public interface PessoaService {
    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);
}

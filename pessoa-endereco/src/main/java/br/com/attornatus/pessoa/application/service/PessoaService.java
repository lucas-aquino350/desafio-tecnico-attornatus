package br.com.attornatus.pessoa.application.service;

import br.com.attornatus.pessoa.application.api.PessoaDetalhadaResponse;
import br.com.attornatus.pessoa.application.api.PessoaRequest;
import br.com.attornatus.pessoa.application.api.PessoaResponse;

import java.util.UUID;

public interface PessoaService {
    PessoaResponse criaPessoa(PessoaRequest pessoaRequest);
    PessoaDetalhadaResponse buscaPessoaPorId(UUID idPessoa);
}

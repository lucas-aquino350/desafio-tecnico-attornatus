package br.com.attornatus.endereco.application.service;

import br.com.attornatus.endereco.application.api.EnderecoRequest;
import br.com.attornatus.endereco.application.api.EnderecoResponse;

import java.util.UUID;

public interface EnderecoService {
    EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest, UUID idPessoa);
}
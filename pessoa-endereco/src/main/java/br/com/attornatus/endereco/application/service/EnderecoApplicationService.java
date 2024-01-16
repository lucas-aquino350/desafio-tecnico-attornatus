package br.com.attornatus.endereco.application.service;

import br.com.attornatus.endereco.application.api.EnderecoRequest;
import br.com.attornatus.endereco.application.api.EnderecoResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Log4j2
@RequiredArgsConstructor
public class EnderecoApplicationService implements EnderecoService {
    @Override
    public EnderecoResponse criaEndereco(EnderecoRequest enderecoRequest, UUID idPessoa) {
        log.info("[inicia] EnderecoApplicationService - criaEndereco");
        log.info("[finaliza] EnderecoApplicationService - criaEndereco");
        return null;
    }
}

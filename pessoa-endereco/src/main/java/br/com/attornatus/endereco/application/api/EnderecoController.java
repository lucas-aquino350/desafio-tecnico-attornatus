package br.com.attornatus.endereco.application.api;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EnderecoController implements EnderecoApi {
    @Override
    public EnderecoResponse postEndereco(EnderecoRequest enderecoRequest, UUID idPessoa) {
        log.info("[inicia] EnderecoController - postEndereco");
        log.info("[finaliza] EnderecoController - postEndereco");
        return null;
    }
}
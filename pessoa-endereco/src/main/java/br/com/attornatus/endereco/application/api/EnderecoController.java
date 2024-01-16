package br.com.attornatus.endereco.application.api;

import br.com.attornatus.endereco.application.service.EnderecoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@Log4j2
@RequiredArgsConstructor
public class EnderecoController implements EnderecoApi {
    private final EnderecoService enderecoService;

    @Override
    public EnderecoResponse postEndereco(EnderecoRequest enderecoRequest, UUID idPessoa) {
        log.info("[inicia] EnderecoController - postEndereco");
        EnderecoResponse enderecoCriado = enderecoService.criaEndereco(enderecoRequest, idPessoa);
        log.info("[finaliza] EnderecoController - postEndereco");
        return enderecoCriado;
    }
}
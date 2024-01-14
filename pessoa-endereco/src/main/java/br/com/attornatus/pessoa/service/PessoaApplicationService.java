package br.com.attornatus.pessoa.service;

import br.com.attornatus.pessoa.api.PessoaRequest;
import br.com.attornatus.pessoa.api.PessoaResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {
    @Override
    public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
    log.info("[inicia] PessoaApplicationService - criaPessoa");
    log.info("[finaliza] PessoaApplicationService - criaPessoa");
        return null;
    }
}

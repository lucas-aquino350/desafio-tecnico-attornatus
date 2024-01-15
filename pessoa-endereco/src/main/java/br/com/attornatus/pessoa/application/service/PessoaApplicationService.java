package br.com.attornatus.pessoa.application.service;

import br.com.attornatus.pessoa.application.api.PessoaRequest;
import br.com.attornatus.pessoa.application.api.PessoaResponse;
import br.com.attornatus.pessoa.application.repository.PessoaRepository;
import br.com.attornatus.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@RequiredArgsConstructor
public class PessoaApplicationService implements PessoaService {

    private final PessoaRepository pessoaRepository;

    @Override
    public PessoaResponse criaPessoa(PessoaRequest pessoaRequest) {
    log.info("[inicia] PessoaApplicationService - criaPessoa");
    Pessoa pessoa = pessoaRepository.salva(new Pessoa(pessoaRequest));
    log.info("[finaliza] PessoaApplicationService - criaPessoa");
        return new PessoaResponse(pessoa.getIdPessoa());
    }
}
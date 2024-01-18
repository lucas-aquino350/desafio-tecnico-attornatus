package br.com.attornatus.pessoa.application.service;

import br.com.attornatus.pessoa.application.api.PessoaDetalhadaResponse;
import br.com.attornatus.pessoa.application.api.PessoaRequest;
import br.com.attornatus.pessoa.application.api.PessoaResponse;
import br.com.attornatus.pessoa.application.repository.PessoaRepository;
import br.com.attornatus.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.UUID;

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

    @Override
    public PessoaDetalhadaResponse buscaPessoaPorId(UUID idPessoa) {
    log.info("[inicia] PessoaApplicationService - buscaPessoaPorId");
    Pessoa pessoa = pessoaRepository.buscaPessoaPorId(idPessoa);
    log.info("[finaliza] PessoaApplicationService - buscaPessoaPorId");
        return new PessoaDetalhadaResponse(pessoa);
    }
}
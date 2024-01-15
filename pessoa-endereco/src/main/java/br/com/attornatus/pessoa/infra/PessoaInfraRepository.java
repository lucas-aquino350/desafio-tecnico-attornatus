package br.com.attornatus.pessoa.infra;

import br.com.attornatus.pessoa.application.api.PessoaResponse;
import br.com.attornatus.pessoa.application.repository.PessoaRepository;
import br.com.attornatus.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PessoaInfraRepository implements PessoaRepository {
    @Override
    public PessoaResponse salva(Pessoa pessoa) {
        log.info("[inicia] PessoaInfraRepository - salva");
        log.info("[finaliza] PessoaInfraRepository - salva");
        return null;
    }
}

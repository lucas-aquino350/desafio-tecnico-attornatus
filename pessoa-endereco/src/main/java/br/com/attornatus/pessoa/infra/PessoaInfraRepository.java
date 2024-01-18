package br.com.attornatus.pessoa.infra;

import br.com.attornatus.pessoa.application.api.PessoaResponse;
import br.com.attornatus.pessoa.application.repository.PessoaRepository;
import br.com.attornatus.pessoa.domain.Pessoa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@Log4j2
@RequiredArgsConstructor
public class PessoaInfraRepository implements PessoaRepository {
    private final PessoaSpringDataJPARepository pessoaSpringDataJPARepository;

    @Override
    public Pessoa salva(Pessoa pessoa) {
        log.info("[inicia] PessoaInfraRepository - salva");
        pessoaSpringDataJPARepository.save(pessoa);
        log.info("[finaliza] PessoaInfraRepository - salva");
        return pessoa;
    }

    @Override
    public Pessoa buscaPessoaPorId(UUID idPessoa) {
        log.info("[inicia] PessoaInfraRepository - buscaPessoaPorId");
        Pessoa pessoa = pessoaSpringDataJPARepository.findById(idPessoa)
                .orElseThrow( () -> new RuntimeException("Pessoa não encontrada!"));
        log.info("[finaliza] PessoaInfraRepository - buscaPessoaPorId");
        return pessoa;
    }
}

package br.com.attornatus.pessoa.infra;

import br.com.attornatus.pessoa.domain.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PessoaSpringDataJPARepository extends JpaRepository<Pessoa, UUID> {
}

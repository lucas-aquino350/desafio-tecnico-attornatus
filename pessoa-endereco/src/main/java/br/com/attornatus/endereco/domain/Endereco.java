package br.com.attornatus.endereco.domain;

import br.com.attornatus.pessoa.domain.Pessoa;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
import net.bytebuddy.implementation.bind.MethodDelegationBinder;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Getter
@ToString
@Entity
@Table(name = "endereco")
@NoArgsConstructor
public class Endereco {

    @Id
    @Column(name = "id", updatable = false, unique = true, nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idEndereco;
    @NotBlank
    @Column(unique = true)
    private String logradouro;
    @NotBlank
    private String numero;
    @NotBlank
    private String cidade;
    @NotNull
    private String cep;
    @NotBlank
    private TipoEndereco tipoEndereco;
    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Pessoa pessoa;

    public Endereco(UUID idEndereco, String logradouro, String numero, String cidade, String cep, TipoEndereco tipoEndereco) {
        this.idEndereco = idEndereco;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.cep = cep;
        this.tipoEndereco = tipoEndereco;
    }
}
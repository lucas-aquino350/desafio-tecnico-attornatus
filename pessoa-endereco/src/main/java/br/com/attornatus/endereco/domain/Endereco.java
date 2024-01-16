package br.com.attornatus.endereco.domain;

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
}
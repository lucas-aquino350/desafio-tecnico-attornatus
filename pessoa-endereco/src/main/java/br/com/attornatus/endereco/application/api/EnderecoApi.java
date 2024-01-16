package br.com.attornatus.endereco.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/v1/endereco")
public interface EnderecoApi {

    @PostMapping("/{idPessoa}")
    @ResponseStatus(code = HttpStatus.CREATED)
    EnderecoResponse postEndereco (@RequestBody @Valid EnderecoRequest enderecoRequest, @PathVariable UUID idPessoa);
}

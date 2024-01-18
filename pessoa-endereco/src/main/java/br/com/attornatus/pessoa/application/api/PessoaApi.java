package br.com.attornatus.pessoa.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.UUID;

@RestController
@RequestMapping("/v1/pessoa")
public interface PessoaApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse postPessoa(@RequestBody @Valid PessoaRequest pessoaRequest);

    @GetMapping("/{idPessoa}")
    @ResponseStatus(code = HttpStatus.OK)
    PessoaDetalhadaResponse getPessoaPorId(@PathVariable UUID idPessoa);
}
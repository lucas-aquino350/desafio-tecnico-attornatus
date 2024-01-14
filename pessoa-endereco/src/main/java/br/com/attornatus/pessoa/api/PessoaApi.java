package br.com.attornatus.pessoa.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/pessoa")
public interface PessoaApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    PessoaResponse postPessoa(@RequestBody @Valid PessoaRequest pessoaRequest);
}
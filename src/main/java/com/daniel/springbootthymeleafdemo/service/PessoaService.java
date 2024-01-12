package com.daniel.springbootthymeleafdemo.service;

import java.util.List;

import com.daniel.springbootthymeleafdemo.model.Pessoa;

public interface PessoaService {
    Pessoa salvarPessoa(Pessoa pessoa);
    List<Pessoa> listarTodasPessoas();
    Pessoa buscarPorId(Long id);
}

package com.daniel.springbootthymeleafdemo.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.springbootthymeleafdemo.model.Pessoa;
import com.daniel.springbootthymeleafdemo.repository.PessoaRepository;
import com.daniel.springbootthymeleafdemo.service.PessoaService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PessoaServiceImpl implements PessoaService {

    private PessoaRepository pessoaRepository;

    @Override
    public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    @Override
    public List<Pessoa> listarTodasPessoas() {
        return pessoaRepository.findAll();
    }

    @Override
    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id).orElseThrow(() -> new RuntimeException("Id: " + id + " não encontardo!"));
    }

}

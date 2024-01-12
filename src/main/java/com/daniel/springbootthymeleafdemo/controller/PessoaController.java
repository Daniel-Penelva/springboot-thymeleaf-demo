package com.daniel.springbootthymeleafdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniel.springbootthymeleafdemo.model.Pessoa;
import com.daniel.springbootthymeleafdemo.service.PessoaService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/pessoa")
@RequiredArgsConstructor
public class PessoaController {

    private final PessoaService pessoaService;

    // http://localhost:8080/pessoa/listar
    @GetMapping("/listar")
    public String listarPessoas(Model model) {
        List<Pessoa> pessoas = pessoaService.listarTodasPessoas();
        model.addAttribute("pessoas", pessoas);
        return "pessoa/listar";
    }

    // http://localhost:8080/pessoa/cadastro
    @GetMapping("/cadastro")
    public String exibirFormCadastro(Model model) {
        model.addAttribute("pessoa", new Pessoa());
        return "/pessoa/cadastro";
    }

    // http://localhost:8080/pessoa/cadastro
    @PostMapping("/cadastro")
    public String cadastrarPessoa(@ModelAttribute("pessoa") Pessoa pessoa) {
        pessoaService.salvarPessoa(pessoa);
        return "redirect:/pessoa/listar";
    }

}

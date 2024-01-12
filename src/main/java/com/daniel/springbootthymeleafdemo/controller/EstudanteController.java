package com.daniel.springbootthymeleafdemo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.daniel.springbootthymeleafdemo.model.Estudante;
import com.daniel.springbootthymeleafdemo.service.EstudanteService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/estudante")
@RequiredArgsConstructor
public class EstudanteController {

    private final EstudanteService estudanteService;

    // http://localhost:8080/pessoa/listar
    @GetMapping("/listar")
    public String listarEstudantes(Model model) {
        List<Estudante> estudantes = estudanteService.listarTodosEstudantes();
        model.addAttribute("estudantes", estudantes);
        return "/estudante/listar";
    }

    // http://localhost:8080/pessoa/cadastro
    @GetMapping("/cadastro")
    public String exibirFormCadastro(Model model) {
        model.addAttribute("estudante", new Estudante());
        return "/estudante/cadastro";
    }

    @PostMapping("/cadastro")
    public String cadastrarEstudante(@ModelAttribute("estudante") Estudante estudante) {
        estudanteService.criarEstudante(estudante);
        return "redirect:/estudante/listar";
    }

}

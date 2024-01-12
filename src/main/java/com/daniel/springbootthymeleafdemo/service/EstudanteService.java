package com.daniel.springbootthymeleafdemo.service;

import java.util.List;

import com.daniel.springbootthymeleafdemo.model.Estudante;

public interface EstudanteService {

    Estudante criarEstudante(Estudante estudante);
    List<Estudante> listarTodosEstudantes();
    Estudante buscarPorId(Long id);
    
}

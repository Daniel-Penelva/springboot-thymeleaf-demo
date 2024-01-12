package com.daniel.springbootthymeleafdemo.service.serviceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.daniel.springbootthymeleafdemo.model.Estudante;
import com.daniel.springbootthymeleafdemo.repository.EstudanteRepository;
import com.daniel.springbootthymeleafdemo.service.EstudanteService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EstudanteServiceImpl implements EstudanteService{

    private EstudanteRepository estudanteRepository;

    @Override
    public Estudante criarEstudante(Estudante estudante) {
       return estudanteRepository.save(estudante);
    }

    @Override
    public List<Estudante> listarTodosEstudantes() {
        return estudanteRepository.findAll();
    }

    @Override
    public Estudante buscarPorId(Long id) {
       return estudanteRepository.findById(id).orElseThrow(() -> new RuntimeException("Id: " + id + " não encontardo!"));
    }
    
}

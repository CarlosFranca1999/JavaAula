package com.senai.franca.Service;

import com.senai.franca.Interface.AlunoRepository;
import com.senai.franca.Model.AlunoSenai;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }

    public List<AlunoSenai> buscarAluno() {
        return repository.findAll();

    }

    public AlunoSenai save(AlunoSenai alunoSenai) {

        return repository.save(alunoSenai);
    }

    public void deletar(Long id) {

        repository.deleteById(id);
    }

    public AlunoSenai buscarPorid(Long id) {

        return repository.findById(id).orElse(null);
    }

}

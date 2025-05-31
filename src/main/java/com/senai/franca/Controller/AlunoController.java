package com.senai.franca.Controller;

import com.senai.franca.Model.AlunoSenai;
import com.senai.franca.Service.AlunoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class AlunoController {

    private final AlunoService service;

    public AlunoController(AlunoService service) {
        this.service = service;
    }
    @GetMapping
    public List<AlunoSenai> listar() {
        return service.buscarAluno();
    }
    @PostMapping
    public AlunoSenai criar( AlunoSenai alunoSenai) {
        return service.save(alunoSenai);

    }@GetMapping("/{id}")
    public AlunoSenai buscarPorid(Long id) {
        return service.buscarPorid(id);
    }

    @PutMapping("/{id}")
    public AlunoSenai atualizar(Long id, AlunoSenai novoAluno) {
        AlunoSenai alunoExistente = service.buscarPorid(id);

        if (alunoExistente == null) return null;
        alunoExistente.setNome(novoAluno.getNome());
        alunoExistente.setEmail(novoAluno.getEmail());
        alunoExistente.setTelefone(novoAluno.getTelefone());
        return service.save(alunoExistente);
    }
        @DeleteMapping("/{id}")
        public void deletar(Long id) {
            service.deletar(id);
        }

    }




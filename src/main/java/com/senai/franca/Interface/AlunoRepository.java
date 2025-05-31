package com.senai.franca.Interface;


import com.senai.franca.Model.AlunoSenai;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoSenai, Long> {

}

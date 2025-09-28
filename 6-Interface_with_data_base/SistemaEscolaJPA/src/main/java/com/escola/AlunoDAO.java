package com.escola;

import java.util.List;

public class AlunoDAO extends GenericDAO<Aluno, String> {

    // Cria um aluno
    public void create(Aluno aluno) {
        super.create(aluno);
    }

    // Exclui um aluno pela Matrícula (chave)
    public void delete(String registration) {
        super.delete(registration, Aluno.class); 
    }

    // Atualiza um aluno
    public void update(Aluno aluno) {
        super.update(aluno);
    }
    
    // Lê um aluno pela Matrícula (chave)
    public Aluno read(String registration) {
        return super.read(registration, Aluno.class);
    }
    
    // Lê todos os alunos
    public List<Aluno> readAll() {
        return super.readAll(Aluno.class);
    }
}
package com.escola;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity // 1. Marca esta classe como uma Entidade JPA
@Table(name = "ALUNO") // 2. (Opcional) Especifica o nome da tabela no BD
public class Aluno {
    
    // 3. Marca o campo como a Chave Primária (Primary Key)
    @Id 
    private String registration; // Corresponde a MATRICULA no BD
    private String name;         // Corresponde a NOME no BD
    @Column(name = "ENTRY_YEAR")
    private int year;            // Corresponde a ENTRADA no BD

    // Construtor Vazio (Obrigatório pelo JPA)
    public Aluno() {}

    // Construtor Completo
    public Aluno(String registration, String name, int year) {
        this.registration = registration;
        this.name = name;
        this.year = year;
    }
    
    // --- Getters e Setters (Essenciais no JPA) ---

    public String getRegistration() {
        return registration;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
package com.example.avaliacao.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Criptomoeda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @NotNull()
    @Size(min = 3 , max = 100 , message = "O nome deve ter entre 3 e 255 caracteres")
    private String nome;

    @NotNull()
    @Size(min = 3 , max = 3, message = "O nome deve ter 3 letras maiusculas")
    private String sigla;
    @NotNull()
    @Positive()
    private double precoAtual;
    @NotNull()
    @Positive()
    private double volumeNegociado;
    @NotNull()
    @PastOrPresent()
    private LocalDate dataCadastro;
    private Boolean ativo;
    @Size(max = 255 , message = "A descrição deve ter no máximo 255 caracteres")
    private String descricao;
    @NotNull()
    @Size(min = 2 , max = 60, message = "O nome não pode ter mais de 60 caracteres")
    private String pais;

    public Long getId() {
        return id;
    }




}

package com.github.todoservice.model;

import lombok.*;

import java.time.LocalDate;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {


    private Long id;
    private String descricao;
    private LocalDate dataVencimento;
    private boolean estado;

}

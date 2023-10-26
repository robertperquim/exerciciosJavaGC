package com.github.todoservice.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Getter
@ToString
@NoArgsConstructor
public class Task {

    private int id;
    private String descricao;
    private Date datavencimento;
    private boolean estado;

}

package com.naruto.AtictiveGroup.ninja;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "ninjas")
@Entity(name = "Ninjas")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Ninja {
     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private long id;
     private String nome;
     private String vila;
     private boolean status;
     @Enumerated(EnumType.STRING)
     private Experiencia experiencia;

     public Ninja(NinjaRegisterDate data){
         this.status = true;
         this.vila = data.vila();
         this.nome = data.nome();
         this.experiencia = data.expericencia();

     }
}

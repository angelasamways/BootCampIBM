package br.com.angela.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class TimeEntity {

    private Integer timeId;
    private String nomeTime;
    private List<JogadorEntity> listaJogadores;

}

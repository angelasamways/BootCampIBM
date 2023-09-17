package br.com.angela.controllers;

import br.com.angela.services.JogadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogador/all")
public class JogadorDeleteController {
    @Autowired
    JogadoresService jogadorService;

    @DeleteMapping
    public String apagarTodosJogadores(){
        jogadorService.apagarTodosJogadores();
        return "Jogador apagado com sucesso!";
    }
}

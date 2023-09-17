package br.com.angela.controllers;

import br.com.angela.entities.JogadorModelo;
import br.com.angela.services.JogadoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jogador")
public class JogadorPostController {

    @Autowired
    JogadoresService jogadorService;

    @PostMapping
    public String inserirJogador(@RequestBody JogadorModelo nomeJogador) {
        jogadorService.inserirJogador(nomeJogador.getNome());
        return "Jogador inserido com sucesso!";
    }

}

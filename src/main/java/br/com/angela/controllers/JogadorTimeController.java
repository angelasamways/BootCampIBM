package br.com.angela.controllers;

import br.com.angela.entities.JogadorTimeEntity;
import br.com.angela.services.JogadorTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static br.com.angela.exercicio.AngelaSamways.organizarTimes;

@RestController
public class JogadorTimeController {

    @Autowired
    JogadorTimeService jogadorTimeService;

    @PostMapping("/jogador")
    public void inserirJogador(@RequestBody JogadorTimeEntity nomeJogador) {
        jogadorTimeService.inserirJogador(nomeJogador.getNome());
    }

    @DeleteMapping("/jogador/all")
    public void apagarTodosJogadores() {
        jogadorTimeService.apagarTodosJogadores();
    }

    @GetMapping("/times")
    @ResponseBody
    public Object mostrarTimes() {
        Map<String, List<String>> timesOrganizados = organizarTimes(jogadorTimeService.mostrarTimes().stream().toList());
        Map<String, Object> times = new HashMap<>();
        int i = 1;
        for (Map.Entry<String, List<String>> entry : timesOrganizados.entrySet()) {
            times.put("Time " + i, entry.getValue());
            i++;
        }
        return times;
    }
}

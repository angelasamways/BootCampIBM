package br.com.angela.controllers;

import br.com.angela.entities.JogadorEntity;
import br.com.angela.services.JogadoresService;
import com.google.gson.JsonObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static br.com.angela.exercicio.AngelaSamways.organizarTimes;

@RestController
public class JogadorController {

    @Autowired
    JogadoresService jogadorService;

    @PostMapping("/jogador")
    public String inserirJogador(@RequestBody JogadorEntity nomeJogador) {
        jogadorService.inserirJogador(nomeJogador.getNome());
        return "";
    }

    @DeleteMapping("/jogador/all")
    public String apagarTodosJogadores(){
        jogadorService.apagarTodosJogadores();
        return "Jogador apagado com sucesso!";
    }

    @GetMapping("/times")
    public String mostrarTimes() {
        Map<String, List<String>> times = organizarTimes(jogadorService.mostrarTimes().stream().toList());
        JsonObject jsonObject = new JsonObject();
        int i = 1;
        for (Map.Entry<String, List<String>> entry : times.entrySet()) {
            jsonObject.addProperty("Time '" + i + "': ", entry.getValue().toString());
            System.out.println("Time '" + i + "': " + entry.getValue());
            i++;
        }
        return jsonObject.toString();
    }

}

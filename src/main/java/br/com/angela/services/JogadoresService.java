package br.com.angela.services;

import br.com.angela.entities.JogadorEntity;
import br.com.angela.repositories.JogadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class JogadoresService {

    @Autowired
    JogadoresRepository jogadorRepository;

    public void inserirJogador(String nomeJogardor) {
        jogadorRepository.inserirJogador(nomeJogardor);
    }

    public void apagarTodosJogadores() {
        jogadorRepository.excluirTodos();
    }

    public Set<String> mostrarTimes() {
        return jogadorRepository.mostrarTimes();
    }

}

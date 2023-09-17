package br.com.angela.services;

import br.com.angela.repositories.JogadoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JogadoresService {

    @Autowired
    JogadoresRepository jogadorRepository;

    public void apagarTodosJogadores() {
        jogadorRepository.deleteAll();
    }

    public void inserirJogador(String nomeJogardor) {
        jogadorRepository.inserirJogador(nomeJogardor);
    }
}

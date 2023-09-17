package br.com.angela.repositories;

import br.com.angela.entities.JogadorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class JogadoresRepository {

    JogadorEntity jogadorEntity;

    Set<String> jogadores;

    public void deleteAll() {
        jogadores.clear();
        jogadorEntity.setNomeJogador(new HashSet<>());
    }

    public void inserirJogador(String nomeJogador) {
        if (nomeJogador != null) {
            System.out.println("Nome do jogador não pode ser nulo");
        } else if (jogadores.contains(nomeJogador)) {
            System.out.println("Jogador já existe");
        } else {
            jogadores.add(nomeJogador);
            jogadorEntity.setNomeJogador(jogadores);
            System.out.println("Jogador adicionado");
        }
    }
}

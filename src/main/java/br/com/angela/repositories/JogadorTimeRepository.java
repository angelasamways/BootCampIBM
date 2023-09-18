package br.com.angela.repositories;

import org.springframework.stereotype.Repository;

import java.util.HashSet;
import java.util.Set;

@Repository
public class JogadorTimeRepository {

    Set<String> jogadores = new HashSet<>();

    public void inserirJogador(String nomeJogador) {
        if (nomeJogador == null) {
            System.out.println("Nome do jogador não pode ser nulo");
        } else if (jogadores.contains(nomeJogador)) {
            System.out.println("Jogador já existe");
        } else {
            jogadores.add(nomeJogador);
            System.out.println("Jogador adicionado");
        }
    }

    public void excluirTodos() {
        jogadores.clear();
    }

    public Set<String> mostrarTimes() {
        return jogadores;
    }
}

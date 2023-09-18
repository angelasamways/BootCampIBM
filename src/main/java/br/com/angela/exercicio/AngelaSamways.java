package br.com.angela.exercicio;

import java.util.*;

public class AngelaSamways {

    public static Map<String, List<String>> organizarTimes(List<String> jogadores) {
        Map<String, List<String>> times = new HashMap<>();
        Map<String, Set<String>> sobrenomesPorLetra = new HashMap<>();

        for (String jogador : jogadores) {
            String[] partesNome = jogador.toUpperCase().split(" ");

            if (partesNome.length != 2) {
                continue;
            }

            String sobrenome = partesNome[1];
            String primeiraLetra = sobrenome.substring(0, 1);

            if (sobrenomesPorLetra.containsKey(primeiraLetra) && sobrenomesPorLetra.get(primeiraLetra).contains(sobrenome)) {
                primeiraLetra = encontrarNovaLetraInicial(sobrenomesPorLetra, sobrenome);
            }

            if (!sobrenomesPorLetra.containsKey(primeiraLetra)) {
                sobrenomesPorLetra.put(primeiraLetra, new HashSet<>());
            }

            sobrenomesPorLetra.get(primeiraLetra).add(sobrenome);

            if (!times.containsKey(primeiraLetra)) {
                times.put(primeiraLetra, new ArrayList<>());
            }

            times.get(primeiraLetra).add(jogador);
        }

        return times;
    }

    private static String encontrarNovaLetraInicial(Map<String, Set<String>> sobrenomesPorLetra, String sobrenome) {

        for (char letra = 'A'; letra <= 'Z'; letra++) {
            String letraInicial = String.valueOf(letra);

            if (!sobrenomesPorLetra.containsKey(letraInicial)) {
                sobrenomesPorLetra.put(letraInicial, new HashSet<>());
                sobrenomesPorLetra.get(letraInicial).add(sobrenome);
                return letraInicial;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        List<String> jogadores = Arrays.asList(
                "Letícia Izidoro",
                "Mônica Hickman",
                "Duda Sampaio",
                "Ary Borges",
                "Andressa Alves",
                "Bia Zaneratto",
                "Gabi Nunes",
                "Aline Gomes",
                "Tamires Britto",
                "Rafaelle Souza",
                "Geyse Ferreira",
                "Adriana Silva",
                "Luana Bertolucci",
                "Lauren Leal",
                "Antonia Silva",
                "Luciana Dionízio",
                "Tainara Silva",
                "Ana Vitoria de Araújo",
                "Cristiane Silva"
        );

        Map<String, List<String>> times = organizarTimes(jogadores);


        int i = 1;
        for (Map.Entry<String, List<String>> entry : times.entrySet()) {
            System.out.println("Time '" + i + "': " + entry.getValue());
            i++;
        }
    }
}

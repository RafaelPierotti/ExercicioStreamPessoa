package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Rafael", 19),
                new Pessoa("Renan", 34),
                new Pessoa("Lorena", 8),
                new Pessoa("Theo", 2),
                new Pessoa("Yasmin", 19),
                new Pessoa("Maria", 56)
        );

        List<Pessoa> pessoasFiltradas = pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .sorted(Comparator.comparing(Pessoa::getNome))
                .collect(Collectors.toList());

        pessoasFiltradas.forEach(System.out::println);
    }
}
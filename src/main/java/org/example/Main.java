package org.example;

public class Main {
    public static void main(String[] args) {

        Requisicao[] requisicoes = {
                new Requisicao(500, "Compra de material de escritório", "Administrativo"),
                new Requisicao(2500, "Reforma da sala de reuniões", "Infraestrutura"),
                new Requisicao(15000, "Aquisição de servidor", "TI"),
                new Requisicao(800, "Passagens aéreas para conferência", "RH"),
                new Requisicao(250000, "Expansão de fábrica", "Operações")
        };

        System.out.println("---------------------------------------------------------------");
        System.out.println("  SISTEMA DE APROVAÇÃO DE DESPESAS - CHAIN OF RESPONSIBILITY   ");
        System.out.println("----------------------------------------------------------------\n");

        for (Requisicao req : requisicoes) {
            System.out.println("📋 Processando: " + req.getDescricao());
        }
    }
}
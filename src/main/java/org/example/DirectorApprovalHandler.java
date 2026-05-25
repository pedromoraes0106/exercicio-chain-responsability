package org.example;

public class DirectorApprovalHandler extends ApprovalHandler {
    private static final double LIMITE = 10000.0;

    @Override
    protected boolean canApprove(Requisicao request) {
        return request.getValor() <= LIMITE;
    }

    @Override
    protected void approve(Requisicao request) {
        request.setEstado("APROVADA");
        System.out.println("✓ APROVADA pelo Diretor (Limite: R$ 10.000)");
        System.out.println("  └─ " + request + "\n");
    }
}

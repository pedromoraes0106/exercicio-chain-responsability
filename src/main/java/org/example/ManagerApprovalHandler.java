package org.example;

public class ManagerApprovalHandler extends ApprovalHandler {
    private static final double LIMITE = 1000.0;

    @Override
    protected boolean canApprove(Requisicao request) {
        return request.getValor() <= LIMITE;
    }

    @Override
    protected void approve(Requisicao request) {
        request.setEstado("APROVADA");
        System.out.println("✓ APROVADA pelo Gerente (Limite: R$ 1.000)");
        System.out.println("  └─ " + request + "\n");
    }
}

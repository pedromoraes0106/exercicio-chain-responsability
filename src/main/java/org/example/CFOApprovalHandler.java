package org.example;

public class CFOApprovalHandler extends ApprovalHandler {
    private static final double LIMITE = 100000.0;

    @Override
    protected boolean canApprove(Requisicao request) {
        return request.getValor() <= LIMITE;
    }

    @Override
    protected void approve(Requisicao request) {
        request.setEstado("APROVADA");
        System.out.println("✓ APROVADA pelo CFO (Limite: R$ 100.000)");
        System.out.println("  └─ " + request + "\n");
    }
}

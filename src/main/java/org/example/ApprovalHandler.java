package org.example;

public abstract class ApprovalHandler implements Handler {

    protected ApprovalHandler next;

    public ApprovalHandler setNext(ApprovalHandler next) {
        this.next = next;
        return next;
    }

    @Override
    public void handle(Requisicao request) {

        if (canApprove(request)) {

            approve(request);

        } else if (next != null) {

            System.out.println("  └─ Encaminhando para o próximo nível de aprovação...");
            next.handle(request);

        } else {

            reject(request);
        }
    }

    protected abstract boolean canApprove(Requisicao request);

    protected abstract void approve(Requisicao request);

    protected void reject(Requisicao request) {

        request.setEstado("REJEITADA");

        System.out.println("✗ Requisição REJEITADA - Valor excede limite máximo de aprovação");
        System.out.println("  └─ " + request + "\n");
    }
}
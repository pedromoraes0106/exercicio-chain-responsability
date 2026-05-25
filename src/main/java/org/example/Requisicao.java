package org.example;

/**
 * Classe que representa uma requisição de despesa a ser aprovada
 */
public class Requisicao {
    private double valor;
    private String descricao;
    private String departamento;
    private String estado;

    public Requisicao(double valor, String descricao, String departamento) {
        this.valor = valor;
        this.descricao = descricao;
        this.departamento = departamento;
        this.estado = "PENDENTE";
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Requisicao{" +
                "valor=R$ " + String.format("%.2f", valor) +
                ", descricao='" + descricao + '\'' +
                ", departamento='" + departamento + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}

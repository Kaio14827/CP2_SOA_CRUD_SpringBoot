package br.com.fiap.checkpoint2.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import java.time.LocalDate;

@Entity
@Table(name = "pedidos")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome do cliente é obrigatório.")
    @Column(nullable = false)
    private String clienteNome;

    @Column(nullable = false)
    private LocalDate dataPedido;

    @PositiveOrZero(message = "O valor total não pode ser negativo.")
    private double valorTotal;

    // Preenche a data automaticamente antes de salvar
    @PrePersist
    protected void onCreate() {
        this.dataPedido = LocalDate.now();
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getClienteNome() { return clienteNome; }
    public void setClienteNome(String clienteNome) { this.clienteNome = clienteNome; }
    public LocalDate getDataPedido() { return dataPedido; }
    public void setDataPedido(LocalDate dataPedido) { this.dataPedido = dataPedido; }
    public double getValorTotal() { return valorTotal; }
    public void setValorTotal(double valorTotal) { this.valorTotal = valorTotal; }
}
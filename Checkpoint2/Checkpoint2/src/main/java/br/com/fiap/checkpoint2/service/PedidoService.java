package br.com.fiap.checkpoint2.service;

import br.com.fiap.checkpoint2.model.Pedido;
import br.com.fiap.checkpoint2.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public List<Pedido> listarTodos() {
        return repository.findAll();
    }

    public Optional<Pedido> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Pedido salvar(Pedido pedido) {
        return repository.save(pedido);
    }

    public Pedido atualizar(Long id, Pedido novoPedido) {
        return repository.findById(id).map(pedidoExistente -> {
            pedidoExistente.setClienteNome(novoPedido.getClienteNome());
            pedidoExistente.setValorTotal(novoPedido.getValorTotal());
            return repository.save(pedidoExistente);
        }).orElseThrow(() -> new RuntimeException("Pedido não encontrado com o ID: " + id));
    }

    public void deletar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("ID inexistente. Não foi possível deletar.");
        }
        repository.deleteById(id);
    }
}
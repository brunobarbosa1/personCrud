package dev.bruno.personCrud.business.service;

import dev.bruno.personCrud.infraestructure.entities.Pessoa;
import dev.bruno.personCrud.infraestructure.repository.PessoaRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

    public List<Pessoa> listarPessoas() {
        return pessoaRepository.findAll();
    }

    public Pessoa listarPessoasPorId(Long id) {
        return pessoaRepository.findById(id).orElseThrow(
                () -> new NullPointerException("Usuário com id " + " não encontrado!"));
    }

    public Pessoa criarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
    }

    public void deletarPessoaPorId(Long id) {
        pessoaRepository.deleteById(id);
    }

    public void alterarPessoa(Pessoa pessoa, Long id) {
        listarPessoasPorId(id);
        pessoaRepository.save(pessoa);
    }
}

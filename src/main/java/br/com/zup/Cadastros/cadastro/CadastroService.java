package br.com.zup.Cadastros.cadastro;

import br.com.zup.Cadastros.cadastro.dtos.CadastroDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public void CadastrarPessoa(CadastroDto cadastro) {

        LocalDate dataAtual = LocalDate.now();

        Cadastro novoCadastro = new Cadastro();

        novoCadastro.setCpf(cadastro.getCpf());
        novoCadastro.setNome(cadastro.getNome());
        novoCadastro.setSobrenome(cadastro.getSobrenome());
        novoCadastro.setCidade(cadastro.getCidade());
        novoCadastro.setBairro(cadastro.getCidade());
        novoCadastro.setNomeDoParenteProximo(cadastro.getNomeDoParenteProximo());
        novoCadastro.setMoraSozinho(cadastro.isMoraSozinho());
        novoCadastro.setTemPet(cadastro.isTemPet());
        novoCadastro.setIdade(cadastro.getIdade());
        novoCadastro.setDataDoCadastro(dataAtual);

        cadastroRepository.save(novoCadastro);


    }
}

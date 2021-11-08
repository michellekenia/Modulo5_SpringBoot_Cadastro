package br.com.zup.Cadastros.cadastro;

import br.com.zup.Cadastros.cadastro.dtos.PessoaDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public void CadastrarPessoa(PessoaDto pessoaDto) {

        PessoaDto pessoa = new PessoaDto();
        pessoa.setCpf(pessoaDto.getCpf());
        pessoa.setNome(pessoaDto.getNome());
        pessoa.setSobrenome(pessoaDto.getSobrenome());
        pessoa.setCidade(pessoaDto.getCidade());
        pessoa.setBairro(pessoaDto.getCidade());
        pessoa.setNomeDoParenteProximo(pessoaDto.getNomeDoParenteProximo());
        pessoa.setMoraSozinho(pessoaDto.isMoraSozinho());
        pessoa.setTemPet(pessoaDto.isTemPet());
        pessoa.setIdade(pessoaDto.getIdade());

        cadastroRepository.save(pessoa);

    }
}

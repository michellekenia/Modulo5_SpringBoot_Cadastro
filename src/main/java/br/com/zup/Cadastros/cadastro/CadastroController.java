package br.com.zup.Cadastros.cadastro;

import br.com.zup.Cadastros.cadastro.dtos.CadastroDto;
import br.com.zup.Cadastros.cadastro.dtos.RetornoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cadastros")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;

    @PostMapping
    public Cadastro realizarCadastro(@RequestBody CadastroDto cadastro) {

        return cadastroService.CadastrarPessoa(cadastro);
    }

    @GetMapping
    public List <RetornoDto> mostrarTodosCadastros () {
        List <RetornoDto> todosCadastros = new ArrayList<>();

        for (Cadastro cadastro : cadastroService.mostrarCadastros()){
            todosCadastros.add (new RetornoDto (cadastro.getCpf(), cadastro.getNome(), cadastro.getSobrenome()));
        }
        return todosCadastros;
    }



    /*
    todo  1 - crie um metodo para cadastrar uma pessoa.
      Para um cadastro todo os campos são obrigatórios EXCETO o campo dataDoCadastro que deve ser preenchido pelo proprio sistema e o client não deve saber da existencia desse campo
     todo 2 - Faça um metodo que retorna a lista inteira de cadastros ou filtrado por cadastros que moram sozinhos, que tem pet ou por idade.
     nessa lista deve ser retornado apenas os campos ID, NOME e SOBRENOME.
     todo 3 - faça um metodo para DELETAR um cadastro por id.
     todo 4 - faça um metodo que retorna TODOS os dados de um usuario pesquisado pelo ID.
     */

}

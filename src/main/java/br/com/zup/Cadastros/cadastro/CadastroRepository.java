package br.com.zup.Cadastros.cadastro;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CadastroRepository extends CrudRepository<Cadastro, String> {

    public List <Cadastro> findAll ();
}

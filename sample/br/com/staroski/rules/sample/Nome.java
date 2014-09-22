package br.com.staroski.rules.sample;

import br.com.staroski.rules.*;

// Especifica��o da regra que valida o nome de uma Pessoa
class Nome implements Specification<Pessoa> {

	@Override
	public void verify(Pessoa pessoa) throws UnattendedException {
		String nome = pessoa.nome;
		if (nome == null) {
			throw new UnattendedException("Nome n�o pode ser null");
		}
		if (!nome.matches("[A-Z]{1}[a-z]+")) {
			throw new UnattendedException("Nome precisa come�ar com letra maiuscula e ter pelo menos duas letras");
		}
	}
}
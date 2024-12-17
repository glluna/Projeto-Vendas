package br.com.luna.service;

import br.com.luna.dao.IProdutoDAO;
import br.com.luna.domain.Produto;
import br.com.luna.generic.service.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService{

	public ProdutoService(IProdutoDAO dao) {
		super(dao);
		// TODO Auto-generated constructor stub
	}

}

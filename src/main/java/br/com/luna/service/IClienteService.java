package br.com.luna.service;

import br.com.luna.domain.Cliente;
import br.com.luna.generic.service.IGenericService;
import exception.DAOException;

public interface IClienteService extends IGenericService<Cliente, Long>{

	Cliente buscarPorCPF(Long cpf) throws DAOException;
}

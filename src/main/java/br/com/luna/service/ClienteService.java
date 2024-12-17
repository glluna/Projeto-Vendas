/**
 * 
 */
package br.com.luna.service;

import br.com.luna.dao.IClienteDAO;
import br.com.luna.domain.Cliente;
import br.com.luna.generic.service.GenericService;
import exception.DAOException;
import exception.MaisDeUmRegistroException;
import exception.TableException;

/**
 * 
 */
public class ClienteService extends GenericService<Cliente, Long> implements IClienteService{

	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

}

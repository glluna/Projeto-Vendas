/**
 * 
 */
package br.com.luna.dao;

import br.com.luna.dao.generic.IGenericDAO;
import br.com.luna.domain.Venda;
import exception.DAOException;
import exception.TipoChaveNaoEncontradaException;

/**
 * 
 */
public interface IVendaDAO extends IGenericDAO<Venda, String>{
    
	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
}

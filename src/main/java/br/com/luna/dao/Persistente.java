/**
 * 
 */
package br.com.luna.dao;

/**
 * @author gabriel luna
 * 
 * Interface que representa todas as entidades ou objetos de aplicação que serão salvas no banco de dados.
 */
public interface Persistente {

	public Long getId();
	
	public void setId(Long id);
}

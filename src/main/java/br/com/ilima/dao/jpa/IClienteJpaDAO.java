package br.com.ilima.dao.jpa;

import br.com.ilima.dao.generic.jpa.IGenericJapDAO;
import br.com.ilima.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
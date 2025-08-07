package br.com.ilima.dao.jpa;

import br.com.ilima.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.ilima.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDB2DAO() {
        super(ClienteJpa.class);
    }

}
package br.com.ilima.dao.jpa;

import br.com.ilima.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.ilima.domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }

}
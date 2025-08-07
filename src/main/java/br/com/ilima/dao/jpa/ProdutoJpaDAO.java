package br.com.ilima.dao.jpa;

import br.com.ilima.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.ilima.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
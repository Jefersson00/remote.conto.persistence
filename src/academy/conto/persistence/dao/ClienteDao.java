package academy.conto.persistence.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import academy.conto.persistence.entity.Cliente;

public class ClienteDao {
	
	
	private EntityManager em;
	
	public ClienteDao(EntityManager entityManager) {
		this.em = entityManager;
	}
	

	public boolean insertCliente(Cliente cliente) throws Exception {

		em.persist(cliente);

		return true;
	}

	public boolean removeCliente(Integer id) throws Exception {

		Cliente clienteRes = em.find(Cliente.class, id);
		em.remove(clienteRes);

		return true;
	}

	public Cliente saveOrUpdateTester(Cliente cliente) throws Exception {

		Cliente clienteRes = em.merge(cliente);
		return clienteRes;
	}

	public Cliente selectById(Integer id) throws Exception {

		Cliente res = em.find(Cliente.class, id);// select * from cliente where id = ?
		return res;
	}
	
	
	
	public List<Cliente> findAllClientiCriteria() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Cliente> cq = builder.createQuery(Cliente.class);
		Root<Cliente> root = cq.from(Cliente.class);
		cq.select(root);
		return em.createQuery(cq).getResultList();
	}
	
	public List<Cliente> selectQueryName() throws Exception {
		
		List<Cliente> res =  (List<Cliente>) em.createNamedQuery("Cliente.findAll");
		return res;
	}		
	
	
}

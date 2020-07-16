package academy.conto.persistence.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import academy.conto.persistence.entity.Movimento;

public class MovimentoDao {
	
	private EntityManager em;
	
	public MovimentoDao(EntityManager entityManager) {
		this.em = entityManager;
	}
	
	

	public boolean insertMovimento(Movimento movimento) throws Exception {

		em.persist(movimento);

		return true;
	}

	public boolean removeMovimento(Integer id) throws Exception {

		Movimento movimentoRes = em.find(Movimento.class, id);
		em.remove(movimentoRes);

		return true;
	}

	public Movimento saveOrUpdateTester(Movimento movimento) throws Exception {

		Movimento movimentoRes = em.merge(movimento);
		return movimentoRes;
	}

	public Movimento selectById(Integer id) throws Exception {

		Movimento res = em.find(Movimento.class, id);// select * from movimento where id = ?
		return res;
	}
	
	
	
	public List<Movimento> findAllClientiCriteria() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Movimento> cq = builder.createQuery(Movimento.class);
		Root<Movimento> root = cq.from(Movimento.class);
		cq.select(root);
		return em.createQuery(cq).getResultList();
	}
	
	public List<Movimento> selectQueryName() throws Exception {
		
		List<Movimento> res =  (List<Movimento>) em.createNamedQuery("Movimento.findAll");
		return res;
	}		
	
}

package academy.conto.persistence.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import academy.conto.persistence.entity.Conto;

public class ContoDao {
	
	
	private EntityManager em;
	
	public ContoDao(EntityManager entityManager) {
		this.em = entityManager;
	}
	

	public boolean insertConto(Conto conto) throws Exception {

		em.persist(conto);

		return true;
	}

	public boolean removeConto(Integer id) throws Exception {

		Conto contoRes = em.find(Conto.class, id);
		em.remove(contoRes);

		return true;
	}

	public Conto saveOrUpdateTester(Conto conto) throws Exception {

		Conto contoRes = em.merge(conto);
		return contoRes;
	}

	public Conto selectById(Integer id) throws Exception {

		Conto res = em.find(Conto.class, id);// select * from conto where id = ?
		return res;
	}
	
	
	
	public List<Conto> findAllContiCriteria() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		CriteriaQuery<Conto> cq = builder.createQuery(Conto.class);
		Root<Conto> root = cq.from(Conto.class);
		cq.select(root);
		return em.createQuery(cq).getResultList();
	}
	

	
	public List<Conto> selectQueryName() throws Exception {
		
		List<Conto> res =  (List<Conto>) em.createNamedQuery("Conto.findAll");
		return res;
	}		
	
	
}

package services.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import services.interfaces.QuizzGenManLocal;
import services.interfaces.QuizzGenManRemote;
import domain.Category;

/**
 * Session Bean implementation class QuizzGenMan
 */
@Stateless
public class QuizzGenMan implements QuizzGenManRemote, QuizzGenManLocal {
	@PersistenceContext
	private EntityManager entityManager;

	/**
	 * Default constructor.
	 */
	public QuizzGenMan() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addCategory(Category category) {
		Boolean b = false;
		try {
			entityManager.persist(category);
			b = true;
		} catch (Exception e) {
		}
		return b;
	}

	@Override
	public List<Category> findAllCategories() {
		String jpql = "select c from Category c";
		return entityManager.createQuery(jpql, Category.class).getResultList();
	}

}

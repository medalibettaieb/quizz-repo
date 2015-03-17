package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import domain.Category;

@Local
public interface QuizzGenManLocal {
	Boolean addCategory(Category category);

	List<Category> findAllCategories();
}

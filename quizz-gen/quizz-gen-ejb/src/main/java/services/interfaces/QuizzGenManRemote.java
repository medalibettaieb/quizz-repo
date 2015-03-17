package services.interfaces;

import java.util.List;

import javax.ejb.Remote;

import domain.Category;

@Remote
public interface QuizzGenManRemote {
	Boolean addCategory(Category category);

	List<Category> findAllCategories();

}

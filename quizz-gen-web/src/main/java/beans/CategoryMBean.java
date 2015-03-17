package beans;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import services.interfaces.QuizzGenManLocal;
import domain.Category;

@ManagedBean
@SessionScoped
public class CategoryMBean {
	private Category category = new Category();

	@EJB
	private QuizzGenManLocal quizzGenManLocal;

	public String doAddCategory() {
		quizzGenManLocal.addCategory(category);
		return "";
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}

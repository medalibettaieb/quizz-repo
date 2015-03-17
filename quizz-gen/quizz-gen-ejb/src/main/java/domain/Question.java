package domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 * Entity implementation class for Entity: Question
 *
 */
@Entity
public class Question implements Serializable {

	private Integer id;
	private String libele;
	private DifficultyEnum level;
	private static final long serialVersionUID = 1L;

	private List<Response> responses;
	private Category category;

	public Question() {
		super();
	}

	@Id
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLibele() {
		return this.libele;
	}

	public void setLibele(String libele) {
		this.libele = libele;
	}

	public DifficultyEnum getLevel() {
		return level;
	}

	public void setLevel(DifficultyEnum level) {
		this.level = level;
	}

	@OneToMany(mappedBy = "question")
	public List<Response> getResponses() {
		return responses;
	}

	public void setResponses(List<Response> responses) {
		this.responses = responses;
	}

	@ManyToOne
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}

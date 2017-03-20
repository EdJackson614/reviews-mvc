package review;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity // The Category class is annotated with @Entity, indicating that it is a
		// JPA entity

public class Category {

	@Id // The Category id property is annotated with @Id so that JPA will
		// recognize it as the object’s primary key- id.
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String title; // firstName and lastName is assumed will be mapped to
							// columns that share the same name as the
							// properties themselves.

	@OneToMany(mappedBy = "category", fetch = FetchType.EAGER)
	private Collection<Review> reviews;

	protected Category() {
	}

	public Category(String title, Collection<Review> reviews) {
		this.title = title;
		this.reviews = reviews;
	}
}

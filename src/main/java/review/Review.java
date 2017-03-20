package review;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity // The Category class is annotated with @Entity, indicating that it is a
// JPA entity
public class Review {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	String title;
	String image;
	String content;

	@ManyToOne
	private Category category;

	private Review() {

	}

	public Review(String title, String image, String content) {
		this.title = title;
		this.image = image;
		this.content = content;
	}

	private Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getImage() {
		return image;
	}

	public Category getCategory() {
		return category;
	}

	public String getContent() {
		return content;
	}

}

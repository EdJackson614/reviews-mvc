package review;

public class Review {

	long id;
	String title;
	String image;
	String category;
	String content;
	String rating;

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @return the rating
	 */
	public String getRating() {
		return rating;
	}

	/**
	 * @param id
	 * @param title
	 * @param image
	 * @param category
	 * @param content
	 * @param rating
	 */
	public Review(long id, String title, String image, String category, String content, String rating) {
		super();
		this.id = id;
		this.title = title;
		this.image = image;
		this.category = category;
		this.content = content;
		this.rating = rating;
	}

}

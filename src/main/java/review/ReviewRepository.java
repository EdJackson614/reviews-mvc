package review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class ReviewRepository {
	

	Map<Long, Review> reviewMap; // this is our map

	/**
	 * this is a constructor
	 */
	public ReviewRepository() {
		long id1 = 42;
		long id2 = 32;
		long id3 = 55;
		long id4 = 37;
		long id5 = 62;
		long id6 = 73;
		long id7 = 47;
		long id8 = 73;

		Review review1 = new Review(42, "Creme Brulee", "/images/CremeBrulee.jpg", "Dessert", "Easy", "Excellent");
		Review review2 = new Review(32, "Apple Pie", "/images/ApplePie.jpg", "Dessert", "Difficult", "Good");
		Review review3 = new Review(55, "Sea Bass", "/images/SeaBass.jpg", "Seafood", "Medium", "Excellent");
		Review review4 = new Review(37, "Broccoli Salad", "/images/BrocoliSalad.jpg", "Salad", "Easy", "Fair");
		Review review5 = new Review(62, "MacnCheese", "/images/MacnCheese.jpg", "Side", "Medium", "Good");
		Review review6 = new Review(73, "Rotisserie Chicken", "/images/Rotisserie.jpg", "Poultry", "Easy", "Good");
		Review review7 = new Review(47, "Key Lime Pie", "/images/KeyLime.jpg", "Dessert", "Medium", "Good");
		Review review8 = new Review(73, "Grilled Salmon", "/images/GrilledSalmon.jpg", "Seafood", "Easy", "Good");

		reviewMap = new HashMap<>();
		// because reviewMap is a map we going to add keys(id) and values(review)
		// using put method
		reviewMap.put(id1, review1);
		reviewMap.put(id2, review2);
		reviewMap.put(id3, review3);
		reviewMap.put(id4, review4);
		reviewMap.put(id5, review5);
		reviewMap.put(id6, review6);
		reviewMap.put(id7, review7);
		reviewMap.put(id8, review8);

	}

	// this method returns collection of values from the map
	public Collection<Review> findAll() {
		return reviewMap.values();
	}

	// this returns only a Review
	public Review findOne(long id) {
		return reviewMap.get(id);
	}

}

package review;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class ReviewsController {

	@Resource
	private ReviewRepository repository;

	@RequestMapping("/reviews")
	public String showAll(Model model) {
		model.addAttribute("repository", repository.findAll());
		return "reviews";
	}

	@RequestMapping(value ="/review")
	public String review (@RequestParam long id, Model model){
		
		model.addAttribute("repository", repository.findOne(id));
		return "review";
	}

}

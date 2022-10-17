package kodlamaioNLayeredDemo.business.validationRules;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Category;


public class CategoryValidator {
	
	public static ValidationResult Validate(Category category,List<Category> categories) {
		
		if(category.getName().length()<=0) 
			return new ValidationResult(false,"Category Name can not be null !");
		if(categories.stream().anyMatch(c->c.getName()==category.getName())) 
			return new ValidationResult(false,"The Category already exist ! : " + category.getName());
		return new ValidationResult(true);
	}

}

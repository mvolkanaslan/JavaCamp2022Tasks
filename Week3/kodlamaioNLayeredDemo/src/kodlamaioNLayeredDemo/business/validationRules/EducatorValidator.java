package kodlamaioNLayeredDemo.business.validationRules;

import java.util.List;

import kodlamaioNLayeredDemo.entities.concrete.Educator;

public class EducatorValidator {
	
	public static ValidationResult Validate(Educator educator,List<Educator> educators) {
		
		if(educator.getFirstName().length()<=0 || educator.getLastName().length()<=0) 
			return new ValidationResult(false,"The Educator Name And Lastname can not be null !");
		return new ValidationResult(true);
		
	}

}

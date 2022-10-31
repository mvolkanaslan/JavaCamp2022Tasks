package KodlamaIODevs.KodlamaIODevs.business.Validations;

import KodlamaIODevs.KodlamaIODevs.entities.concrete.ProgrammingLanguage;

import java.util.List;

public class ProgrammingLanguageValidation {
    public static ValidationResult Validate(ProgrammingLanguage programmingLanguage, List<ProgrammingLanguage> programmingLanguages){
        System.out.println(programmingLanguage.getName());
        if(!(programmingLanguage.getName().length() > 0))
            return new ValidationResult(false,"Programming Language can not be null !");
        if(programmingLanguages.stream().anyMatch(p-> p.getName().equals(programmingLanguage.getName())))
            return new ValidationResult(false,"Programming Language is already exist !");
        return new ValidationResult(true);
    }
}

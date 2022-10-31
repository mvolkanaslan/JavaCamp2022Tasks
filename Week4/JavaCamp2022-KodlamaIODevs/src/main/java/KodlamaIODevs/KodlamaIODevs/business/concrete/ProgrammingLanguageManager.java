package KodlamaIODevs.KodlamaIODevs.business.concrete;

import KodlamaIODevs.KodlamaIODevs.business.Validations.ProgrammingLanguageValidation;
import KodlamaIODevs.KodlamaIODevs.business.Validations.ValidationResult;
import KodlamaIODevs.KodlamaIODevs.business.abstracts.ProgrammingLanguageService;
import KodlamaIODevs.KodlamaIODevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import KodlamaIODevs.KodlamaIODevs.entities.concrete.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service // Service bu class in dataaccess katmanina baglanana bir service oldugunu tanimlar
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

    private ProgrammingLanguageRepository programmingLanguageRepository;

    @Autowired
    public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
        this.programmingLanguageRepository = programmingLanguageRepository;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        ValidationResult validationResult = ProgrammingLanguageValidation.Validate(programmingLanguage,programmingLanguageRepository.getAll());
        if(validationResult.isResult()){
            programmingLanguageRepository.add(programmingLanguage);
        }
        else{
            System.out.println(validationResult.getMessage());
        }

    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        programmingLanguageRepository.delete(programmingLanguage);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ValidationResult validationResult = ProgrammingLanguageValidation.Validate(programmingLanguage,programmingLanguageRepository.getAll());
        if(validationResult.isResult()){
            programmingLanguageRepository.update(programmingLanguage);
        }
        else{
            System.out.println(validationResult.getMessage());
        }
    }

    @Override
    public ProgrammingLanguage getProgrammingLanguageById(int id) {
        return programmingLanguageRepository.getLanguageById(id);
    }


    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageRepository.getAll();
    }
}

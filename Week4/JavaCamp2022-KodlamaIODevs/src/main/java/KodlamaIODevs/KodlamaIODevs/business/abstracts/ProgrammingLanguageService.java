package KodlamaIODevs.KodlamaIODevs.business.abstracts;

import KodlamaIODevs.KodlamaIODevs.entities.concrete.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    void add(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getProgrammingLanguageById(int id);
    List<ProgrammingLanguage> getAll();

}

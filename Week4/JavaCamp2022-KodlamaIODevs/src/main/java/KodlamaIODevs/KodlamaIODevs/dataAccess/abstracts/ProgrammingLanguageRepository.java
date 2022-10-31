package KodlamaIODevs.KodlamaIODevs.dataAccess.abstracts;

import KodlamaIODevs.KodlamaIODevs.entities.concrete.ProgrammingLanguage;

import java.util.List;

// ProgrammingLanguage nesnesi icin soyut dataacess katmanidir. Bu LanguageDao olarak da adlandirilan Interface base sinifidir.
//Dataaccess islemleri icin methodlarin imzalarini belirlenir.
public interface ProgrammingLanguageRepository {
    void add(ProgrammingLanguage programmingLanguage);
    void delete(ProgrammingLanguage programmingLanguage);
    void update(ProgrammingLanguage programmingLanguage);
    ProgrammingLanguage getLanguageById(int id);
    List<ProgrammingLanguage> getAll();
}
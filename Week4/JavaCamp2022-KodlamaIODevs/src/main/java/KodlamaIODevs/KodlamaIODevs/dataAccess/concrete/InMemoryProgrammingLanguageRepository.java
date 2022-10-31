package KodlamaIODevs.KodlamaIODevs.dataAccess.concrete;

//    @Repository : Spring 2.0 ile Spring dünyasına girmiştir.
//    Database ile ilgili işlemleri yaptığımız Dao katmanındaki class’ların tepesinde kullanırız.
//    Bu annotation @Component’in özelleştirilmiş hali olarak düşünebiliriz.
//    Bu sınıfın dataAccess sınıfı oldugunu tanımlar

import KodlamaIODevs.KodlamaIODevs.dataAccess.abstracts.ProgrammingLanguageRepository;
import KodlamaIODevs.KodlamaIODevs.entities.concrete.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {
    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);
    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage programmingLanguageToDelete =   this.programmingLanguages.stream().filter(l->l.getId()== programmingLanguage.getId()).findFirst().get();
        programmingLanguages.remove(programmingLanguageToDelete);
    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        System.out.println("Update : " + programmingLanguage.getName());
        ProgrammingLanguage programmingLanguageToUpdate =   this.programmingLanguages.stream().filter(l->l.getId()==programmingLanguage.getId()).findFirst().get();
        programmingLanguageToUpdate.setName(programmingLanguage.getName());
    }

    @Override
    public ProgrammingLanguage getLanguageById(int id) {
        return this.programmingLanguages.stream().filter(l->l.getId()==id).findFirst().get();
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }
}
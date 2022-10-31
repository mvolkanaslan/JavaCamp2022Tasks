package KodlamaIODevs.KodlamaIODevs.wepApi.controllers;


import KodlamaIODevs.KodlamaIODevs.business.abstracts.ProgrammingLanguageService;
import KodlamaIODevs.KodlamaIODevs.entities.concrete.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programminglanguages") // domain/api/programminglanguages
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    @Autowired
    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }


    @PostMapping("/add")
    public void add(ProgrammingLanguage programmingLanguage){
        programmingLanguageService.add(programmingLanguage);
    }
    @PostMapping("/update")
    public void update(ProgrammingLanguage programmingLanguage){
        programmingLanguageService.update(programmingLanguage);
    }
    @PostMapping("/delete")
    public void delete(ProgrammingLanguage programmingLanguage){
        programmingLanguageService.delete(programmingLanguage);
    }
    @GetMapping("/getall")
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageService.getAll();
    }
    @GetMapping("/getById")
    public ProgrammingLanguage getById(int id){
        return programmingLanguageService.getProgrammingLanguageById(id);
    }



}
